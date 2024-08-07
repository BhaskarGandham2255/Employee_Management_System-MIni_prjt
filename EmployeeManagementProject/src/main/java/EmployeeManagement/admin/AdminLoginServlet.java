package EmployeeManagement.admin;


import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet("/adminLogin")
public class AdminLoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
			throws IOException,ServletException
	{
		String uname=req.getParameter("uName");
		String pword=req.getParameter("uPword");
	   AdminBean ab= new AdminLoginDAO().check(uname, pword);
	   if(ab==null)
	   {
		   req.setAttribute("msg", "Invalid user");
		   req.getRequestDispatcher("invalidLogin.jsp").forward(req, res);
	   }
	   else
	   {
		   HttpSession hs=req.getSession();
		   hs.setAttribute("abean", ab);
		   
		   req.getRequestDispatcher("adminLogin.jsp").forward(req, res);
	   }
	}
}