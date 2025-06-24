package com.xworkz.jerry.runner;

import com.xworkz.jerry.dto.CameraDto;
import com.xworkz.jerry.repository.CameraRepository;
import com.xworkz.jerry.repository.CameraRepositoryImpl;

import java.util.Collection;
import java.util.Iterator;

public class CameraRunner {
    public static void main(String[] args) {

        CameraRepository cameraRepository = new CameraRepositoryImpl();
        Collection<CameraDto> collection = cameraRepository.findAll();

        System.out.println("Camera that support RAW file format: ");
        for (CameraDto cameraDto : collection) {
            if (cameraDto.getFileFormat().equalsIgnoreCase("raw")) {
                System.out.println("Camera Brand: " + cameraDto.getBrand());
            }
        }
        System.out.println("====================================");
        Iterator<CameraDto> cameraDtoIterator = collection.iterator();
        while (cameraDtoIterator.hasNext()) {
            CameraDto cameraDto = cameraDtoIterator.next();
            System.out.println("Camera Brand: " + cameraDto.getBrand());
            System.out.println("Price: " + cameraDto.getPrice());
            System.out.println("Resolution: " + cameraDto.getResolution());
            System.out.println("HasWifi: " + cameraDto.isHasWifi());
            System.out.println("File Format support: " + cameraDto.getFileFormat());
            System.out.println("====================================");
        }
    }
}
