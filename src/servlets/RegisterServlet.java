package servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	public void  service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	
		String fname = req.getParameter("fname");
		String password1 = req.getParameter("password1");
		String password2 = req.getParameter("password2");
		
		if(fname!= null && password1 == password2) {
			res.sendRedirect("index.html");
		}
		
	}

}