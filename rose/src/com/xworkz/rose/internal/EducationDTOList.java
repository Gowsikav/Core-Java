package com.xworkz.rose.internal;

import com.xworkz.rose.dto.EducationDTO;

import java.util.LinkedList;
import java.util.List;

public class EducationDTOList {

    public EducationDTOList()
    {
        System.out.println("EducationDTOList constructor");
    }

    public List<EducationDTO> getEducationDTOList()
    {
        System.out.println("getEducationDTOList method in EducationDTOList");

        List<EducationDTO> list=new LinkedList<>();

        EducationDTO educationDTO1 = new EducationDTO("B.Tech", "IIT Delhi", 2015, 8.2);
        EducationDTO educationDTO2 = new EducationDTO("M.Tech", "IIT Bombay", 2017, 9.0);
        EducationDTO educationDTO3 = new EducationDTO("B.Sc", "Delhi University", 2014, 7.5);
        EducationDTO educationDTO4 = new EducationDTO("M.Sc", "Delhi University", 2016, 8.1);
        EducationDTO educationDTO5 = new EducationDTO("BCA", "Christ University", 2013, 7.8);
        EducationDTO educationDTO6 = new EducationDTO("MCA", "NIT Trichy", 2016, 8.4);
        EducationDTO educationDTO7 = new EducationDTO("B.Com", "Mumbai University", 2012, 7.2);
        EducationDTO educationDTO8 = new EducationDTO("M.Com", "Mumbai University", 2014, 7.9);
        EducationDTO educationDTO9 = new EducationDTO("B.E", "Anna University", 2011, 8.0);
        EducationDTO educationDTO10 = new EducationDTO("M.E", "Anna University", 2013, 8.5);

        EducationDTO educationDTO11 = new EducationDTO("B.Tech", "IIT Kanpur", 2018, 8.7);
        EducationDTO educationDTO12 = new EducationDTO("M.Tech", "IIT Kharagpur", 2020, 9.2);
        EducationDTO educationDTO13 = new EducationDTO("BBA", "Symbiosis", 2015, 7.6);
        EducationDTO educationDTO14 = new EducationDTO("MBA", "IIM Bangalore", 2017, 8.9);
        EducationDTO educationDTO15 = new EducationDTO("B.Sc", "Jadavpur University", 2010, 7.4);
        EducationDTO educationDTO16 = new EducationDTO("M.Sc", "Jadavpur University", 2012, 8.0);
        EducationDTO educationDTO17 = new EducationDTO("B.Tech", "NIT Warangal", 2016, 8.3);
        EducationDTO educationDTO18 = new EducationDTO("M.Tech", "BITS Pilani", 2018, 8.8);
        EducationDTO educationDTO19 = new EducationDTO("BCA", "IGNOU", 2011, 6.9);
        EducationDTO educationDTO20 = new EducationDTO("MCA", "IGNOU", 2013, 7.5);

        EducationDTO educationDTO21 = new EducationDTO("B.Com", "Loyola College", 2009, 7.1);
        EducationDTO educationDTO22 = new EducationDTO("M.Com", "Madras University", 2011, 7.6);
        EducationDTO educationDTO23 = new EducationDTO("B.E", "PES University", 2014, 8.1);
        EducationDTO educationDTO24 = new EducationDTO("M.E", "PES University", 2016, 8.5);
        EducationDTO educationDTO25 = new EducationDTO("B.Tech", "VIT Vellore", 2017, 8.0);
        EducationDTO educationDTO26 = new EducationDTO("M.Tech", "SRM University", 2019, 8.3);
        EducationDTO educationDTO27 = new EducationDTO("B.Sc", "Osmania University", 2012, 7.3);
        EducationDTO educationDTO28 = new EducationDTO("M.Sc", "Osmania University", 2014, 7.8);
        EducationDTO educationDTO29 = new EducationDTO("BBA", "Amity University", 2016, 7.7);
        EducationDTO educationDTO30 = new EducationDTO("MBA", "Amity University", 2018, 8.2);

        list.add(educationDTO1);
        list.add(educationDTO2);
        list.add(educationDTO3);
        list.add(educationDTO4);
        list.add(educationDTO5);
        list.add(educationDTO6);
        list.add(educationDTO7);
        list.add(educationDTO8);
        list.add(educationDTO9);
        list.add(educationDTO10);
        list.add(educationDTO11);
        list.add(educationDTO12);
        list.add(educationDTO13);
        list.add(educationDTO14);
        list.add(educationDTO15);
        list.add(educationDTO16);
        list.add(educationDTO17);
        list.add(educationDTO18);
        list.add(educationDTO19);
        list.add(educationDTO20);
        list.add(educationDTO21);
        list.add(educationDTO22);
        list.add(educationDTO23);
        list.add(educationDTO24);
        list.add(educationDTO25);
        list.add(educationDTO26);
        list.add(educationDTO27);
        list.add(educationDTO28);
        list.add(educationDTO29);
        list.add(educationDTO30);

        return list;
    }

}

