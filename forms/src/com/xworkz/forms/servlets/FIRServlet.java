package com.xworkz.forms.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/FIR")
public class FIRServlet extends HttpServlet {

    public FIRServlet()
    {
        System.out.println("FIR Servlet constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in FIR servlet");

        String firNumber=req.getParameter("firNumber");
        String firDate=req.getParameter("firDate");
        String policeStation=req.getParameter("policeStation");
        String complainantName=req.getParameter("complainantName");
        String details=req.getParameter("details");

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("FIRSuccess.jsp");
        req.setAttribute("firNumber",firNumber);
        req.setAttribute("firDate",firDate);
        req.setAttribute("policeStation",policeStation);
        req.setAttribute("complainantName",complainantName);
        req.setAttribute("details",details);
        requestDispatcher.forward(req,resp);

    }
}
