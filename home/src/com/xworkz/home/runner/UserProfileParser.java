package com.xworkz.home.runner;

public class UserProfileParser {

    public static void main(String[] args) {
      //  String json = "{ \"name\": \"Alice\", \"details\": { \"age\": 25 } }";
        String json = "{ \"name\": \"Alice\" }";

        try {

            if (!json.contains("details")) {
                throw new Exception("Missing 'details' section in user profile.");
            }

            System.out.println("User profile found.");
            try {
                int ageStart = json.indexOf("\"age\":") + 6;
                int ageEnd = json.indexOf("}", ageStart);
                String ageStr = json.substring(ageStart, ageEnd).trim();

                int age = Integer.parseInt(ageStr);
                System.out.println("User age: " + age);
            } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
                System.out.println("Error extracting age: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Invalid user profile: " + e.getMessage());
        }
    }
}
