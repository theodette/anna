package servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForgotPServlet extends HttpServlet
{
	
	public void  service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	
		String email = req.getParameter("Email");
		if(email!= null) {
			res.sendRedirect("index.html");
		}
	}

}
