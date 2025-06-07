package com.xworkz.home.runner;

import com.xworkz.home.exception.InvalidLeaveRequestException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LeaveManagement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the leave start date: ");
        String startDateStr= scanner.nextLine();
        System.out.println("Enter the end date: ");
        String endDateStr=scanner.nextLine();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try{
            LocalDate startDate=LocalDate.parse(startDateStr,formatter);
            LocalDate endDate=LocalDate.parse(endDateStr,formatter);
            if(startDate.isBefore(LocalDate.now()))
                throw new InvalidLeaveRequestException("Leave start date is past date");
            if(endDate.isBefore(startDate))
                throw new InvalidLeaveRequestException("End Date should be after start date");
            long days= ChronoUnit.DAYS.between(startDate,endDate);
            if(days>30)
                throw new InvalidLeaveRequestException("Leave duration cannot exceed 30 days");
            System.out.println("Leave application is approved");
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format");
        }
        catch(InvalidLeaveRequestException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Leave application is rejected");
        }
        finally {
            scanner.close();
        }
    }
}
