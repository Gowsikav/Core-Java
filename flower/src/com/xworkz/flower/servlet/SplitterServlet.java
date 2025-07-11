package com.xworkz.flower.servlet;

import com.xworkz.flower.dto.SplitterDTO;
import com.xworkz.flower.service.SplitterService;
import com.xworkz.flower.service.SplitterServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/split")
public class SplitterServlet extends HttpServlet {

    public SplitterServlet()
    {
        System.out.println("Splitter servlet constructor");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in servlet");

        String amountStr=req.getParameter("amount");
        String personCountstr=req.getParameter("personCount");

        double amount=0;
        if(amountStr!=null)
        {
            amount=Double.parseDouble(amountStr);
        }

        int personCount=0;
        if(personCountstr!=null)
        {
            personCount=Integer.parseInt(personCountstr);
        }

        SplitterDTO splitterDTO = new SplitterDTO(amount,personCount);

        SplitterService splitterService=new SplitterServiceImpl();
        double perPerson=splitterService.valid(splitterDTO);
        System.out.println(perPerson);

        RequestDispatcher requestDispatcher;
        if(perPerson==0)
        {
            requestDispatcher=req.getRequestDispatcher("Splitter.jsp");
            req.setAttribute("message","Invalid input");
        }
        else {
            requestDispatcher=req.getRequestDispatcher("SplitterSuccess.jsp");
            req.setAttribute("splitAmount", perPerson);
            req.setAttribute("people", personCount);
            req.setAttribute("totalAmount", amount);
        }
        requestDispatcher.forward(req,resp);
    }
}
