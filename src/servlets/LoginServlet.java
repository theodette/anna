package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	public void service( HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String userName = req.getParameter("username");
		String password = req.getParameter("password");
		
		
		PrintWriter out = res.getWriter();
		if( userName == "ishimwe" && password =="12345") {
			
			RequestDispatcher rd = req.getRequestDispatcher("user");
			rd.forward(req, res);
			req.setAttribute("user", "userName");
			
		}else {
			res.sendRedirect("login.html");
			out.println("<script type=\"text/javascript\">");
			   out.println("alert('Username or password incorrect');");
			   out.println("location='login.html';");
			   out.println("</script>");
			   
		}
		
		
	}

}
