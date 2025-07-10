package com.xworkz.rose.internal;

import com.xworkz.rose.dto.HouseDTO;
import com.xworkz.rose.dto.SecurityDTO;

import java.util.LinkedList;
import java.util.List;

public class HouseDTOList {

    public HouseDTOList()
    {
        System.out.println("HouseDTOList constructor");
    }

    public List<HouseDTO> getHouseDtoList()
    {
        System.out.println("getHouseDtoList method in HouseDTOList");

        List<HouseDTO> list=new LinkedList<>();
        SecurityDTOList securityDTOList=new SecurityDTOList();
        List<SecurityDTO> securityList=securityDTOList.getSecurityList();

        HouseDTO houseDTO1 = new HouseDTO("123 Main Street", 4, true, securityList.get(0));
        HouseDTO houseDTO2 = new HouseDTO("456 Oak Avenue", 3, false, securityList.get(1));
        HouseDTO houseDTO3 = new HouseDTO("789 Pine Road", 5, true, securityList.get(2));
        HouseDTO houseDTO4 = new HouseDTO("101 Maple Street", 2, true, securityList.get(3));
        HouseDTO houseDTO5 = new HouseDTO("202 Birch Blvd", 3, false, securityList.get(4));
        HouseDTO houseDTO6 = new HouseDTO("303 Cedar Lane", 4, true, securityList.get(5));
        HouseDTO houseDTO7 = new HouseDTO("404 Elm Drive", 5, true, securityList.get(6));
        HouseDTO houseDTO8 = new HouseDTO("505 Walnut Way", 2, false, securityList.get(7));
        HouseDTO houseDTO9 = new HouseDTO("606 Cherry Circle", 3, true, securityList.get(8));
        HouseDTO houseDTO10 = new HouseDTO("707 Poplar Street", 4, false, securityList.get(9));

        HouseDTO houseDTO11 = new HouseDTO("808 Chestnut Road", 5, true, securityList.get(10));
        HouseDTO houseDTO12 = new HouseDTO("909 Spruce Avenue", 3, true, securityList.get(11));
        HouseDTO houseDTO13 = new HouseDTO("111 Fir Lane", 2, false, securityList.get(12));
        HouseDTO houseDTO14 = new HouseDTO("121 Redwood Blvd", 4, true, securityList.get(13));
        HouseDTO houseDTO15 = new HouseDTO("131 Cypress Street", 5, false, securityList.get(14));
        HouseDTO houseDTO16 = new HouseDTO("141 Dogwood Drive", 3, true, securityList.get(15));
        HouseDTO houseDTO17 = new HouseDTO("151 Willow Road", 4, false, securityList.get(16));
        HouseDTO houseDTO18 = new HouseDTO("161 Magnolia Lane", 2, true, securityList.get(17));
        HouseDTO houseDTO19 = new HouseDTO("171 Aspen Circle", 3, true, securityList.get(18));
        HouseDTO houseDTO20 = new HouseDTO("181 Alder Street", 5, false, securityList.get(19));

        HouseDTO houseDTO21 = new HouseDTO("191 Beech Blvd", 3, true, securityList.get(20));
        HouseDTO houseDTO22 = new HouseDTO("201 Hickory Avenue", 4, false, securityList.get(21));
        HouseDTO houseDTO23 = new HouseDTO("211 Cottonwood Lane", 5, true, securityList.get(22));
        HouseDTO houseDTO24 = new HouseDTO("221 Sycamore Street", 3, true, securityList.get(23));
        HouseDTO houseDTO25 = new HouseDTO("231 Sequoia Road", 4, false, securityList.get(24));
        HouseDTO houseDTO26 = new HouseDTO("241 Juniper Circle", 2, true, securityList.get(25));
        HouseDTO houseDTO27 = new HouseDTO("251 Larch Drive", 3, true, securityList.get(26));
        HouseDTO houseDTO28 = new HouseDTO("261 Tamarack Street", 4, false, securityList.get(27));
        HouseDTO houseDTO29 = new HouseDTO("271 Hazel Avenue", 5, true, securityList.get(28));
        HouseDTO houseDTO30 = new HouseDTO("281 Buckeye Blvd", 3, true, securityList.get(29));

        list.add(houseDTO1);
        list.add(houseDTO2);
        list.add(houseDTO3);
        list.add(houseDTO4);
        list.add(houseDTO5);
        list.add(houseDTO6);
        list.add(houseDTO7);
        list.add(houseDTO8);
        list.add(houseDTO9);
        list.add(houseDTO10);
        list.add(houseDTO11);
        list.add(houseDTO12);
        list.add(houseDTO13);
        list.add(houseDTO14);
        list.add(houseDTO15);
        list.add(houseDTO16);
        list.add(houseDTO17);
        list.add(houseDTO18);
        list.add(houseDTO19);
        list.add(houseDTO20);
        list.add(houseDTO21);
        list.add(houseDTO22);
        list.add(houseDTO23);
        list.add(houseDTO24);
        list.add(houseDTO25);
        list.add(houseDTO26);
        list.add(houseDTO27);
        list.add(houseDTO28);
        list.add(houseDTO29);
        list.add(houseDTO30);

        return list;
    }
}
