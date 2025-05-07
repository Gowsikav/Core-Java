package validation;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit")
public class AadhaarServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
        System.out.println("service method in AadhaarServlet");
        String number=servletRequest.getParameter("number");
        System.out.println("Aadhaar number: "+number);

        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();
        if(number.length()==12)
            writer.println("Aadhaar card number is valid");
        else
            writer.println("Aadhaar card number is not valid");
    }
}
