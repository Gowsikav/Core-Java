package com.xworkz.furniture.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/furniture" ,loadOnStartup = 1)
public class FurnitureServlet extends HttpServlet {
    public FurnitureServlet()
    {
        System.out.println("FurnitureServlet Constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Post method in furniture servlet");

        String brand=req.getParameter("brand");
        String size=req.getParameter("size");
        String material=req.getParameter("material");
        String modelName=req.getParameter("modelName");
        String productBenefits=req.getParameter("productBenefits");

        RequestDispatcher  requestDispatcher=req.getRequestDispatcher("furniture-success.jsp");
        req.setAttribute("brand",brand);
        req.setAttribute("size",size);
        req.setAttribute("material",material);
        req.setAttribute("modelName",modelName);
        req.setAttribute("productBenefits",productBenefits);

        requestDispatcher.forward(req,resp);
    }
}
