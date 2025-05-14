package com.xworkz.forms.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/feedback")
public class FeedBackServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String name =servletRequest.getParameter("name");
        String email =servletRequest.getParameter("email");
        String rating =servletRequest.getParameter("rating");
        String comments =servletRequest.getParameter("comments");

        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Rating: "+rating);
        System.out.println("Comments: "+comments);

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("FeedbackSuccess.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);

    }
}
