package com.xworkz.jerry.runner;

import com.xworkz.jerry.dto.CameraDto;

import java.util.ArrayList;
import java.util.Collection;

public class CameraRunner {
    public static void main(String[] args) {

        CameraDto cameraDto1=new CameraDto("Canon", 84000, 24.2, true, "RAW");
        CameraDto cameraDto2=new CameraDto("Nikon", 76000, 20.9, true, "JPEG");
        CameraDto cameraDto3=new CameraDto("Sony", 10000, 26.1, true, "RAW");
        CameraDto cameraDto4=new CameraDto("Fuji film", 87000, 24.3, true, "JPEG");
        CameraDto cameraDto5=new CameraDto("Panasonic", 50000, 18.0, false, "MP4");
        CameraDto cameraDto6=new CameraDto("Olympus", 49000, 16.1, true, "RAW");
        CameraDto cameraDto7=new CameraDto("GoPro", 35000, 12.0, true, "MP4");
        CameraDto cameraDto8=new CameraDto("Leica", 20000, 47.3, false, "DNG");
        CameraDto cameraDto9=new CameraDto("Pentax", 62000, 24.0, true, "JPEG");
        CameraDto cameraDto10=new CameraDto("Samsung", 28000, 20.2, false, "JPEG");

        Collection<CameraDto> collection=new ArrayList<>();
        collection.add(cameraDto1);
        collection.add(cameraDto2);
        collection.add(cameraDto3);
        collection.add(cameraDto4);
        collection.add(cameraDto5);
        collection.add(cameraDto6);
        collection.add(cameraDto7);
        collection.add(cameraDto8);
        collection.add(cameraDto9);
        collection.add(cameraDto10);

        for(CameraDto cameraDto:collection)
        {
            System.out.println("Camera Brand: "+cameraDto.getBrand());
            System.out.println("Price: "+cameraDto.getPrice());
            System.out.println("Resolution: "+cameraDto.getResolution());
            System.out.println("HasWifi: "+cameraDto.isHasWifi());
            System.out.println("File Format support: "+cameraDto.getFileFormat());
            System.out.println("====================================");
        }
    }
}
