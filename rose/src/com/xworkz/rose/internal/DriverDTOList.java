package com.xworkz.rose.internal;

import com.xworkz.rose.dto.DriverDTO;
import com.xworkz.rose.dto.VehicleDTO;

import java.util.LinkedList;
import java.util.List;

public class DriverDTOList {

    public DriverDTOList()
    {
        System.out.println("DriverDTOList constructor");
    }

    public List<DriverDTO> getDriverList()
    {
        System.out.println("getDriverList method in DriverDTOList");

        List<DriverDTO> list=new LinkedList<>();
        VehicleDTOList vehicleDTOList=new VehicleDTOList();
        List<VehicleDTO> vehicleList = vehicleDTOList.getVehicleList();

        DriverDTO driverDTO1 = new DriverDTO("Arumugam", "TN01A1234", 2008, vehicleList.get(0));
        DriverDTO driverDTO2 = new DriverDTO("Selvam", "TN02B2345", 2009, vehicleList.get(1));
        DriverDTO driverDTO3 = new DriverDTO("Kumaravel", "TN03C3456", 2010, vehicleList.get(2));
        DriverDTO driverDTO4 = new DriverDTO("Thangavel", "TN04D4567", 2007, vehicleList.get(3));
        DriverDTO driverDTO5 = new DriverDTO("Periyasamy", "TN05E5678", 2011, vehicleList.get(4));
        DriverDTO driverDTO6 = new DriverDTO("Dhanasekar", "TN06F6789", 2012, vehicleList.get(5));
        DriverDTO driverDTO7 = new DriverDTO("Ilango", "TN07G7890", 2006, vehicleList.get(6));
        DriverDTO driverDTO8 = new DriverDTO("Muthukumaran", "TN08H8901", 2013, vehicleList.get(7));
        DriverDTO driverDTO9 = new DriverDTO("Sankaran", "TN09J9012", 2009, vehicleList.get(8));
        DriverDTO driverDTO10 = new DriverDTO("Gopal", "TN10K0123", 2014, vehicleList.get(9));

        DriverDTO driverDTO11 = new DriverDTO("Ravichandran", "TN11L1234", 2005, vehicleList.get(10));
        DriverDTO driverDTO12 = new DriverDTO("Rajamani", "TN12M2345", 2008, vehicleList.get(11));
        DriverDTO driverDTO13 = new DriverDTO("Velmurugan", "TN13N3456", 2006, vehicleList.get(12));
        DriverDTO driverDTO14 = new DriverDTO("Sundararajan", "TN14P4567", 2007, vehicleList.get(13));
        DriverDTO driverDTO15 = new DriverDTO("Marimuthu", "TN15Q5678", 2009, vehicleList.get(14));
        DriverDTO driverDTO16 = new DriverDTO("Venkatesan", "TN16R6789", 2011, vehicleList.get(15));
        DriverDTO driverDTO17 = new DriverDTO("Natarajan", "TN17S7890", 2010, vehicleList.get(16));
        DriverDTO driverDTO18 = new DriverDTO("Annamalai", "TN18T8901", 2012, vehicleList.get(17));
        DriverDTO driverDTO19 = new DriverDTO("Pazhani", "TN19U9012", 2013, vehicleList.get(18));
        DriverDTO driverDTO20 = new DriverDTO("Sekar", "TN20V0123", 2008, vehicleList.get(19));

        DriverDTO driverDTO21 = new DriverDTO("Baskaran", "TN21W1234", 2006, vehicleList.get(20));
        DriverDTO driverDTO22 = new DriverDTO("Jayakumar", "TN22X2345", 2007, vehicleList.get(21));
        DriverDTO driverDTO23 = new DriverDTO("Manikandan", "TN23Y3456", 2005, vehicleList.get(22));
        DriverDTO driverDTO24 = new DriverDTO("Shanmugam", "TN24Z4567", 2009, vehicleList.get(23));
        DriverDTO driverDTO25 = new DriverDTO("Karthikeyan", "TN25A5678", 2010, vehicleList.get(24));
        DriverDTO driverDTO26 = new DriverDTO("Parthiban", "TN26B6789", 2011, vehicleList.get(25));
        DriverDTO driverDTO27 = new DriverDTO("Loganathan", "TN27C7890", 2008, vehicleList.get(26));
        DriverDTO driverDTO28 = new DriverDTO("Ramasamy", "TN28D8901", 2013, vehicleList.get(27));
        DriverDTO driverDTO29 = new DriverDTO("Ragunathan", "TN29E9012", 2014, vehicleList.get(28));
        DriverDTO driverDTO30 = new DriverDTO("Chandran", "TN30F0123", 2006, vehicleList.get(29));

        list.add(driverDTO1);
        list.add(driverDTO2);
        list.add(driverDTO3);
        list.add(driverDTO4);
        list.add(driverDTO5);
        list.add(driverDTO6);
        list.add(driverDTO7);
        list.add(driverDTO8);
        list.add(driverDTO9);
        list.add(driverDTO10);
        list.add(driverDTO11);
        list.add(driverDTO12);
        list.add(driverDTO13);
        list.add(driverDTO14);
        list.add(driverDTO15);
        list.add(driverDTO16);
        list.add(driverDTO17);
        list.add(driverDTO18);
        list.add(driverDTO19);
        list.add(driverDTO20);
        list.add(driverDTO21);
        list.add(driverDTO22);
        list.add(driverDTO23);
        list.add(driverDTO24);
        list.add(driverDTO25);
        list.add(driverDTO26);
        list.add(driverDTO27);
        list.add(driverDTO28);
        list.add(driverDTO29);
        list.add(driverDTO30);

        return list;
    }
}
