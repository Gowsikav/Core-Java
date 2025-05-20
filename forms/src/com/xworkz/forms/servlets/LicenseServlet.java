package com.xworkz.forms.servlets;

import com.xworkz.forms.dto.LicenseDto;
import com.xworkz.forms.service.LicenseService;
import com.xworkz.forms.service.LicenseServiceImpl;

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

        LicenseDto licenseDto=new LicenseDto();
        licenseDto.setLicenseNumber(licenseNumber);
        licenseDto.setName(name);
        licenseDto.setType(type);
        licenseDto.setIssuedDate(issuedDate);
        licenseDto.setExpiryDate(expiryDate);

        LicenseService licenseService=new LicenseServiceImpl();
        boolean flag=licenseService.save(licenseDto);

        RequestDispatcher requestDispatcher;
        if(flag) {
            requestDispatcher = req.getRequestDispatcher("LicenseSuccess.jsp");
            req.setAttribute("licenseDto", licenseDto);
        }
        else {
            requestDispatcher = req.getRequestDispatcher("License.jsp");
            req.setAttribute("message","Details not saved");
        }
        requestDispatcher.forward(req, resp);
    }
}
