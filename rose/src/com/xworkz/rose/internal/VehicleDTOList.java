package com.xworkz.rose.internal;

import com.xworkz.rose.dto.CompanyDTO;
import com.xworkz.rose.dto.VehicleDTO;

import java.util.LinkedList;
import java.util.List;

public class VehicleDTOList {

    public VehicleDTOList()
    {
        System.out.println("VehicleDTOList constructor");
    }

    public List<VehicleDTO> getVehicleList()
    {
        System.out.println("getVehicleList method in VehicleDTOList");

        List<VehicleDTO> list=new LinkedList<>();
        CompanyDTOList companyDTOList=new CompanyDTOList();
        List<CompanyDTO> companyList=companyDTOList.getCompanyList();

        VehicleDTO vehicleDTO1 = new VehicleDTO("Tesla", "Model S", 2022, companyList.get(0));
        VehicleDTO vehicleDTO2 = new VehicleDTO("BMW", "X5", 2021, companyList.get(1));
        VehicleDTO vehicleDTO3 = new VehicleDTO("Audi", "Q7", 2023, companyList.get(2));
        VehicleDTO vehicleDTO4 = new VehicleDTO("Hyundai", "Creta", 2020, companyList.get(3));
        VehicleDTO vehicleDTO5 = new VehicleDTO("Kia", "Seltos", 2022, companyList.get(4));
        VehicleDTO vehicleDTO6 = new VehicleDTO("Maruti", "Swift", 2021, companyList.get(5));
        VehicleDTO vehicleDTO7 = new VehicleDTO("Honda", "Civic", 2019, companyList.get(6));
        VehicleDTO vehicleDTO8 = new VehicleDTO("Toyota", "Fortuner", 2023, companyList.get(7));
        VehicleDTO vehicleDTO9 = new VehicleDTO("Ford", "EcoSport", 2020, companyList.get(8));
        VehicleDTO vehicleDTO10 = new VehicleDTO("Mahindra", "XUV700", 2022, companyList.get(9));

        VehicleDTO vehicleDTO11 = new VehicleDTO("Tata", "Harrier", 2021, companyList.get(10));
        VehicleDTO vehicleDTO12 = new VehicleDTO("Renault", "Kiger", 2023, companyList.get(11));
        VehicleDTO vehicleDTO13 = new VehicleDTO("Nissan", "Magnite", 2020, companyList.get(12));
        VehicleDTO vehicleDTO14 = new VehicleDTO("Skoda", "Kushaq", 2022, companyList.get(13));
        VehicleDTO vehicleDTO15 = new VehicleDTO("MG", "Astor", 2021, companyList.get(14));
        VehicleDTO vehicleDTO16 = new VehicleDTO("Volkswagen", "Taigun", 2023, companyList.get(15));
        VehicleDTO vehicleDTO17 = new VehicleDTO("Jeep", "Compass", 2020, companyList.get(16));
        VehicleDTO vehicleDTO18 = new VehicleDTO("Isuzu", "D-Max", 2021, companyList.get(17));
        VehicleDTO vehicleDTO19 = new VehicleDTO("Volvo", "XC60", 2022, companyList.get(18));
        VehicleDTO vehicleDTO20 = new VehicleDTO("Land Rover", "Defender", 2023, companyList.get(19));

        VehicleDTO vehicleDTO21 = new VehicleDTO("Porsche", "Macan", 2021, companyList.get(20));
        VehicleDTO vehicleDTO22 = new VehicleDTO("Jaguar", "F-Pace", 2020, companyList.get(21));
        VehicleDTO vehicleDTO23 = new VehicleDTO("Mercedes", "GLA", 2022, companyList.get(22));
        VehicleDTO vehicleDTO24 = new VehicleDTO("Lexus", "RX500h", 2023, companyList.get(23));
        VehicleDTO vehicleDTO25 = new VehicleDTO("Mini", "Cooper", 2021, companyList.get(24));
        VehicleDTO vehicleDTO26 = new VehicleDTO("Ferrari", "Roma", 2022, companyList.get(25));
        VehicleDTO vehicleDTO27 = new VehicleDTO("Lamborghini", "Urus", 2023, companyList.get(26));
        VehicleDTO vehicleDTO28 = new VehicleDTO("Bentley", "Bentayga", 2021, companyList.get(27));
        VehicleDTO vehicleDTO29 = new VehicleDTO("Rolls-Royce", "Cullinan", 2022, companyList.get(28));
        VehicleDTO vehicleDTO30 = new VehicleDTO("Bugatti", "Chiron", 2023, companyList.get(29));

        list.add(vehicleDTO1);
        list.add(vehicleDTO2);
        list.add(vehicleDTO3);
        list.add(vehicleDTO4);
        list.add(vehicleDTO5);
        list.add(vehicleDTO6);
        list.add(vehicleDTO7);
        list.add(vehicleDTO8);
        list.add(vehicleDTO9);
        list.add(vehicleDTO10);
        list.add(vehicleDTO11);
        list.add(vehicleDTO12);
        list.add(vehicleDTO13);
        list.add(vehicleDTO14);
        list.add(vehicleDTO15);
        list.add(vehicleDTO16);
        list.add(vehicleDTO17);
        list.add(vehicleDTO18);
        list.add(vehicleDTO19);
        list.add(vehicleDTO20);
        list.add(vehicleDTO21);
        list.add(vehicleDTO22);
        list.add(vehicleDTO23);
        list.add(vehicleDTO24);
        list.add(vehicleDTO25);
        list.add(vehicleDTO26);
        list.add(vehicleDTO27);
        list.add(vehicleDTO28);
        list.add(vehicleDTO29);
        list.add(vehicleDTO30);

        return list;
    }
}
