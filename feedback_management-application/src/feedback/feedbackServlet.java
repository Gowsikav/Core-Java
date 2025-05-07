package feedback;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit")
public class feedbackServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
        System.out.println("Service method in servlet");
        String name=servletRequest.getParameter("name");
        String email=servletRequest.getParameter("email");
        String contactNumber=servletRequest.getParameter("contact");
        String feedback=servletRequest.getParameter("feedback");

        System.out.println("Name: "+name);
        System.out.println("E-mail: "+email);
        System.out.println("Contact Number: "+contactNumber);
        System.out.println("Feedback: "+feedback);

        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();
        writer.println(name+" thanks for submitting the feedback");
    }
}
