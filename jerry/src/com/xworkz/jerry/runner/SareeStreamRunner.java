package com.xworkz.jerry.runner;

import com.xworkz.jerry.dto.SareeDto;
import com.xworkz.jerry.repository.SareeRepository;
import com.xworkz.jerry.repository.SareeRepositoryImpl;

import java.util.Collection;

public class SareeStreamRunner {
    public static void main(String[] args) {

        SareeRepository sareeRepository=new SareeRepositoryImpl();
        Collection<SareeDto> sareeDtoCollection=sareeRepository.findAll();

        sareeDtoCollection
                .stream()
                .sorted()
                .forEach(System.out::println);

    }
}
