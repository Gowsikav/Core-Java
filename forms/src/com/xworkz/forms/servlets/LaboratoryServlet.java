package com.xworkz.forms.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/laboratory")
public class LaboratoryServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String labName=servletRequest.getParameter("labName");
        String technicianName=servletRequest.getParameter("techName");
        String testName=servletRequest.getParameter("testName");
        String testDate=servletRequest.getParameter("testDate");
        String result=servletRequest.getParameter("result");

        System.out.println("Lab Name: "+labName);
        System.out.println("Technician Name: "+technicianName);
        System.out.println("Test Name: "+testName);
        System.out.println("Test Date: "+testDate);
        System.out.println("Results: "+result);

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("LaboratorySuccess.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
