package com.xworkz.forms.servlets;

import com.xworkz.forms.dto.DonationDto;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/donation")
public class DonationServlet extends HttpServlet {
    public DonationServlet()
    {
        System.out.println("DonationServlet Constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doPost method in DonationServlet");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String amount = req.getParameter("amount");
        String cause = req.getParameter("cause");

        DonationDto donationDto=new DonationDto();
        donationDto.setFirstName(firstName);
        donationDto.setLastName(lastName);
        donationDto.setEmail(email);
        donationDto.setAmount(amount);
        donationDto.setCause(cause);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("DonationSuccess.jsp");
        req.setAttribute("donationDto",donationDto);
        requestDispatcher.forward(req, resp);
    }
}
