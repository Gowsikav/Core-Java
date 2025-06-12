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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@WebServlet(urlPatterns="/laptop")
public class LaptopServlet extends HttpServlet {
    public LaptopServlet()
    {
        System.out.println("Laptop servlet constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in laptop servlet");

        String brand=req.getParameter("brand");
        String model=req.getParameter("model");
        String priceStr=req.getParameter("price");
        String isAvailableStr=req.getParameter("isAvailable");
        String warranty=req.getParameter("warranty");
        String manufacturedDateStr=req.getParameter("manufacturedDate");

        double price=0;
        if(priceStr!=null && !priceStr.isEmpty())
        {
            price=Double.parseDouble(priceStr);
        }

        boolean isAvailable=false;
        if(isAvailableStr!=null && !isAvailableStr.isEmpty())
        {
           isAvailable="yes".equalsIgnoreCase(isAvailableStr);
        }


        LocalDate manufacturedDate=null;
        try {
            if (manufacturedDateStr != null && !manufacturedDateStr.isEmpty()) {
                manufacturedDate = LocalDate.parse(manufacturedDateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            }
        }
        catch (DateTimeParseException e)
        {
            System.out.println(e.getMessage());
        }

        LaptopDto laptopDto=new LaptopDto(brand,model,price,isAvailable,warranty,manufacturedDate);

        LaptopService laptopService=new LaptopServiceImpl();
        boolean saved=laptopService.save(laptopDto);
        System.out.println("Result: "+saved);

        RequestDispatcher requestDispatcher;
        if(saved)
        {
            requestDispatcher=req.getRequestDispatcher("laptop-success.jsp");
            req.setAttribute("message","Details saved");
            req.setAttribute("laptopDto",laptopDto);
        }
        else {
            requestDispatcher=req.getRequestDispatcher("laptop-details.jsp");
            req.setAttribute("message","Details Incorrect");
        }
        requestDispatcher.forward(req,resp);
    }
}
