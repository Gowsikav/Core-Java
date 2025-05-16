package com.xworkz.forms.dto;

public class DonationDto
{
    public DonationDto()
    {
        System.out.println("DonationDto Constructor");
    }
    private String firstName;
    private String lastName;
    private String email;
    private String amount;
    private String cause;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    @Override
    public String toString() {
        return "DonationDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", amount='" + amount + '\'' +
                ", cause='" + cause + '\'' +
                '}';
    }
}
