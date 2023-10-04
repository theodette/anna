package servlets;

import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;;

import com.sun.xml.internal.fastinfoset.sax.*;;

public class AdmitionServlet extends HttpServlet
{
	
	
public void doPost(HttpServletRequest req, HttpServletResponse res) {
	String toEmail = req.getParameter("email");
    String subject = "welcome to basketball";
    String messageText = "your submition recieved sucefully";
    
    String fromEmail = "annatheodette@gmail.com";
    String password = "your-password";
    
    Properties properties = new Properties();
    properties.put("mail.smtp.auth", "true");
    properties.put("mail.smtp.starttls.enable", "true");
    properties.put("mail.smtp.host", "smtp.gmail.com");
    properties.put("mail.smtp.port", "587");
    
    Session session = Session.getInstance(properties, new Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(fromEmail, password);
        }
    });
    try {
        // Create a MimeMessage object
        MimeMessage message = new MimeMessage(session);

        // Set the from address
        message.setFrom(new InternetAddress("annatheodette@gmail.com");

        // Set the to address
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

        // Set email subject
        message.setSubject(subject);

        // Set email content
        message.setText(messageText);

        // Send the email
        Transport.send(message);

        // Redirect to a success page
        response.sendRedirect("index.html");
    } catch (MessagingException mex) {
        mex.printStackTrace();
        // Redirect to an error page
        response.sendRedirect("admition.html");
    }
}
}

}
