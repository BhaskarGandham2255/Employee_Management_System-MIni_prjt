package EmployeeManagement.admin;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;


@SuppressWarnings("serial")
@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet
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
			int k=new DeleteEmployeeDAO().deleteEmployee(eid);
			if(k==0)	
			{
				req.setAttribute("msg", "Record not Found...");
				req.setAttribute("value", "fail");
				req.getRequestDispatcher("deleteEmployee.jsp").forward(req, res);
			}
			else
			{
				req.setAttribute("msg", "Record deleted successfully...");
				req.setAttribute("value", "success");
				req.getRequestDispatcher("deleteEmployee.jsp").forward(req, res);
			}
		}
		
	}
}
