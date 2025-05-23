package com.xworkz.dog.dto;

public class RoomBookingDto {
    public RoomBookingDto()
    {
        System.out.println("Room booking Dto Constructor");
    }
    private String hotelName;
    private String roomType;
    private int numberOfDays;
    private String arrivalDate;
    private String checkOutDate;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    @Override
    public String toString() {
        return "RoomBookingDto{" +
                "hotelName='" + hotelName + '\'' +
                ", roomType='" + roomType + '\'' +
                ", numberOfDays=" + numberOfDays +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                '}';
    }
}
