package com.xworkz.forms.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/license")
public class LicenseServlet extends HttpServlet {

    public LicenseServlet()
    {
        System.out.println("License Servlet constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in License Servlet");
        String licenseNumber=req.getParameter("licenseNumber");
        String name=req.getParameter("name");
        String type=req.getParameter("type");
        String issuedDate=req.getParameter("issuedDate");
        String expiryDate=req.getParameter("expiryDate");

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("LicenseSuccess.jsp");
        req.setAttribute("licenseNumber",licenseNumber);
        req.setAttribute("name",name);
        req.setAttribute("type",type);
        req.setAttribute("issuedDate",issuedDate);
        req.setAttribute("expiryDate",expiryDate);
        requestDispatcher.forward(req,resp);


    }
}
