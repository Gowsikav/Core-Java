package com.xworkz.guessnumber.runner;

import com.xworkz.guessnumber.dto.NumberDto;
import com.xworkz.guessnumber.service.NumberService;
import com.xworkz.guessnumber.service.NumberServiceImpl;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ApplicationRunner {
    public static void main(String[] args) {

        Random random=new Random();
        int randomNumber=random.nextInt(101);
        NumberDto numberDto=new NumberDto();
        numberDto.setRandomNumber(randomNumber);
        NumberService numberService = new NumberServiceImpl();
        //System.out.println(randomNumber);

        try (Scanner scanner = new Scanner(System.in)) {
            boolean flag = true;
            while (flag) {
                System.out.println("Enter number: ");
                int userNumber = scanner.nextInt();

                numberDto.setUserNumber(userNumber);

                if (numberService.validate(numberDto)) {
                    System.out.println("Number is Matched");
                    flag = false;
                } else {
                    System.out.println("Wrong number");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Input is not correct. Give only numbers");
        } finally {
            System.out.println("Game over");
        }
    }
}
