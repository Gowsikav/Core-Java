package com.xworkz.forms.service;

import com.xworkz.forms.dto.FeedBackDto;

public class FeedBackServiceImpl implements FeedBackService{
    public FeedBackServiceImpl()
    {
        System.out.println("Feedback Service Implementation Constructor");
    }

    @Override
    public boolean save(FeedBackDto feedBackDto) {
        System.out.println("save method in Feedback service implementation");
        return true;
    }
}
