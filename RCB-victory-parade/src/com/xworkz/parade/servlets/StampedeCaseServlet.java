package com.xworkz.parade.servlets;

import com.xworkz.parade.dto.StampedeCaseDto;
import com.xworkz.parade.service.StampedeCaseService;
import com.xworkz.parade.service.StampedeCaseServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/case")
public class StampedeCaseServlet extends HttpServlet {
    public StampedeCaseServlet()
    {
        System.out.println("Stampede case Servlet constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in Stampede case Servlet");

        String event=req.getParameter("event");
        String location=req.getParameter("location");
        String deathsCountStr=req.getParameter("deathsCount");
        String injuriesCountStr=req.getParameter("injuriesCount");
        int deathsCount=0;
        if(deathsCountStr!=null && !deathsCountStr.isEmpty())
        {
            deathsCount=Integer.parseInt(deathsCountStr);
        }
        else {
            System.err.println("Deaths count is invalid");
        }
        int injuriesCount=0;
        if(injuriesCountStr!=null && !injuriesCountStr.isEmpty())
        {
            injuriesCount=Integer.parseInt(injuriesCountStr);
        }
        else {
            System.err.println("Injuries count is invalid");
        }

        StampedeCaseDto stampedeCaseDto=new StampedeCaseDto(event,location,deathsCount,injuriesCount);
        StampedeCaseService stampedeCaseService=new StampedeCaseServiceImpl();
        String result=stampedeCaseService.save(stampedeCaseDto);
        System.out.println("Result: "+result);
        RequestDispatcher requestDispatcher;
        if(result.equalsIgnoreCase("success"))
        {
            requestDispatcher=req.getRequestDispatcher("stampede-case-success.jsp");
            req.setAttribute("message","Details saved in database");
            req.setAttribute("stampedeCaseDto",stampedeCaseDto);
        }
        else {
            requestDispatcher=req.getRequestDispatcher("stampede-case.jsp");
            req.setAttribute("message","Wrong Details");
        }
        requestDispatcher.forward(req,resp);
    }
}
