package com.xworkz.smartclinic.servlet;

import com.xworkz.smartclinic.dto.AppointmentDto;
import com.xworkz.smartclinic.repository.AppointmentRepository;
import com.xworkz.smartclinic.repository.AppointmentRepositoryImpl;
import com.xworkz.smartclinic.service.AppointmentService;
import com.xworkz.smartclinic.service.AppointmentServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/appointment")
public class AppointmentServlet extends HttpServlet {

    private AppointmentService appointmentService;
    public AppointmentServlet()
    {
        System.out.println("Appointment servlet constructor");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Init method in Appointment servlet");
        AppointmentRepository appointmentRepository=new AppointmentRepositoryImpl();
        appointmentService=new AppointmentServiceImpl(appointmentRepository);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in appointment servlet");

        String patientName = req.getParameter("patientName");
        String date = req.getParameter("date");
        String timeSlot = req.getParameter("timeSlot");
        String doctorName = req.getParameter("doctorName");

        AppointmentDto appointmentDto = new AppointmentDto();
        appointmentDto.setPatientName(patientName);
        appointmentDto.setDate(date);
        appointmentDto.setTimeSlot(timeSlot);
        appointmentDto.setDoctorName(doctorName);

        boolean save = appointmentService.save(appointmentDto);

        RequestDispatcher requestDispatcher;
       if(save) {
           requestDispatcher = req.getRequestDispatcher("appointment-success.jsp");
           req.setAttribute("appointmentDto", appointmentDto);
       }
       else {
           requestDispatcher=req.getRequestDispatcher("appointment.jsp");
           req.setAttribute("message","Details not saved");
       }
        requestDispatcher.forward(req,resp);

    }
}
