package com.xworkz.forms.servlets;

import com.xworkz.forms.dto.FeedBackDto;
import com.xworkz.forms.service.FeedBackService;
import com.xworkz.forms.service.FeedBackServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/feedback")
public class FeedBackServlet extends HttpServlet {

    public FeedBackServlet()
    {
        System.out.println("FeedBackServlet Constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost Method in Feedback Servlet");

        String name =req.getParameter("name");
        String email =req.getParameter("email");
        String rating =req.getParameter("rating");
        String comments =req.getParameter("comments");

        FeedBackDto feedBackDto=new FeedBackDto();
        feedBackDto.setName(name);
        feedBackDto.setEmail(email);
        feedBackDto.setRating(rating);
        feedBackDto.setComments(comments);

        FeedBackService feedBackService=new FeedBackServiceImpl();
        boolean flag=feedBackService.save(feedBackDto);

        if(flag) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("FeedbackSuccess.jsp");
            req.setAttribute("feedBackDto", feedBackDto);
            requestDispatcher.forward(req, resp);
        }
        else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("Feedback.jsp");
            req.setAttribute("feedBackDto", feedBackDto);
            requestDispatcher.forward(req, resp);
        }
    }
}
