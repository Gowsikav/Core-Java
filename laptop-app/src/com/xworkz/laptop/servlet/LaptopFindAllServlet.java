package com.xworkz.laptop.servlet;

import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.service.LaptopService;
import com.xworkz.laptop.service.LaptopServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/find")
public class LaptopFindAllServlet extends HttpServlet {

    public LaptopFindAllServlet()
    {
        System.out.println("LaptopFindAllServlet constructor");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in LaptopFindAllServlet");

        LaptopService laptopService=new LaptopServiceImpl();
        LaptopDto[] laptopDto= laptopService.findAll();

        for(LaptopDto laptop:laptopDto)
        {
            if(laptop!=null) {
                System.out.println(laptop);
            }else
                break;
        }
        RequestDispatcher requestDispatcher=requestDispatcher= req.getRequestDispatcher("index.jsp");
        if(laptopDto!=null) {
            req.setAttribute("message", "Details found");
        }else {
            req.setAttribute("message", "Details not found");
        }
        requestDispatcher.forward(req,resp);
    }
}
