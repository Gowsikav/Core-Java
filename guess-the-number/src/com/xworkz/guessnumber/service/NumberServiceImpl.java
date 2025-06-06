package com.xworkz.guessnumber.service;

import com.xworkz.guessnumber.dto.NumberDto;

public class NumberServiceImpl implements NumberService{

    public NumberServiceImpl()
    {
        System.out.println("Number service Implementation constructor");
    }
    @Override
    public boolean validate(NumberDto numberDto) {
        //System.out.println("validate method in Number service Implementation");
       try {
           if (numberDto == null)
               throw new NullPointerException();
           int randomNumber= numberDto.getRandomNumber();
           if(numberDto.getUserNumber()<randomNumber)
           {
               System.out.println("you're number is less");
               return false;
           }
           if(numberDto.getUserNumber()>randomNumber )
           {
               System.out.println("you're number is high");
               return false;
           }
           return true;
       }catch (NullPointerException e)
       {
           System.out.println("NumberDto is null");
       }
       return false;
    }
}
