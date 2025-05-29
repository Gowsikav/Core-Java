package com.xworkz.furniture.servlet;

import com.xworkz.furniture.dto.FurnitureDto;
import com.xworkz.furniture.service.FurnitureServiceImpl;
import com.xworkz.furniture.service.FurnitureService;

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
        System.out.println("doPost method in furniture servlet");

        String brand=req.getParameter("brand");
        String size=req.getParameter("size");
        String material=req.getParameter("material");
        String modelName=req.getParameter("modelName");
        String productBenefits=req.getParameter("productBenefits");

        FurnitureDto furnitureDto=new FurnitureDto();
        furnitureDto.setBrand(brand);
        furnitureDto.setSize(size);
        furnitureDto.setMaterial(material);
        furnitureDto.setModelName(modelName);
        furnitureDto.setProductBenefits(productBenefits);

        FurnitureService furnitureService= new FurnitureServiceImpl();
        boolean flag= furnitureService.save(furnitureDto);

        RequestDispatcher requestDispatcher;
        if(flag)
        {
            requestDispatcher = req.getRequestDispatcher("furniture-success.jsp");
            req.setAttribute("furnitureDto",furnitureDto);
        }
        else
        {
            requestDispatcher = req.getRequestDispatcher("furniture.jsp");
            req.setAttribute("message","Details not saved");
        }
        requestDispatcher.forward(req,resp);
    }
}
