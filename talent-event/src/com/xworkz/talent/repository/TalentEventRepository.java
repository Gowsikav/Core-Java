package com.xworkz.talent.repository;

import com.xworkz.talent.dto.TalentEventDto;

import java.util.Optional;

public interface TalentEventRepository {
    boolean persist(TalentEventDto talentEventDto);

    default Optional<TalentEventDto> findById(int eventId){
        return Optional.empty();
    }
}
