package com.xworkz.forms.dto;

public class FeedBackDto {
    public FeedBackDto()
    {
        System.out.println("FeedBackDto Constructor");
    }
    private String name;
    private String email;
    private String rating;
    private String comments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "FeedBackDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rating='" + rating + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
