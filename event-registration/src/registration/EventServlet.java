package registration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit")
public class EventServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String name=servletRequest.getParameter("name");
        String email=servletRequest.getParameter("email");
        String event=servletRequest.getParameter("event");
        String n_ticket=servletRequest.getParameter("tickets");
        int numberTickets=0;
        if(n_ticket!=null && n_ticket!="")
        {
            numberTickets=Integer.parseInt(n_ticket);
        }

        String t_price=servletRequest.getParameter("ticketprice");
        int ticketPrice=0;
        if(t_price!=null && t_price!="")
        {
            ticketPrice=Integer.parseInt(t_price);
        }
        int payableAmount=ticketPrice*numberTickets;

        System.out.println("Name: "+name);
        System.out.println("Email id: "+email);
        System.out.println("Event Name: "+event);
        System.out.println("Ticket Price: "+ticketPrice);
        System.out.println("No of tickets: "+numberTickets);
        System.out.println("Payable Price: "+payableAmount);

        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();

        writer.println("<h1 class='text-success mb-4'><strong>Thanks for Event Registration</strong></h1>");
        writer.println("<h4><strong>Name:</strong> " + name + "</h4>");
        writer.println("<h4><strong>Email:</strong> " + email + "</h4>");
        writer.println("<h4><strong>Event Name:</strong> " + event + "</h4>");
        writer.println("<h4><strong>Ticket Price:</strong> Rs:" + ticketPrice + "/-</h4>");
        writer.println("<h4><strong>No. of Tickets:</strong> " + numberTickets + "</h4>");
        writer.println("<hr>");
        writer.println("<h3 class='text-primary'>Payable Amount: Rs:" + payableAmount + "/-</h3>");


    }
}
