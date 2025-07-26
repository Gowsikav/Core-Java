package com.xworkz.balcony.dto;

import lombok.*;

@AllArgsConstructor
@Getter
@ToString
@Setter
@NoArgsConstructor
public class IceCreamOrderDTO {
    private String customerName;
    private String flavour;
    private int quantity;
    private String takeAway;
    private String addOn;
    private String couponCode;
}
