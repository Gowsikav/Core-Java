package com.xworkz.talent.service;

import com.xworkz.talent.dto.TalentEventDto;

import java.util.Optional;

public interface TalentEventService {
    boolean save(TalentEventDto talentEventDto);

    default Optional<TalentEventDto> findById(int eventId){
        return Optional.empty();
    }
}
