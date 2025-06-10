package com.xworkz.parade.service;

import com.xworkz.parade.dto.StampedeCaseDto;
import com.xworkz.parade.repository.StampedeCaseRepository;
import com.xworkz.parade.repository.StampedeCaseRepositoryImpl;

public class StampedeCaseServiceImpl implements StampedeCaseService{

    public StampedeCaseServiceImpl()
    {
        System.out.println("StampedeCaseService implementation constructor");
    }
    @Override
    public String save(StampedeCaseDto stampedeCaseDto) {
        System.out.println("save method in StampedeCaseService implementation");
        if(stampedeCaseDto!=null)
        {
            System.out.println("stampede case Dto is not null");
        }
        else{
            System.err.println("stampede case Dto is null");
            return "failed";
        }
        String event=stampedeCaseDto.getEvent();
        if(event==null || event.length()>20 || event.length()<3)
        {
            System.err.println("Event is Invalid");
            return "failed";
        }
        else{
            System.out.println("Event is valid");
        }
        String location=stampedeCaseDto.getLocation();
        if(location==null || location.length()>20 || location.length()<3)
        {
            System.err.println("Location is Invalid");
            return "failed";
        }
        else{
            System.out.println("Location is valid");
        }
        int deathsCount=stampedeCaseDto.getDeathsCount();
        if(deathsCount<0 || deathsCount>500)
        {
            System.err.println("Death Count is Invalid");
            return "failed";
        }
        else{
            System.out.println("Death count is valid");
        }
        int injuriesCount=stampedeCaseDto.getInjuriesCount();
        if(injuriesCount<0 || injuriesCount>1500)
        {
            System.err.println("Injuries Count is Invalid");
            return "failed";
        }
        else{
            System.out.println("Injuries count is valid");
        }
        StampedeCaseRepository stampedeCaseRepository =new StampedeCaseRepositoryImpl();
        return stampedeCaseRepository.persist(stampedeCaseDto);
    }
}
