package com.xworkz.rose.internal;

import com.xworkz.rose.dto.CEODTO;
import com.xworkz.rose.dto.HouseDTO;

import java.util.LinkedList;
import java.util.List;


public class CEODTOList {

    public CEODTOList()
    {
        System.out.println("CEODTOList constructor");
    }

    public List<CEODTO> getCEOList()
    {
        System.out.println("getCEOList method in CEODTOList ");

        List<CEODTO> list = new LinkedList<>();
        HouseDTOList houseDTOList=new HouseDTOList();
        List<HouseDTO> houseList =houseDTOList.getHouseDtoList();

        CEODTO ceoDTO1 = new CEODTO("Arun Kumar", 52, 5000000, houseList.get(0));
        CEODTO ceoDTO2 = new CEODTO("Meena Rani", 49, 4800000, houseList.get(1));
        CEODTO ceoDTO3 = new CEODTO("Sundar Raj", 55, 5200000, houseList.get(2));
        CEODTO ceoDTO4 = new CEODTO("Kavitha", 47, 4600000, houseList.get(3));
        CEODTO ceoDTO5 = new CEODTO("Murugan", 53, 5100000, houseList.get(4));
        CEODTO ceoDTO6 = new CEODTO("Lakshmi", 50, 4950000, houseList.get(5));
        CEODTO ceoDTO7 = new CEODTO("Vignesh", 56, 5300000, houseList.get(6));
        CEODTO ceoDTO8 = new CEODTO("Revathi", 45, 4400000, houseList.get(7));
        CEODTO ceoDTO9 = new CEODTO("Ramesh", 51, 5000000, houseList.get(8));
        CEODTO ceoDTO10 = new CEODTO("Anjali", 48, 4700000, houseList.get(9));

        CEODTO ceoDTO11 = new CEODTO("Natarajan", 54, 5250000, houseList.get(10));
        CEODTO ceoDTO12 = new CEODTO("Sujatha", 46, 4500000, houseList.get(11));
        CEODTO ceoDTO13 = new CEODTO("Saravanan", 50, 4950000, houseList.get(12));
        CEODTO ceoDTO14 = new CEODTO("Priya", 49, 4850000, houseList.get(13));
        CEODTO ceoDTO15 = new CEODTO("Karthik", 53, 5150000, houseList.get(14));
        CEODTO ceoDTO16 = new CEODTO("Geetha", 47, 4600000, houseList.get(15));
        CEODTO ceoDTO17 = new CEODTO("Ravi", 55, 5200000, houseList.get(16));
        CEODTO ceoDTO18 = new CEODTO("Shanthi", 44, 4300000, houseList.get(17));
        CEODTO ceoDTO19 = new CEODTO("Muthu", 52, 5000000, houseList.get(18));
        CEODTO ceoDTO20 = new CEODTO("Janani", 48, 4750000, houseList.get(19));

        CEODTO ceoDTO21 = new CEODTO("Hariharan", 51, 5050000, houseList.get(20));
        CEODTO ceoDTO22 = new CEODTO("Kausalya", 46, 4550000, houseList.get(21));
        CEODTO ceoDTO23 = new CEODTO("Periyasamy", 54, 5250000, houseList.get(22));
        CEODTO ceoDTO24 = new CEODTO("Deepa", 49, 4850000, houseList.get(23));
        CEODTO ceoDTO25 = new CEODTO("Bala", 50, 4950000, houseList.get(24));
        CEODTO ceoDTO26 = new CEODTO("Uma", 47, 4600000, houseList.get(25));
        CEODTO ceoDTO27 = new CEODTO("Thirumalai", 53, 5100000, houseList.get(26));
        CEODTO ceoDTO28 = new CEODTO("Sindhu", 45, 4450000, houseList.get(27));
        CEODTO ceoDTO29 = new CEODTO("Manikandan", 52, 5000000, houseList.get(28));
        CEODTO ceoDTO30 = new CEODTO("Rajalakshmi", 48, 4700000, houseList.get(29));

        list.add(ceoDTO1);
        list.add(ceoDTO2);
        list.add(ceoDTO3);
        list.add(ceoDTO4);
        list.add(ceoDTO5);
        list.add(ceoDTO6);
        list.add(ceoDTO7);
        list.add(ceoDTO8);
        list.add(ceoDTO9);
        list.add(ceoDTO10);
        list.add(ceoDTO11);
        list.add(ceoDTO12);
        list.add(ceoDTO13);
        list.add(ceoDTO14);
        list.add(ceoDTO15);
        list.add(ceoDTO16);
        list.add(ceoDTO17);
        list.add(ceoDTO18);
        list.add(ceoDTO19);
        list.add(ceoDTO20);
        list.add(ceoDTO21);
        list.add(ceoDTO22);
        list.add(ceoDTO23);
        list.add(ceoDTO24);
        list.add(ceoDTO25);
        list.add(ceoDTO26);
        list.add(ceoDTO27);
        list.add(ceoDTO28);
        list.add(ceoDTO29);
        list.add(ceoDTO30);

        return list;
    }
}
