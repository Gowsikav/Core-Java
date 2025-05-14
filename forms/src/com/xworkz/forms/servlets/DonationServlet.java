package com.xworkz.forms.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/donation")
public class DonationServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String firstName=servletRequest.getParameter("firstName");
        String lastName=servletRequest.getParameter("lastName");
        String email=servletRequest.getParameter("email");
        String amount=servletRequest.getParameter("amount");
        String cause=servletRequest.getParameter("cause");

        System.out.println("FirstName: "+firstName);
        System.out.println("LastName: "+lastName);
        System.out.println("Email: "+email);
        System.out.println("Amount: "+amount);
        System.out.println("Cause: "+cause);

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("DonationSuccess.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
