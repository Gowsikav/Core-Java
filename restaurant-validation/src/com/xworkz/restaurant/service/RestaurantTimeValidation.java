package com.xworkz.restaurant.service;

import com.xworkz.restaurant.dto.RestaurantDto;
import com.xworkz.restaurant.exception.InvalidTimeException;
import com.xworkz.restaurant.exception.NameStartNumberException;
import javafx.beans.InvalidationListener;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestaurantTimeValidation implements RestaurantService{
    public RestaurantTimeValidation() {
        System.out.println("Restaurant time validation Constructor");
    }

    @Override
    public boolean validate(RestaurantDto restaurantDto) {
        System.out.println("Validate method in Restaurant time validation");
        boolean falg=true;

        try {
            if (restaurantDto.getOpeningTime() == null) {
                throw new NullPointerException("Opening time is Null");
            }
            System.out.println("Opening Time is not null");
            try {
                if (restaurantDto.getOpeningTime().isBefore(LocalTime.of(9,0)))
                {
                    throw new InvalidTimeException("Opening time cannot be before 9:00 AM");
                }
                System.out.println("Opening Time is correct");
            }catch (InvalidTimeException e)
            {
                System.out.println(e.getMessage());
                falg=false;
            }

            if(restaurantDto.getClosingTime()==null)
            {
                throw new NullPointerException("Closing time is Null");
            }
            System.out.println("Closing time is not Null");
            try{
                if(restaurantDto.getClosingTime().isAfter(LocalTime.of(23,59)))
                {
                    throw new InvalidTimeException("Closing time cannot be after 12:00 PM");
                }
                System.out.println("Closing time is correct");
            }
            catch (InvalidTimeException e)
            {
                System.out.println(e.getMessage());
                falg=false;
            }

            if(restaurantDto.getBookedDate()==null)
            {
                throw new NullPointerException("Booked Date is Null");
            }
            System.out.println("Booked date is not null");
            try
            {
                if(restaurantDto.getBookedDate().isBefore(LocalDate.now()))
                {
                    throw new InvalidTimeException("Booking date cannot be a past date");
                }
                System.out.println("Booked date is correct");
            }catch (InvalidTimeException e)
            {
                System.out.println(e.getMessage());
                falg=false;
            }


            if(restaurantDto.getBookedTime()==null)
            {
                throw new NullPointerException("Booked Time is null");
            }
            System.out.println("Booked Time is not null");
            try
            {
                if(restaurantDto.getBookedTime().isBefore(LocalTime.of(9,0)) || restaurantDto.getBookedTime().isAfter(LocalTime.of(23,30)))
                {
                    throw new InvalidTimeException("Booking time should not before 9AM and After 11:30PM");
                }
                System.out.println("Booked time is correct");
            }
            catch (InvalidTimeException e)
            {
                System.out.println(e.getMessage());
                falg=false;
            }

        }catch (NullPointerException exception)
        {
            System.out.println(exception.getMessage());
            falg= false;
        }
        return falg;
    }
}
