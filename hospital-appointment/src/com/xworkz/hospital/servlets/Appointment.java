package com.xworkz.hospital.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/appoint")
public class Appointment extends GenericServlet {

    public Appointment()
    {
        System.out.println("Appointment constructor");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
        System.out.println("Service method in appointment");
        String firstName=servletRequest.getParameter("firstName");
        String lastName=servletRequest.getParameter("lastName");
        String emailId=servletRequest.getParameter("email");
        String Age=servletRequest.getParameter("age");
        int age=0;
        if(Age!=null && Age!="")
        {
            age=Integer.parseInt(Age);
        }
        String address=servletRequest.getParameter("address");
        String gender=servletRequest.getParameter("gender");
        String sickness=servletRequest.getParameter("sickness");
        String c_Number=servletRequest.getParameter("contactNumber");
        long contactNumber=0;
        if(c_Number!=null && c_Number!="")
        {
            contactNumber=Long.parseLong(c_Number);
        }

        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();

        writer.println("<h2>FirstName: "+firstName+"<h2>");
        writer.println("<h2>LastName: "+lastName+"<h2>");
        writer.println("<h2>E-mail ID: "+emailId+"<h2>");
        writer.println("<h2>Age: "+age+"<h2>");
        writer.println("<h2>Address: "+address+"<h2>");
        writer.println("<h2>Gender: "+gender+"<h2>");
        writer.println("<h2>Sickness: "+sickness+"<h2>");
        writer.println("<h2>Contact Number: "+contactNumber+"<h2>");
        writer.println("<h1>We got your appointment request, we will sent you the timing soon</h1>");

    }
}
