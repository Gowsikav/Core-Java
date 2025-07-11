package com.xworkz.flower.service;

import com.xworkz.flower.dto.SplitterDTO;

public class AmountSplitter {

    public AmountSplitter()
    {
        System.out.println("AmountSplitter constructor");
    }

    double amountSplit(SplitterDTO splitterDTO)
    {
        double amount=splitterDTO.getAmount();
        int personCount= splitterDTO.getPersonCount();
        double perPerson=amount/personCount;
        return perPerson;
    }
}
