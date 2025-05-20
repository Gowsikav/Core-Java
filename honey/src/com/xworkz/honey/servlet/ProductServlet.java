package com.xworkz.honey.servlet;

import com.xworkz.honey.dto.ProductDto;
import com.xworkz.honey.service.ProductService;
import com.xworkz.honey.service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    public ProductServlet()
    {
        System.out.println("Product Servlet Constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in product servlet");

        String productName=req.getParameter("productName");
        String type=req.getParameter("type");
        String incomingPrice=req.getParameter("incomingPrice");
        String sellingPrice=req.getParameter("sellingPrice");
        String marketPrice=req.getParameter("marketPrice");
        String description=req.getParameter("description");
        String brand=req.getParameter("brand");
        String quantity=req.getParameter("quantity");
        String color=req.getParameter("color");
        String weight=req.getParameter("weight");
        String manufacturingDate=req.getParameter("manufacturingDate");
        String warranty=req.getParameter("warranty");
        String returnPolicy=req.getParameter("returnPolicy");

        ProductDto productDto=new ProductDto();
        productDto.setProductName(productName);
        productDto.setType(type);
        productDto.setIncomingPrice(incomingPrice);
        productDto.setSellingPrice(sellingPrice);
        productDto.setMarketPrice(marketPrice);
        productDto.setDescription(description);
        productDto.setBrand(brand);
        productDto.setQuantity(quantity);
        productDto.setColor(color);
        productDto.setWeight(weight);
        productDto.setManufacturingDate(manufacturingDate);
        productDto.setWarranty(warranty);
        productDto.setReturnPolicy(returnPolicy);

        ProductService productService=new ProductServiceImpl();
        boolean flag=productService.save(productDto);

        RequestDispatcher requestDispatcher;
        if(flag)
        {
            requestDispatcher= req.getRequestDispatcher("product-success.jsp");
            req.setAttribute("productDto",productDto);
        }
        else {
            requestDispatcher= req.getRequestDispatcher("product.jsp");
            req.setAttribute("message","Details not saved");
        }
        requestDispatcher.forward(req,resp);

    }
}
