package com.xworkz.jerry.runner;

import com.xworkz.jerry.internal.Customer;

public class TicketRunner {

    public static void main(String[] args) {

        Customer customer=new Customer();
        customer.buyTicket((cost)-> {
            System.out.println("running expression...");
            return cost > 0;
        });

    }
}
