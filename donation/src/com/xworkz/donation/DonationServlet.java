package com.xworkz.donation;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/donate")
public class DonationServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String amount=servletRequest.getParameter("amount");
        String cause=servletRequest.getParameter("cause");
        String email=servletRequest.getParameter("email");
        System.out.println("Donor Name: "+name);
        System.out.println("Amount: "+amount);
        System.out.println("Cause: "+cause);
        System.out.println("Email: "+email);

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("DonationSuccess.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
