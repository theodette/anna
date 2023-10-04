package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet{
	public void service( HttpServletRequest req,HttpServletResponse res) {
		String loggeduser = (String) req.getAttribute("user");
		
		
		
	}

}
