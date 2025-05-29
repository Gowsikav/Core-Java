package com.xworkz.smartclinic.servlet;

import com.xworkz.smartclinic.dto.RegisterDto;
import com.xworkz.smartclinic.repository.RegisterRepository;
import com.xworkz.smartclinic.repository.RegisterRepositoryImpl;
import com.xworkz.smartclinic.service.RegisterService;
import com.xworkz.smartclinic.service.RegisterServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

    private RegisterService registerService;
    public RegisterServlet() {
        System.out.println("RegisterServlet constructor");
    }

    @Override
    public void init() throws ServletException {
        RegisterRepository registerRepository=new RegisterRepositoryImpl();
        registerService=new RegisterServiceImpl(registerRepository);
        System.out.println("Init method in Register Servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost Method in Register Servlet");

        String fullName = req.getParameter("fullName");
        String date = req.getParameter("date");
        String phoneNumberStr = req.getParameter("phoneNumber");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String address = req.getParameter("address");

        long phoneNumber = 0;
        if (phoneNumberStr != null && !phoneNumberStr.isEmpty()) {
            phoneNumber = Long.parseLong(phoneNumberStr);
        }
        else {
            System.err.println("Invalid Phone Number");
        }

        RegisterDto registerDto = new RegisterDto();
        registerDto.setFullName(fullName);
        registerDto.setDate(date);
        registerDto.setPhoneNumber(phoneNumber);
        registerDto.setEmail(email);
        registerDto.setPassword(password);
        registerDto.setConfirmPassword(confirmPassword);
        registerDto.setAddress(address);

        boolean save = registerService.save(registerDto);

        RequestDispatcher requestDispatcher;
        if (save)
        {
            requestDispatcher = req.getRequestDispatcher("register-success.jsp");
            req.setAttribute("registerDto", registerDto);
        }
        else {
            requestDispatcher = req.getRequestDispatcher("register.jsp");
            req.setAttribute("message", "Details not saved");
        }
        requestDispatcher.forward(req,resp);

    }
}
