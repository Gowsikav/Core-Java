package com.xworkz.forms.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/license")
public class LicenseServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String licenseNumber=servletRequest.getParameter("licenseNumber");
        String name=servletRequest.getParameter("name");
        String type=servletRequest.getParameter("type");
        String issuedDate=servletRequest.getParameter("issuedDate");
        String expiryDate=servletRequest.getParameter("expiryDate");

        System.out.println("LicenseServlet Number: "+licenseNumber);
        System.out.println("LicenseServlet Holder: "+name);
        System.out.println("LicenseServlet Type: "+type);
        System.out.println("LicenseServlet IssuedDate: "+issuedDate);
        System.out.println("LicenseServlet ExpiryDate: "+expiryDate);

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("LicenseSuccess.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);


    }
}
