package EmployeeManagement.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import EmployeeManagement.employee.EmployeeBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/editEmployee")
public class EditEmployeeServlet extends HttpServlet
{
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
				String eid=req.getParameter("eid");
				ArrayList<EmployeeBean> al=(ArrayList<EmployeeBean>)hs.getAttribute("alist");
				Iterator<EmployeeBean> it=al.iterator();
				while(it.hasNext())
				{
					EmployeeBean eb=it.next();
					if(eb.getEid().equals(eid))
					{
						req.setAttribute("eb", eb);
						req.getRequestDispatcher("editEmployee.jsp").forward(req, res);						
					}
					
				}
		}
		
	}
}
