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

        if (feedBackDto != null) {
            System.out.println("FeedbackDto is not null");
        }
        else {
            System.err.println("FeedbackDto is null");
            return false;
        }

        String name = feedBackDto.getName();
        if (name != null && name.length() >= 3 && name.length() <= 30) {
            System.out.println("Valid Name");
        } else {
            System.err.println("Invalid Name");
            return false;
        }
        String email = feedBackDto.getEmail();
        if (email != null && email.length() >= 10 && email.length() <= 40) {
            System.out.println("Valid Email");
        } else {
            System.err.println("Invalid Email");
            return false;
        }

        String ratings = feedBackDto.getRating();
        int rating=0;
        if(ratings!=null)
        {
            rating=Integer.parseInt(ratings);
            if (rating >= 1 && rating <= 5)
            {
             System.out.println("Valid Ratings");
            }
            else {
                System.err.println("Invalid Ratings (should be between 1 and 5)");
                return false;
            }
        }
        else
        {
            System.err.println("Invalid ratings");
            return false;
        }

        String comments = feedBackDto.getComments();
        if (comments != null && comments.length() >= 5 && comments.length() <= 500) {
            System.out.println("Valid Comments");
        } else {
            System.err.println("Invalid Comments");
            return false;
        }

        return true;
    }
}
