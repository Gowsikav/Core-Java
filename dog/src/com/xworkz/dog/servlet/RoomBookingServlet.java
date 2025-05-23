package com.xworkz.dog.servlet;

import com.xworkz.dog.dto.RoomBookingDto;
import com.xworkz.dog.service.RoomBookingService;
import com.xworkz.dog.service.RoomBookingServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/book")
public class RoomBookingServlet extends HttpServlet {
    public RoomBookingServlet()
    {
        System.out.println("Room booking servlet constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in Room booking servlet");

        String hotelName=req.getParameter("hotelName");
        String roomType=req.getParameter("type");
        String numberOfDaysStr=req.getParameter("numberOfDays");
        int numberOfDays=0;
        if(numberOfDaysStr!=null && !numberOfDaysStr.isEmpty())
        {
            numberOfDays=Integer.parseInt(numberOfDaysStr);
        }
        else {
            System.out.println("Number of days is invalid");
        }
        String arrivalDate=req.getParameter("arrivalDate");
        String checkOutDate=req.getParameter("checkOutDate");

        RoomBookingDto roomBookingDto=new RoomBookingDto();
        roomBookingDto.setHotelName(hotelName);
        roomBookingDto.setRoomType(roomType);
        roomBookingDto.setNumberOfDays(numberOfDays);
        roomBookingDto.setArrivalDate(arrivalDate);
        roomBookingDto.setCheckOutDate(checkOutDate);

        RoomBookingService roomBookingService=new RoomBookingServiceImpl();
        boolean saved=roomBookingService.save(roomBookingDto);
        RequestDispatcher requestDispatcher;
        if(saved) {
            requestDispatcher = req.getRequestDispatcher("room-book-success.jsp");
            req.setAttribute("roomBookingDto", roomBookingDto);
        }
        else
        {
            requestDispatcher = req.getRequestDispatcher("room-book.jsp");
            req.setAttribute("message","Details not saved");
        }
        requestDispatcher.forward(req,resp);
    }
}
