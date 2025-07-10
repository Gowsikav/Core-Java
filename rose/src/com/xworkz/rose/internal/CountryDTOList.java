package com.xworkz.rose.internal;

import com.xworkz.rose.dto.CountryDTO;
import com.xworkz.rose.dto.PresidentDTO;

import java.util.LinkedList;
import java.util.List;

public class CountryDTOList {

    public CountryDTOList()
    {
        System.out.println("CountryDTOList constructor");
    }

    public List<CountryDTO> getCountryList()
    {
        System.out.println("getCountryList method in CountryDTOList");

        List<CountryDTO> list=new LinkedList<>();
        PresidentDTOList presidentDTOList=new PresidentDTOList();
        List<PresidentDTO> presidentList=presidentDTOList.getPresidentList();

        CountryDTO countryDTO1 = new CountryDTO("India", "Asia", "INR", presidentList.get(0));
        CountryDTO countryDTO2 = new CountryDTO("Japan", "Asia", "Yen", presidentList.get(1));
        CountryDTO countryDTO3 = new CountryDTO("Germany", "Europe", "Euro", presidentList.get(2));
        CountryDTO countryDTO4 = new CountryDTO("France", "Europe", "Euro", presidentList.get(3));
        CountryDTO countryDTO5 = new CountryDTO("Brazil", "South America", "BRL", presidentList.get(4));
        CountryDTO countryDTO6 = new CountryDTO("Canada", "North America", "CAD", presidentList.get(5));
        CountryDTO countryDTO7 = new CountryDTO("Australia", "Oceania", "AUD", presidentList.get(6));
        CountryDTO countryDTO8 = new CountryDTO("Russia", "Europe", "RUB", presidentList.get(7));
        CountryDTO countryDTO9 = new CountryDTO("China", "Asia", "Yuan", presidentList.get(8));
        CountryDTO countryDTO10 = new CountryDTO("South Africa", "Africa", "ZAR", presidentList.get(9));

        CountryDTO countryDTO11 = new CountryDTO("United States", "North America", "USD", presidentList.get(10));
        CountryDTO countryDTO12 = new CountryDTO("United Kingdom", "Europe", "GBP", presidentList.get(11));
        CountryDTO countryDTO13 = new CountryDTO("Italy", "Europe", "Euro", presidentList.get(12));
        CountryDTO countryDTO14 = new CountryDTO("Argentina", "South America", "ARS", presidentList.get(13));
        CountryDTO countryDTO15 = new CountryDTO("Mexico", "North America", "MXN", presidentList.get(14));
        CountryDTO countryDTO16 = new CountryDTO("Thailand", "Asia", "Baht", presidentList.get(15));
        CountryDTO countryDTO17 = new CountryDTO("Singapore", "Asia", "SGD", presidentList.get(16));
        CountryDTO countryDTO18 = new CountryDTO("South Korea", "Asia", "KRW", presidentList.get(17));
        CountryDTO countryDTO19 = new CountryDTO("Egypt", "Africa", "EGP", presidentList.get(18));
        CountryDTO countryDTO20 = new CountryDTO("Kenya", "Africa", "KES", presidentList.get(19));

        CountryDTO countryDTO21 = new CountryDTO("Spain", "Europe", "Euro", presidentList.get(20));
        CountryDTO countryDTO22 = new CountryDTO("Norway", "Europe", "NOK", presidentList.get(21));
        CountryDTO countryDTO23 = new CountryDTO("Sweden", "Europe", "SEK", presidentList.get(22));
        CountryDTO countryDTO24 = new CountryDTO("Switzerland", "Europe", "CHF", presidentList.get(23));
        CountryDTO countryDTO25 = new CountryDTO("New Zealand", "Oceania", "NZD", presidentList.get(24));
        CountryDTO countryDTO26 = new CountryDTO("Portugal", "Europe", "Euro", presidentList.get(25));
        CountryDTO countryDTO27 = new CountryDTO("Malaysia", "Asia", "MYR", presidentList.get(26));
        CountryDTO countryDTO28 = new CountryDTO("Indonesia", "Asia", "IDR", presidentList.get(27));
        CountryDTO countryDTO29 = new CountryDTO("UAE", "Asia", "AED", presidentList.get(28));
        CountryDTO countryDTO30 = new CountryDTO("Saudi Arabia", "Asia", "SAR", presidentList.get(29));

        list.add(countryDTO1);
        list.add(countryDTO2);
        list.add(countryDTO3);
        list.add(countryDTO4);
        list.add(countryDTO5);
        list.add(countryDTO6);
        list.add(countryDTO7);
        list.add(countryDTO8);
        list.add(countryDTO9);
        list.add(countryDTO10);
        list.add(countryDTO11);
        list.add(countryDTO12);
        list.add(countryDTO13);
        list.add(countryDTO14);
        list.add(countryDTO15);
        list.add(countryDTO16);
        list.add(countryDTO17);
        list.add(countryDTO18);
        list.add(countryDTO19);
        list.add(countryDTO20);
        list.add(countryDTO21);
        list.add(countryDTO22);
        list.add(countryDTO23);
        list.add(countryDTO24);
        list.add(countryDTO25);
        list.add(countryDTO26);
        list.add(countryDTO27);
        list.add(countryDTO28);
        list.add(countryDTO29);
        list.add(countryDTO30);

        return list;
    }
}
