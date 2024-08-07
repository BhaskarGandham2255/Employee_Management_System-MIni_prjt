package EmployeeManagement.admin;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws IOException,ServletException
	{
		HttpSession hs=req.getSession(false);
		if(hs==null)
		{
			req.getRequestDispatcher("sessionTimeOut.jsp").forward(req, res);
		}
		else
		{
			String eid=req.getParameter("eid");
			String ename=req.getParameter("ename");
			String dept=req.getParameter("dept");
			String sal=req.getParameter("sal");
			String epword=req.getParameter("epword");
			
			int k=new AddEmployeesDAO().addEmployee(eid, ename, dept, sal,epword);
			if(k==0)	
			{
				req.setAttribute("msg", "Employee not Added...");
				req.getRequestDispatcher("addEmployee.jsp").forward(req, res);
			}
			else
			{
				req.setAttribute("msg", "Employee added successfully...");
				req.getRequestDispatcher("addEmployee.jsp").forward(req, res);
			}
		}
	}
}
