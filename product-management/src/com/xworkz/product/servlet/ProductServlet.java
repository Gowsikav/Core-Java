package com.xworkz.product.servlet;

import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.exception.PriceCheck;
import com.xworkz.product.exception.ProductIDCheck;
import com.xworkz.product.exception.QuantityCheck;
import com.xworkz.product.service.ProductService;
import com.xworkz.product.service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    public ProductServlet() {
        System.out.println("ProductServlet Constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in ProductServlet");

        String productIdStr=req.getParameter("productID");
        int productID=0;
        if(productIdStr!=null && !productIdStr.isEmpty())
        {
            productID=Integer.parseInt(productIdStr);
        }
        else {
            throw new ProductIDCheck("Product id is null");
        }
        String quantityStr=req.getParameter("quantity");
        int quantity=0;
        if(quantityStr!=null && !quantityStr.isEmpty())
        {
            quantity=Integer.parseInt(quantityStr);
        }
        else {
            throw new QuantityCheck("Quantity is empty");
        }
        String priceStr=req.getParameter("price");
        double price=0;
        if(priceStr!=null && !priceStr.isEmpty())
        {
            price=Double.parseDouble(priceStr);
        }
        else {
            throw new PriceCheck("Price is empty");
        }

        ProductDto productDto=new ProductDto();
        productDto.setProductID(productID);
        productDto.setProductName(req.getParameter("productName"));
        productDto.setPrice(price);
        productDto.setQuantity(quantity);
        productDto.setCategory(req.getParameter("category"));

        ProductService productService=new ProductServiceImpl();
        boolean saved=productService.save(productDto);

        RequestDispatcher requestDispatcher;
        if(saved)
        {
            requestDispatcher=req.getRequestDispatcher("product-success.jsp");
            req.setAttribute("productDto",productDto);
        }
        else{
            requestDispatcher=req.getRequestDispatcher("product-details.jsp");
            req.setAttribute("message","Details not saved");
        }
        requestDispatcher.forward(req,resp);

    }
}
