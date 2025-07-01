package com.xworkz.jerry.internal;

import com.xworkz.jerry.lambda.Ticket;

public class Customer {


    public void buyTicket(Ticket ticket)
    {
        System.out.println("running buyTicket in Customer...");
        if(ticket!=null)
        {
          boolean value=  ticket.trip(500);
            System.out.println("Value :"+value);
        }
    }

}
