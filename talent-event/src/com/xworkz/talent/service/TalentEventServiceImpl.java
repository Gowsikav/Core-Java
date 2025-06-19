package com.xworkz.talent.service;

import com.xworkz.talent.dto.TalentEventDto;
import com.xworkz.talent.repository.TalentEventRepository;
import com.xworkz.talent.repository.TalentEventRepositoryImpl;

import java.util.Optional;

public class TalentEventServiceImpl implements TalentEventService{

    TalentEventRepository talentEventRepository=new TalentEventRepositoryImpl();

    public TalentEventServiceImpl()
    {
        System.out.println("TalentEvent Service implementation constructor");
    }

    @Override
    public boolean save(TalentEventDto talentEventDto) {
        System.out.println("save method in TalentEvent Service implementation");

        if(talentEventDto!=null)
        {
            System.out.println("TalentEventDto is not null");
        }
        else {
            System.out.println("TalentEventDto is null");
            return false;
        }

        String name=talentEventDto.getName();
        if(name==null || name.isEmpty())
        {
            System.out.println("Name is empty");
            return false;
        }else if(name.length()<3 || name.length()>25)
        {
            System.out.println("Name length should be between 3 and 25");
            return false;
        }
        else if(!name.matches("[A-Za-z ]+"))
        {
            System.out.println("Name should contain only alphabet and space");
            return false;
        }
        else {
            System.out.println("Name is valid");

        }

        String age= talentEventDto.getAge();
        if(age==null || age.isEmpty())
        {
            System.out.println("Age is empty");
            return false;
        }
        else {
            System.out.println("Age is valid");
        }

        long contact = talentEventDto.getContact();
        String contactStr = String.valueOf(contact);

        if (contactStr.length() != 10) {
            System.out.println("Contact length must be exactly 10");
            return false;
        }else if(!contactStr.matches("^[0-9]{10}$"))
        {
            System.out.println("Contact should be digits");
            return false;
        }
        else {
            System.out.println("Contact number is valid");
        }

        String talentType=talentEventDto.getTalentType();
        if (talentType == null || talentType.trim().isEmpty()) {
            System.out.println("Talent type is empty");
            return false;
        } else {
            System.out.println("Talent type is valid");
        }

        String description= talentEventDto.getDescription();
        if(description==null || description.trim().isEmpty())
        {
            System.out.println("Description is empty");
            return false;
        }else if(description.length()<5 || description.length()>120)
        {
            System.out.println("Description length should be between 5 and 120");
            return false;
        }
        else {
            System.out.println("Description is valid");
        }

        System.out.println("All fields are valid");
        return talentEventRepository.persist(talentEventDto);
    }

    @Override
    public Optional<TalentEventDto> findById(int eventId) {
        System.out.println("findDyId method in TalentEvent Service implementation");

        if(eventId>0)
        {
               return talentEventRepository.findById(eventId);
        }
        return Optional.empty();
    }
}
