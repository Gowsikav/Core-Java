package com.xworkz.multiple.external;

import com.xworkz.multiple.internal.ManipalHospital;

public class HospitalRunner implements ManipalHospital {

    @Override
    public void service() {
        System.out.println("Service in HospitalRunner");
    }
}
