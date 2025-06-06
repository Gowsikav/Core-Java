package com.xworkz.home.runner;

public class IngredientListParser {
    public static void main(String[] args) {
        String[] ingredients = {"Flour", "Sugar", "Eggs", "Milk", "Butter"};
        int index=9;
        try{
            System.out.println("Ingredient at index "+index+" is "+ ingredients[index]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("No ingredient found at index "+index);
        }
    }
}
