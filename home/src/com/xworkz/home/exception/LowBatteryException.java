package com.xworkz.home.exception;

public class LowBatteryException extends RuntimeException {
    public LowBatteryException(String message) {
        super(message);
    }
}
