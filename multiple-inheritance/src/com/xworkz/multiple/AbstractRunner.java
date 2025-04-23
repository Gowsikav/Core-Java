package com.xworkz.multiple;

import com.xworkz.multiple.abstractclass.Hospital;
import com.xworkz.multiple.abstractclass.Medical;

public class AbstractRunner {
    public static void main(String[] args) {
        Hospital hospital=new Medical();
        hospital.service();
        hospital.display();
        hospital.medicine();

        Medical medical=new Medical();
        medical.service();
        medical.display();
        medical.medicine();
    }
}
