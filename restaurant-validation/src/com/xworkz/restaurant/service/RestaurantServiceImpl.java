package com.xworkz.restaurant.service;

import com.xworkz.restaurant.dto.RestaurantDto;
import com.xworkz.restaurant.exception.*;

public class RestaurantServiceImpl implements RestaurantService{

    public RestaurantServiceImpl()
    {
        System.out.println("Restaurant service Implementation constructor");
    }

    @Override
    public boolean validate(RestaurantDto restaurantDto) {
        System.out.println("Validate method in Restaurant service Implementation");
        boolean flag=true;

        try {
            if (restaurantDto == null) {
                throw new NullPointerException("RestaurantDto is Null");
            }
            System.out.println("RestaurantDto is not null");

            if (restaurantDto.getRestaurantName() == null) {
                throw new NullPointerException("Restaurant Name is Null");
            }
            System.out.println("RestaurantName is not null");

            try {
                String name = restaurantDto.getRestaurantName();
                if (name.length() < 3) {
                    throw new NameLengthCheckException("Name length is less than 3");
                }
                if (name.length() > 25) {
                    throw new NameLengthCheckException("Name length is greater than 25");
                }
                if (Character.isDigit(name.charAt(0))) {
                    throw new NameStartNumberException("Name starts with number (Invalid name)");
                }
                System.out.println("Restaurant name is correct");
            } catch (NameLengthCheckException | NameStartNumberException e) {
                System.out.println(e.getMessage());
                flag=false;
            }

            if (restaurantDto.getLocation() == null) {
                throw new NullPointerException("Location is Null");
            }
            System.out.println("Location is correct");

            try {
                String contact = String.valueOf(restaurantDto.getContactDetails());

                if (contact == null || contact.equalsIgnoreCase("null")) {
                    throw new NullPointerException("Contact number is null");
                }

                if (!contact.matches("\\d{10}")) {
                    throw new MobileNumberException("Mobile number not contains 10 digits");
                }
                System.out.println("Mobile number is correct");
            } catch (MobileNumberException e) {
                System.out.println(e.getMessage());
                flag=false;
            }

            if (restaurantDto.getEmailId() == null) {
                throw new NullPointerException("Email-ID is Null");
            }

            try {
                String email = restaurantDto.getEmailId();
                if (!email.contains("@")) {
                    throw new EmailCheckException("Email must contain '@'");
                }
                if (!email.endsWith(".com")) {
                    throw new EmailDomainException("Email must end with '.com'");
                }
                System.out.println("Email-Id is valid");
            } catch (EmailCheckException | EmailDomainException e) {
                System.out.println(e.getMessage());
                flag=false;
            }
            if (restaurantDto.getRating() < 3) {
                throw new InvalidRatingException("Rating must be at least 3");
            }

            if (restaurantDto.getFoodMenu() == null) {
                throw new NullPointerException("Food menu is Null");
            }

            try {
                String[] foodMenu = restaurantDto.getFoodMenu();
                String test = foodMenu[foodMenu.length - 1];
                System.out.println("Food menu is correct");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Food menu Index is not valid");
                flag=false;
            }

            if (restaurantDto.getType() == null) {
                throw new NullPointerException("Restaurant type is Null");
            }

            try {
                String type = restaurantDto.getType();
                if (!type.equalsIgnoreCase("veg") && !type.equalsIgnoreCase("non-veg")) {
                    throw new TypeMisMatchException("Type must be either 'veg' or 'non-veg'");
                }
                System.out.println("Restaurant type is correct");
            } catch (TypeMisMatchException e) {
                System.out.println(e.getMessage());
                flag=false;
            }

            RestaurantTimeValidation restaurantTimeValidation = new RestaurantTimeValidation();
            if (!restaurantTimeValidation.validate(restaurantDto)) {
                System.out.println("Time or Date is invalid");
            }

        } catch (NullPointerException | ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
            flag=false;
        }

        return flag;
    }

}
