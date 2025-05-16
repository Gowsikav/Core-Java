package com.xworkz.forms.servlets;

import com.xworkz.forms.dto.FIRDto;

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

        FIRDto firDto=new FIRDto();
        firDto.setFirNumber(firNumber);
        firDto.setFirDate(firDate);
        firDto.setPoliceStation(policeStation);
        firDto.setComplainantName(complainantName);
        firDto.setDetails(details);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("FIRSuccess.jsp");
        req.setAttribute("firDto",firDto);
        requestDispatcher.forward(req,resp);

    }
}
