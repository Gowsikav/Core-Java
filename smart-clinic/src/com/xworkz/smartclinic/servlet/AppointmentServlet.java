package com.xworkz.smartclinic.servlet;

import com.xworkz.smartclinic.dto.AppointmentDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/appointment")
public class AppointmentServlet extends HttpServlet {
    public AppointmentServlet()
    {
        System.out.println("Appointment servlet constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in appointment servlet");

        String patientName =req.getParameter("patientName");
        String date=req.getParameter("date");
        String timeSlot=req.getParameter("timeSlot");
        String doctorName=req.getParameter("doctorName");

        AppointmentDto appointmentDto=new AppointmentDto();
        appointmentDto.setPatientName(patientName);
        appointmentDto.setDate(date);
        appointmentDto.setTimeSlot(timeSlot);
        appointmentDto.setDoctorName(doctorName);
        System.out.println(appointmentDto);

        RequestDispatcher requestDispatcher;
        requestDispatcher=req.getRequestDispatcher("appointment-success.jsp");
        req.setAttribute("appointmentDto",appointmentDto);
        requestDispatcher.forward(req,resp);
        System.out.println("success");
    }
}
