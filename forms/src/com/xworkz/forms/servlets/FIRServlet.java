package com.xworkz.forms.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/FIR")
public class FIRServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String firNumber=servletRequest.getParameter("firNumber");
        String firDate=servletRequest.getParameter("firDate");
        String policeStation=servletRequest.getParameter("policeStation");
        String complainantName=servletRequest.getParameter("complainantName");
        String details=servletRequest.getParameter("details");

        System.out.println("FIRServlet Number: "+firNumber);
        System.out.println("FIRServlet Date: "+firDate);
        System.out.println("Police Station: "+policeStation);
        System.out.println("Complainant Name: "+complainantName);
        System.out.println("Details: "+details);

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("FIRSuccess.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);

    }
}
