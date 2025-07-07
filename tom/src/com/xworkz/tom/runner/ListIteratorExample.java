package com.xworkz.tom.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("Prime video");
        list.add("You tube");
        list.add("Whatsapp");
        list.add("Spotify");
        list.add("Netflix");
        list.add("Duolingo");
        list.add("Screen lock");
        list.add("PDF reader");
        list.add("Adobe Scanner");
        list.add("File manager");

        ListIterator<String> listIterator=list.listIterator();
        System.out.println("In forward direction");
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
        System.out.println("===============================");
        System.out.println("In backward direction");
        ListIterator<String> listIterator3=list.listIterator(list.size());
        while (listIterator3.hasPrevious())
        {
            System.out.println(listIterator3.previous());
        }

        System.out.println("===============================");
        System.out.println("In Middle");
        ListIterator<String> listIterator1=list.listIterator(7);
        while (listIterator1.hasPrevious())
        {
            System.out.println(listIterator1.previous());
        }

        System.out.println("=============================");
        System.out.println("Adding element using ListIterator");
        ListIterator<String> listIterator2=list.listIterator();

        while (listIterator2.hasNext())
        {
            String app=listIterator2.next();
            if (app.equalsIgnoreCase("screen lock"))
            {
                listIterator2.add("Teams");
            }
            if (app.equalsIgnoreCase("whatsApp"))
            {
                listIterator2.remove();
            }
            if(app.equalsIgnoreCase("prime video"))
            {
                listIterator2.set("Outlook");
            }
        }

    }
}
