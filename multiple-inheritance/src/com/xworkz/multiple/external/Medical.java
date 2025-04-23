package com.xworkz.multiple.external;

import com.xworkz.multiple.internal.ApolloHospital;
import com.xworkz.multiple.internal.Hospital;
import com.xworkz.multiple.internal.ManipalHospital;

public class Medical implements Hospital, ApolloHospital, ManipalHospital {
    @Override
    public void service() {
        System.out.println("service in medical");
    }

    // multiple inheritance

    //class have more than one parent
}
