package com.xworkz.rose.internal;

import com.xworkz.rose.dto.CEODTO;
import com.xworkz.rose.dto.CompanyDTO;

import java.util.LinkedList;
import java.util.List;

public class CompanyDTOList {

    public CompanyDTOList()
    {
        System.out.println("CompanyDTOList constructor");
    }

    public List<CompanyDTO> getCompanyList()
    {
        System.out.println("getCompanyList method in CompanyDTOList");

        List<CompanyDTO> list=new LinkedList<>();
        CEODTOList ceodtoList=new CEODTOList();
        List<CEODTO> ceoList=ceodtoList.getCEOList();

        CompanyDTO companyDTO1 = new CompanyDTO("TechNova", "IT", 500, ceoList.get(0));
        CompanyDTO companyDTO2 = new CompanyDTO("InnoCore", "Finance", 300, ceoList.get(1));
        CompanyDTO companyDTO3 = new CompanyDTO("GreenFusion", "Energy", 450, ceoList.get(2));
        CompanyDTO companyDTO4 = new CompanyDTO("MediPlus", "Healthcare", 600, ceoList.get(3));
        CompanyDTO companyDTO5 = new CompanyDTO("AgroLine", "Agriculture", 250, ceoList.get(4));
        CompanyDTO companyDTO6 = new CompanyDTO("SkyNetics", "Aerospace", 700, ceoList.get(5));
        CompanyDTO companyDTO7 = new CompanyDTO("AutoCraft", "Automobile", 800, ceoList.get(6));
        CompanyDTO companyDTO8 = new CompanyDTO("DataHive", "IT", 520, ceoList.get(7));
        CompanyDTO companyDTO9 = new CompanyDTO("FinEdge", "Finance", 330, ceoList.get(8));
        CompanyDTO companyDTO10 = new CompanyDTO("PowerPulse", "Energy", 470, ceoList.get(9));

        CompanyDTO companyDTO11 = new CompanyDTO("CureWell", "Healthcare", 620, ceoList.get(10));
        CompanyDTO companyDTO12 = new CompanyDTO("FarmNest", "Agriculture", 270, ceoList.get(11));
        CompanyDTO companyDTO13 = new CompanyDTO("OrbitX", "Aerospace", 710, ceoList.get(12));
        CompanyDTO companyDTO14 = new CompanyDTO("DriveMax", "Automobile", 830, ceoList.get(13));
        CompanyDTO companyDTO15 = new CompanyDTO("CodeWave", "IT", 540, ceoList.get(14));
        CompanyDTO companyDTO16 = new CompanyDTO("BankSphere", "Finance", 350, ceoList.get(15));
        CompanyDTO companyDTO17 = new CompanyDTO("SolarGrid", "Energy", 490, ceoList.get(16));
        CompanyDTO companyDTO18 = new CompanyDTO("MediCore", "Healthcare", 640, ceoList.get(17));
        CompanyDTO companyDTO19 = new CompanyDTO("CropWise", "Agriculture", 280, ceoList.get(18));
        CompanyDTO companyDTO20 = new CompanyDTO("AeroGen", "Aerospace", 720, ceoList.get(19));

        CompanyDTO companyDTO21 = new CompanyDTO("TorqueMotors", "Automobile", 850, ceoList.get(20));
        CompanyDTO companyDTO22 = new CompanyDTO("SoftNest", "IT", 560, ceoList.get(21));
        CompanyDTO companyDTO23 = new CompanyDTO("CashWise", "Finance", 360, ceoList.get(22));
        CompanyDTO companyDTO24 = new CompanyDTO("VoltStream", "Energy", 500, ceoList.get(23));
        CompanyDTO companyDTO25 = new CompanyDTO("MediCure", "Healthcare", 660, ceoList.get(24));
        CompanyDTO companyDTO26 = new CompanyDTO("AgriRoot", "Agriculture", 290, ceoList.get(25));
        CompanyDTO companyDTO27 = new CompanyDTO("JetAxis", "Aerospace", 740, ceoList.get(26));
        CompanyDTO companyDTO28 = new CompanyDTO("MotorEdge", "Automobile", 870, ceoList.get(27));
        CompanyDTO companyDTO29 = new CompanyDTO("NextGenTech", "IT", 580, ceoList.get(28));
        CompanyDTO companyDTO30 = new CompanyDTO("FinTrust", "Finance", 380, ceoList.get(29));

        list.add(companyDTO1);
        list.add(companyDTO2);
        list.add(companyDTO3);
        list.add(companyDTO4);
        list.add(companyDTO5);
        list.add(companyDTO6);
        list.add(companyDTO7);
        list.add(companyDTO8);
        list.add(companyDTO9);
        list.add(companyDTO10);
        list.add(companyDTO11);
        list.add(companyDTO12);
        list.add(companyDTO13);
        list.add(companyDTO14);
        list.add(companyDTO15);
        list.add(companyDTO16);
        list.add(companyDTO17);
        list.add(companyDTO18);
        list.add(companyDTO19);
        list.add(companyDTO20);
        list.add(companyDTO21);
        list.add(companyDTO22);
        list.add(companyDTO23);
        list.add(companyDTO24);
        list.add(companyDTO25);
        list.add(companyDTO26);
        list.add(companyDTO27);
        list.add(companyDTO28);
        list.add(companyDTO29);
        list.add(companyDTO30);

        return list;
    }
}
