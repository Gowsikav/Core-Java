package com.xworkz.hospital.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/contact")
public class Contact extends GenericServlet {

    public Contact()
    {
        System.out.println("Contact constructor");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("service method in contact");
        String firstName=servletRequest.getParameter("firstName");
        String lastName=servletRequest.getParameter("lastName");
        String emailId=servletRequest.getParameter("email");
        String message=servletRequest.getParameter("message");

        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();

        writer.println("<h2>FirstName: "+firstName+"<h2>");
        writer.println("<h2>LastName: "+lastName+"<h2>");
        writer.println("<h2>E-mail ID: "+emailId+"<h2>");
        writer.println("<h2>Message: "+message+"<h2>");
        writer.println("<h1>Your message sent successfully");
    }
}
