package com.xworkz.rose.internal;

import com.xworkz.rose.dto.CountryDTO;
import com.xworkz.rose.dto.PassportDTO;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class PassportDTOList {

    public PassportDTOList()
    {
        System.out.println("PassportDTOList constructor");
    }

    public List<PassportDTO> getPassportList()
    {
        System.out.println("getPassportList method in PassportDTOList");

        List<PassportDTO> list=new LinkedList<>();
        CountryDTOList countryDTOList=new CountryDTOList();
        List<CountryDTO> countryList = countryDTOList.getCountryList();

        PassportDTO passportDTO1 = new PassportDTO("IND123456", LocalDate.of(2021, 8, 10), LocalDate.of(2025, 7, 20), countryList.get(0));
        PassportDTO passportDTO2 = new PassportDTO("JPN654321", LocalDate.of(2020, 6, 15), LocalDate.of(2024, 6, 14), countryList.get(1));
        PassportDTO passportDTO3 = new PassportDTO("GER987654", LocalDate.of(2019, 5, 1), LocalDate.of(2024, 4, 30), countryList.get(2));
        PassportDTO passportDTO4 = new PassportDTO("FRA246810", LocalDate.of(2022, 1, 12), LocalDate.of(2026, 1, 11), countryList.get(3));
        PassportDTO passportDTO5 = new PassportDTO("BRA135791", LocalDate.of(2021, 3, 9), LocalDate.of(2025, 3, 8), countryList.get(4));
        PassportDTO passportDTO6 = new PassportDTO("CAN102938", LocalDate.of(2020, 10, 5), LocalDate.of(2025, 10, 4), countryList.get(5));
        PassportDTO passportDTO7 = new PassportDTO("AUS564738", LocalDate.of(2023, 2, 20), LocalDate.of(2028, 2, 19), countryList.get(6));
        PassportDTO passportDTO8 = new PassportDTO("RUS837261", LocalDate.of(2021, 7, 25), LocalDate.of(2026, 7, 24), countryList.get(7));
        PassportDTO passportDTO9 = new PassportDTO("CHN384756", LocalDate.of(2022, 5, 18), LocalDate.of(2027, 5, 17), countryList.get(8));
        PassportDTO passportDTO10 = new PassportDTO("SAF958473", LocalDate.of(2019, 12, 2), LocalDate.of(2024, 12, 1), countryList.get(9));

        PassportDTO passportDTO11 = new PassportDTO("USA192837", LocalDate.of(2021, 4, 6), LocalDate.of(2026, 4, 5), countryList.get(10));
        PassportDTO passportDTO12 = new PassportDTO("UK837465", LocalDate.of(2020, 9, 30), LocalDate.of(2025, 9, 29), countryList.get(11));
        PassportDTO passportDTO13 = new PassportDTO("ITA564738", LocalDate.of(2022, 8, 21), LocalDate.of(2027, 8, 20), countryList.get(12));
        PassportDTO passportDTO14 = new PassportDTO("ARG111222", LocalDate.of(2023, 3, 5), LocalDate.of(2028, 3, 4), countryList.get(13));
        PassportDTO passportDTO15 = new PassportDTO("MEX333444", LocalDate.of(2019, 7, 14), LocalDate.of(2024, 7, 13), countryList.get(14));
        PassportDTO passportDTO16 = new PassportDTO("THA888999", LocalDate.of(2020, 2, 10), LocalDate.of(2025, 2, 9), countryList.get(15));
        PassportDTO passportDTO17 = new PassportDTO("SGP777888", LocalDate.of(2021, 11, 25), LocalDate.of(2026, 11, 24), countryList.get(16));
        PassportDTO passportDTO18 = new PassportDTO("KOR555666", LocalDate.of(2023, 6, 2), LocalDate.of(2028, 6, 1), countryList.get(17));
        PassportDTO passportDTO19 = new PassportDTO("EGY444333", LocalDate.of(2022, 10, 8), LocalDate.of(2027, 10, 7), countryList.get(18));
        PassportDTO passportDTO20 = new PassportDTO("KEN222111", LocalDate.of(2020, 12, 15), LocalDate.of(2025, 12, 14), countryList.get(19));

        PassportDTO passportDTO21 = new PassportDTO("ESP998877", LocalDate.of(2021, 5, 20), LocalDate.of(2026, 5, 19), countryList.get(20));
        PassportDTO passportDTO22 = new PassportDTO("NOR112233", LocalDate.of(2022, 9, 3), LocalDate.of(2027, 9, 2), countryList.get(21));
        PassportDTO passportDTO23 = new PassportDTO("SWE445566", LocalDate.of(2020, 3, 28), LocalDate.of(2025, 3, 27), countryList.get(22));
        PassportDTO passportDTO24 = new PassportDTO("SWI778899", LocalDate.of(2019, 1, 9), LocalDate.of(2024, 1, 8), countryList.get(23));
        PassportDTO passportDTO25 = new PassportDTO("NZL998877", LocalDate.of(2023, 7, 30), LocalDate.of(2028, 7, 29), countryList.get(24));
        PassportDTO passportDTO26 = new PassportDTO("POR667788", LocalDate.of(2021, 6, 18), LocalDate.of(2026, 6, 17), countryList.get(25));
        PassportDTO passportDTO27 = new PassportDTO("MYS556677", LocalDate.of(2022, 4, 22), LocalDate.of(2027, 4, 21), countryList.get(26));
        PassportDTO passportDTO28 = new PassportDTO("IDN334455", LocalDate.of(2023, 1, 5), LocalDate.of(2028, 1, 4), countryList.get(27));
        PassportDTO passportDTO29 = new PassportDTO("UAE223344", LocalDate.of(2020, 11, 17), LocalDate.of(2025, 11, 16), countryList.get(28));
        PassportDTO passportDTO30 = new PassportDTO("KSA112233", LocalDate.of(2021, 2, 1), LocalDate.of(2026, 1, 31), countryList.get(29));

        list.add(passportDTO1);
        list.add(passportDTO2);
        list.add(passportDTO3);
        list.add(passportDTO4);
        list.add(passportDTO5);
        list.add(passportDTO6);
        list.add(passportDTO7);
        list.add(passportDTO8);
        list.add(passportDTO9);
        list.add(passportDTO10);
        list.add(passportDTO11);
        list.add(passportDTO12);
        list.add(passportDTO13);
        list.add(passportDTO14);
        list.add(passportDTO15);
        list.add(passportDTO16);
        list.add(passportDTO17);
        list.add(passportDTO18);
        list.add(passportDTO19);
        list.add(passportDTO20);
        list.add(passportDTO21);
        list.add(passportDTO22);
        list.add(passportDTO23);
        list.add(passportDTO24);
        list.add(passportDTO25);
        list.add(passportDTO26);
        list.add(passportDTO27);
        list.add(passportDTO28);
        list.add(passportDTO29);
        list.add(passportDTO30);

        return list;
    }
}
