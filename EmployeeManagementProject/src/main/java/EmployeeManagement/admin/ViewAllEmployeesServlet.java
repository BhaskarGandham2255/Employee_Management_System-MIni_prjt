package EmployeeManagement.admin;

import java.io.IOException;
import java.util.ArrayList;

import EmployeeManagement.employee.EmployeeBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/viewAllEmployees")
public class ViewAllEmployeesServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)
			throws IOException,ServletException
		{
			HttpSession hs=req.getSession(false);
			if(hs==null)
			{
				req.getRequestDispatcher("sessionTimeOut.jsp").forward(req, res);
			}
			else
			{
				ArrayList<EmployeeBean> al=new ViewAllEmployeesDAO().viewAll();
				if(al==null)
				{
					req.setAttribute("msg","NO DATA FOUND" );
					req.getRequestDispatcher("ViewAllEmployees.jsp").forward(req, res);
				}
				else
				{
					hs.setAttribute("alist", al);
					req.getRequestDispatcher("ViewAllEmployees.jsp").forward(req, res);
				}
			}
		}
}
