package com.xworkz.flower.service;

import com.sun.deploy.security.SelectableSecurityManager;
import com.xworkz.flower.dto.SplitterDTO;

public class SplitterServiceImpl implements SplitterService {

    public SplitterServiceImpl()
    {
        System.out.println("SplitterService implementation constructor");
    }

    @Override
    public double valid(SplitterDTO splitterDTO) {
        System.out.println("valid method in SplitterService implementation");

        if(splitterDTO!=null)
        {
            System.out.println("splitterDto is not null");
        }
        else {
            System.out.println("Splitter Dto is null");
            return 0;
        }
        double amount=splitterDTO.getAmount();
        if(amount>10 && amount<1000000)
        {
            System.out.println("Amount is valid");
        }
        else {
            System.out.println("Amount is Invalid");
            return 0;
        }
        int personCount= splitterDTO.getPersonCount();
        if(personCount>1 && personCount<10)
        {
            System.out.println("PersonCount is valid");
        }
        else{
            System.out.println("personCount is invalid");
            return 0;
        }

        System.out.println("Values are valid");

       AmountSplitter amountSplitter=new AmountSplitter();

        return amountSplitter.amountSplit(splitterDTO);
    }
}
