package booking;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/book")
public class BookingServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String c_number=servletRequest.getParameter("contactnumber");
        long contactNumber=0;
        if(c_number!=null && c_number!="")
        {
            contactNumber=Long.parseLong(c_number);
        }
        String moviename=servletRequest.getParameter("moviename");
        String language=servletRequest.getParameter("language");
        String t_price=servletRequest.getParameter("ticketprice");
        int ticketPrice=0;
        if(t_price!=null && t_price!="")
        {
            ticketPrice=Integer.parseInt(t_price);
        }
        String n_ticket=servletRequest.getParameter("numberoftickets");
        int numberTickets=0;
        if(n_ticket!=null && n_ticket!="")
            numberTickets=Integer.parseInt(n_ticket);

        int payablePrice=ticketPrice*numberTickets;

        System.out.println("Name: "+name);
        System.out.println("Contact Number: "+contactNumber);
        System.out.println("Movie Name: "+moviename);
        System.out.println("Language: "+language);
        System.out.println("Ticket Price: "+ticketPrice);
        System.out.println("Number of Tickets: "+numberTickets);
        System.out.println("Total Amount: "+payablePrice);

        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();

        writer.println("<h4><strong>Name:</strong> " + name + "</h4>");
        writer.println("<h4><strong>Contact Number:</strong> " + contactNumber + "</h4>");
        writer.println("<h4><strong>Movie Name:</strong> " + moviename + "</h4>");
        writer.println("<h4><strong>Language:</strong> " + language + "</h4>");
        writer.println("<h4><strong>Ticket Price:</strong> Rs:" + ticketPrice+ "/-</h4>");
        writer.println("<h4><strong>No. of Tickets:</strong> " + numberTickets+ "</h4>");
        writer.println("<hr>");
        writer.println("<h3 class='text-primary'>Payable Amount: Rs:" + payablePrice + "/-</h3>");

    }
}
