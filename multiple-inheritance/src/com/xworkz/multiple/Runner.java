package com.xworkz.multiple;

import com.xworkz.multiple.external.HospitalRunner;
import com.xworkz.multiple.external.Medical;
import com.xworkz.multiple.internal.ApolloHospital;
import com.xworkz.multiple.internal.Hospital;
import com.xworkz.multiple.internal.ManipalHospital;


public class Runner {
    public static void main(String[] args)
    {
        Hospital hospital=new HospitalRunner();
        hospital.service();

        ApolloHospital apolloHospital=new HospitalRunner();
        apolloHospital.service();

        ManipalHospital manipalHospital=new HospitalRunner();
        manipalHospital.service();

        HospitalRunner hospitalRunner=new HospitalRunner();
        hospitalRunner.service();

        Medical medical=new Medical();
        medical.service();

    }
}
