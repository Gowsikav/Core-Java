package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.dto.RestaurantDto;
import com.xworkz.restaurant.service.RestaurantService;
import com.xworkz.restaurant.service.RestaurantServiceImpl;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestaurantRunner {
    public static void main(String[] args) {
        RestaurantDto restaurantDto=new RestaurantDto();

        restaurantDto.setRestaurantName("la");
        restaurantDto.setLocation("Bangalore");
        restaurantDto.setEmailId("gowsi3@gamil.com");
        restaurantDto.setContactDetails(6473849265L);
        restaurantDto.setRestaurantName("ValidName");
        restaurantDto.setRating(4);
        restaurantDto.setFoodMenu(new String[] {"Dosa"});
        restaurantDto.setType("veg");
        restaurantDto.setOpeningTime(LocalTime.of(9, 30));
        restaurantDto.setClosingTime(LocalTime.of(11, 0));
        restaurantDto.setBookedDate(LocalDate.now().plusDays(1));
        restaurantDto.setBookedTime(LocalTime.of(10, 0));

        RestaurantService restaurantService=new RestaurantServiceImpl();
        if(restaurantService.validate(restaurantDto))
            System.out.println("Restaurant Details is correct");
        else {
            System.out.println("Restaurant Details is not correct");
        }

    }
}
