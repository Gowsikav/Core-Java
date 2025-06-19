package com.xworkz.talent.servlet;

import com.xworkz.talent.dto.TalentEventDto;
import com.xworkz.talent.service.TalentEventService;
import com.xworkz.talent.service.TalentEventServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = {"/talent","/find"})
public class TalentEventServlet extends HttpServlet {

    TalentEventService talentEventService=new TalentEventServiceImpl();

    public TalentEventServlet()
    {
        System.out.println("Talent event Servlet constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method in Talent event Servlet");

        String name=req.getParameter("name");
        String age=req.getParameter("age");
        String contactStr=req.getParameter("contact");
        String talentType=req.getParameter("talent");
        String description=req.getParameter("description");

        long contact=0;
        if(contactStr!=null && !contactStr.isEmpty())
        {
            contact=Long.parseLong(contactStr);
        }

        TalentEventDto talentEventDto=new TalentEventDto();
        talentEventDto.setName(name);
        talentEventDto.setAge(age);
        talentEventDto.setContact(contact);
        talentEventDto.setTalentType(talentType);
        talentEventDto.setDescription(description);

        if(talentEventService.save(talentEventDto))
        {
            req.setAttribute("successMessage","Details saved in DataBase");
        }
        else {
            req.setAttribute("failedMessage","Details not saved. Give correct details");
            req.setAttribute("talentEventDto",talentEventDto);
        }
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("Event.jsp");
        requestDispatcher.forward(req,resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet method in Talent Event Servlet");

        String eventIdStr=req.getParameter("eventId");
        int eventId=0;
        if(eventIdStr!=null && !eventIdStr.isEmpty())
        {
            eventId=Integer.parseInt(eventIdStr);
        }

        Optional<TalentEventDto> optionalTalentEventDto=talentEventService.findById(eventId);
        if(optionalTalentEventDto.isPresent())
        {
            System.out.println("Event id is found");
            TalentEventDto talentEventDto=optionalTalentEventDto.get();
            req.setAttribute("talentEventDto",talentEventDto);
        }
        else {
            System.out.println("Event id is not found");
            req.setAttribute("message","Event Id is not found");
            req.setAttribute("eventId",eventId);
        }
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("FindById.jsp");
        requestDispatcher.forward(req,resp);

    }
}
