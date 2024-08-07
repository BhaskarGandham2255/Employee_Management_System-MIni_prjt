package EmployeeManagement.admin;


import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/logoutAdmin")
public class AdminLogoutServlet extends HttpServlet
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
			hs.removeAttribute("abean");
			hs.removeAttribute("alist");
			
			req.setAttribute("msg", "Admin Logout successfully");
			req.getRequestDispatcher("AdminLogout.jsp").forward(req, res);
		}
	}
}
