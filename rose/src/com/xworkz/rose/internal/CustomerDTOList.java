package com.xworkz.rose.internal;

import com.xworkz.rose.dto.CustomerDTO;
import com.xworkz.rose.dto.PassportDTO;

import java.util.LinkedList;
import java.util.List;

public class CustomerDTOList {

    public CustomerDTOList()
    {
        System.out.println("CustomerDTOList constructor");
    }

    public List<CustomerDTO> getCustomerList()
    {
        System.out.println("getCustomerList method in CustomerDTOList");

        List<CustomerDTO> list=new LinkedList<>();
        PassportDTOList passportDTOList=new PassportDTOList();
        List<PassportDTO> passportList = passportDTOList.getPassportList();

        CustomerDTO customerDTO1 = new CustomerDTO("Arulmozhi", 34, "arulmozhi@email.com", passportList.get(0));
        CustomerDTO customerDTO2 = new CustomerDTO("Kaviyarasi", 29, "kaviyarasi@email.com", passportList.get(1));
        CustomerDTO customerDTO3 = new CustomerDTO("Ilamparithi", 41, "ilamparithi@email.com", passportList.get(2));
        CustomerDTO customerDTO4 = new CustomerDTO("Nandhini", 27, "nandhini@email.com", passportList.get(3));
        CustomerDTO customerDTO5 = new CustomerDTO("Thamizharasi", 38, "thamizharasi@email.com", passportList.get(4));
        CustomerDTO customerDTO6 = new CustomerDTO("Velmurugan", 36, "velmurugan@email.com", passportList.get(5));
        CustomerDTO customerDTO7 = new CustomerDTO("Yazhini", 31, "yazhini@email.com", passportList.get(6));
        CustomerDTO customerDTO8 = new CustomerDTO("Senthil", 45, "senthil@email.com", passportList.get(7));
        CustomerDTO customerDTO9 = new CustomerDTO("Madhumitha", 33, "madhumitha@email.com", passportList.get(8));
        CustomerDTO customerDTO10 = new CustomerDTO("Sundarapandian", 39, "sundarapandian@email.com", passportList.get(9));

        CustomerDTO customerDTO11 = new CustomerDTO("Divyabharathi", 26, "divya.b@email.com", passportList.get(10));
        CustomerDTO customerDTO12 = new CustomerDTO("Iniyan", 42, "iniyan@email.com", passportList.get(11));
        CustomerDTO customerDTO13 = new CustomerDTO("Meenatchi", 30, "meenatchi@email.com", passportList.get(12));
        CustomerDTO customerDTO14 = new CustomerDTO("Perarasan", 37, "perarasan@email.com", passportList.get(13));
        CustomerDTO customerDTO15 = new CustomerDTO("Kanmani", 28, "kanmani@email.com", passportList.get(14));
        CustomerDTO customerDTO16 = new CustomerDTO("Ezhilarasi", 35, "ezhilarasi@email.com", passportList.get(15));
        CustomerDTO customerDTO17 = new CustomerDTO("Pugazhendhi", 44, "pugazhendhi@email.com", passportList.get(16));
        CustomerDTO customerDTO18 = new CustomerDTO("Selvalakshmi", 32, "selvalakshmi@email.com", passportList.get(17));
        CustomerDTO customerDTO19 = new CustomerDTO("Aadhavan", 40, "aadhavan@email.com", passportList.get(18));
        CustomerDTO customerDTO20 = new CustomerDTO("Kayalvizhi", 29, "kayalvizhi@email.com", passportList.get(19));

        CustomerDTO customerDTO21 = new CustomerDTO("Thamizhchelvan", 43, "thamizhc@email.com", passportList.get(20));
        CustomerDTO customerDTO22 = new CustomerDTO("Abinaya", 30, "abinaya@email.com", passportList.get(21));
        CustomerDTO customerDTO23 = new CustomerDTO("Karthikeyan", 36, "karthik@email.com", passportList.get(22));
        CustomerDTO customerDTO24 = new CustomerDTO("Nithyashree", 27, "nithya@email.com", passportList.get(23));
        CustomerDTO customerDTO25 = new CustomerDTO("Sathuriyan", 38, "sathuriyan@email.com", passportList.get(24));
        CustomerDTO customerDTO26 = new CustomerDTO("Manimegalai", 34, "manimegalai@email.com", passportList.get(25));
        CustomerDTO customerDTO27 = new CustomerDTO("Vishnupriya", 31, "vishnupriya@email.com", passportList.get(26));
        CustomerDTO customerDTO28 = new CustomerDTO("Ragupathi", 39, "ragupathi@email.com", passportList.get(27));
        CustomerDTO customerDTO29 = new CustomerDTO("Janani", 33, "janani@email.com", passportList.get(28));
        CustomerDTO customerDTO30 = new CustomerDTO("Vaishnavi", 28, "vaishnavi@email.com", passportList.get(29));

        list.add(customerDTO1);
        list.add(customerDTO2);
        list.add(customerDTO3);
        list.add(customerDTO4);
        list.add(customerDTO5);
        list.add(customerDTO6);
        list.add(customerDTO7);
        list.add(customerDTO8);
        list.add(customerDTO9);
        list.add(customerDTO10);
        list.add(customerDTO11);
        list.add(customerDTO12);
        list.add(customerDTO13);
        list.add(customerDTO14);
        list.add(customerDTO15);
        list.add(customerDTO16);
        list.add(customerDTO17);
        list.add(customerDTO18);
        list.add(customerDTO19);
        list.add(customerDTO20);
        list.add(customerDTO21);
        list.add(customerDTO22);
        list.add(customerDTO23);
        list.add(customerDTO24);
        list.add(customerDTO25);
        list.add(customerDTO26);
        list.add(customerDTO27);
        list.add(customerDTO28);
        list.add(customerDTO29);
        list.add(customerDTO30);

        return list;
    }
}
