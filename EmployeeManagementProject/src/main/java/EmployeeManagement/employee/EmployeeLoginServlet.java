package EmployeeManagement.employee;
import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/employeeLogin")
public class EmployeeLoginServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
			throws ServletException,IOException
	{
			String uName=req.getParameter("uName");
			String uPword=req.getParameter("uPword");
			EmployeeBean eb=new EmployeeDAO().check(uName, uPword);
			if(eb==null)
			{
				req.setAttribute("msg",	"Invalid Employee");
				req.getRequestDispatcher("invalidEmployeeLogin.jsp").forward(req, res);
			}
			else
			{
//				HttpSession hs=req.getSession();
//				hs.setAttribute("eBean", eb);
				req.setAttribute("eBean", eb);
				req.getRequestDispatcher("EmployeeLogin.jsp").forward(req, res);
			}
		
		
	}
}
