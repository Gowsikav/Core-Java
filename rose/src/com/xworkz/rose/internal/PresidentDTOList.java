package com.xworkz.rose.internal;

import com.xworkz.rose.dto.DriverDTO;
import com.xworkz.rose.dto.PresidentDTO;

import java.util.LinkedList;
import java.util.List;

public class PresidentDTOList {

    public PresidentDTOList()
    {
        System.out.println("PresidentDTOList constructor");
    }

    public List<PresidentDTO> getPresidentList()
    {
        System.out.println("getPresidentList method in PresidentDTOList");

        List<PresidentDTO> list=new LinkedList<>();
        DriverDTOList driverDTOList=new DriverDTOList();
        List<DriverDTO> driverList=driverDTOList.getDriverList();

        PresidentDTO presidentDTO1 = new PresidentDTO("Arul", 5, 60, driverList.get(0));
        PresidentDTO presidentDTO2 = new PresidentDTO("Prakash", 6, 58, driverList.get(1));
        PresidentDTO presidentDTO3 = new PresidentDTO("Sundar", 4, 62, driverList.get(2));
        PresidentDTO presidentDTO4 = new PresidentDTO("Rajadurai", 7, 61, driverList.get(3));
        PresidentDTO presidentDTO5 = new PresidentDTO("Saravanan", 5, 59, driverList.get(4));
        PresidentDTO presidentDTO6 = new PresidentDTO("Balamurugan", 6, 64, driverList.get(5));
        PresidentDTO presidentDTO7 = new PresidentDTO("Elango", 3, 56, driverList.get(6));
        PresidentDTO presidentDTO8 = new PresidentDTO("Vignesh", 4, 57, driverList.get(7));
        PresidentDTO presidentDTO9 = new PresidentDTO("Gokul", 5, 60, driverList.get(8));
        PresidentDTO presidentDTO10 = new PresidentDTO("Sathish", 7, 65, driverList.get(9));

        PresidentDTO presidentDTO11 = new PresidentDTO("Arvind", 6, 63, driverList.get(10));
        PresidentDTO presidentDTO12 = new PresidentDTO("Murugan", 4, 59, driverList.get(11));
        PresidentDTO presidentDTO13 = new PresidentDTO("Rajkumar", 5, 61, driverList.get(12));
        PresidentDTO presidentDTO14 = new PresidentDTO("Dinesh", 6, 62, driverList.get(13));
        PresidentDTO presidentDTO15 = new PresidentDTO("Logesh", 3, 55, driverList.get(14));
        PresidentDTO presidentDTO16 = new PresidentDTO("Naveen", 7, 64, driverList.get(15));
        PresidentDTO presidentDTO17 = new PresidentDTO("Harish", 5, 60, driverList.get(16));
        PresidentDTO presidentDTO18 = new PresidentDTO("Balaji", 4, 58, driverList.get(17));
        PresidentDTO presidentDTO19 = new PresidentDTO("Karthik", 6, 63, driverList.get(18));
        PresidentDTO presidentDTO20 = new PresidentDTO("Sankar", 5, 61, driverList.get(19));

        PresidentDTO presidentDTO21 = new PresidentDTO("Raghavan", 7, 66, driverList.get(20));
        PresidentDTO presidentDTO22 = new PresidentDTO("Manikandan", 3, 56, driverList.get(21));
        PresidentDTO presidentDTO23 = new PresidentDTO("Jeyakumar", 4, 59, driverList.get(22));
        PresidentDTO presidentDTO24 = new PresidentDTO("Nataraj", 5, 60, driverList.get(23));
        PresidentDTO presidentDTO25 = new PresidentDTO("Parameswaran", 6, 62, driverList.get(24));
        PresidentDTO presidentDTO26 = new PresidentDTO("Thamizhanban", 5, 61, driverList.get(25));
        PresidentDTO presidentDTO27 = new PresidentDTO("Muthuvel", 4, 58, driverList.get(26));
        PresidentDTO presidentDTO28 = new PresidentDTO("Vinoth", 7, 64, driverList.get(27));
        PresidentDTO presidentDTO29 = new PresidentDTO("Sivakumar", 6, 63, driverList.get(28));
        PresidentDTO presidentDTO30 = new PresidentDTO("Kandhasamy", 5, 60, driverList.get(29));

        list.add(presidentDTO1);
        list.add(presidentDTO2);
        list.add(presidentDTO3);
        list.add(presidentDTO4);
        list.add(presidentDTO5);
        list.add(presidentDTO6);
        list.add(presidentDTO7);
        list.add(presidentDTO8);
        list.add(presidentDTO9);
        list.add(presidentDTO10);
        list.add(presidentDTO11);
        list.add(presidentDTO12);
        list.add(presidentDTO13);
        list.add(presidentDTO14);
        list.add(presidentDTO15);
        list.add(presidentDTO16);
        list.add(presidentDTO17);
        list.add(presidentDTO18);
        list.add(presidentDTO19);
        list.add(presidentDTO20);
        list.add(presidentDTO21);
        list.add(presidentDTO22);
        list.add(presidentDTO23);
        list.add(presidentDTO24);
        list.add(presidentDTO25);
        list.add(presidentDTO26);
        list.add(presidentDTO27);
        list.add(presidentDTO28);
        list.add(presidentDTO29);
        list.add(presidentDTO30);

        return list;
    }
}
