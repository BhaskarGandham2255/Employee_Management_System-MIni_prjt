package EmployeeManagement.admin;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@SuppressWarnings("serial")
@WebServlet("/editEmployeeDetails")
public class EditEmployeeServlet2 extends HttpServlet
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
			long sal=Long.parseLong(req.getParameter("sal"));
			int k=new EditEmployeeDAO().editEmployee(eid, ename, dept, sal);
			if(k==0)	
			{				
				req.setAttribute("msg", "Employee details NotUpdated...");
				req.setAttribute("value", "fail");
				req.getRequestDispatcher("UpdateEmployee.jsp").forward(req, res);
			}
			else
			{
				req.setAttribute("msg", "Employee details Updated...");
				req.setAttribute("value", "success");
				req.getRequestDispatcher("UpdateEmployee.jsp").forward(req, res);
			}
		}
	}
}
