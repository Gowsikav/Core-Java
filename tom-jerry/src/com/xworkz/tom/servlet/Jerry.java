package com.xworkz.tom.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/dry",loadOnStartup = 1)
public class Jerry extends GenericServlet {

    public Jerry()
    {
        System.out.println("Jerry constructor...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service running in jerry...");
    }
}
