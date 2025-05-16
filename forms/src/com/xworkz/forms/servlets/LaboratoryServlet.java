package com.xworkz.forms.servlets;

import com.xworkz.forms.dto.LaboratoryDto;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/laboratory")
public class LaboratoryServlet extends HttpServlet {

    public LaboratoryServlet()
    {
        System.out.println("Laboratory servlet constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in Laboratory servlet");
        String labName=req.getParameter("labName");
        String technicianName=req.getParameter("techName");
        String testName=req.getParameter("testName");
        String testDate=req.getParameter("testDate");
        String result=req.getParameter("result");

        LaboratoryDto laboratoryDto=new LaboratoryDto();
        laboratoryDto.setLabName(labName);
        laboratoryDto.setTechnicianName(technicianName);
        laboratoryDto.setTestName(testName);
        laboratoryDto.setTestDate(testDate);
        laboratoryDto.setResult(result);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("LaboratorySuccess.jsp");
    req.setAttribute("laboratoryDto",laboratoryDto);
        requestDispatcher.forward(req,resp);
    }
}
