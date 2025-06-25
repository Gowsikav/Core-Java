package com.xworkz.jerry.runner;

import com.xworkz.jerry.dto.CameraDto;
import com.xworkz.jerry.repository.CameraRepository;
import com.xworkz.jerry.repository.CameraRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CameraRunner {
    public static void main(String[] args) {

        CameraRepository cameraRepository = new CameraRepositoryImpl();
        Collection<CameraDto> collection = cameraRepository.findAll();

        for (CameraDto cameraDto : collection) {
            System.out.println("Camera Brand: " + cameraDto.getBrand());
            System.out.println("Price: " + cameraDto.getPrice());
            System.out.println("Resolution: " + cameraDto.getResolution());
            System.out.println("HasWifi: " + cameraDto.isHasWifi());
            System.out.println("File Format support: " + cameraDto.getFileFormat());
            System.out.println("====================================");
        }
        System.out.println("Size: "+collection.size());
        Iterator<CameraDto> cameraDtoIterator = collection.iterator();
        while (cameraDtoIterator.hasNext()) {
            CameraDto cameraDto = cameraDtoIterator.next();
            if (cameraDto.getFileFormat().equalsIgnoreCase("raw")) {
                System.out.println("Removed Dto: "+cameraDto);
                cameraDtoIterator.remove();
            }
        }

        System.out.println("After remove size: "+collection.size());

        Collection<CameraDto> extraList=new ArrayList<>();
        CameraDto cameraDto1=new CameraDto("Fuji film", 87000, 24.3, true, "JPEG");
        CameraDto cameraDto2=new CameraDto("Panasonic", 50000, 18.0, false, "MP4");
        extraList.add(cameraDto1);
        extraList.add(cameraDto2);

        System.out.println("Collection containsAll extraList: "+collection.containsAll(extraList));

        CameraDto camera=new CameraDto("GoPro", 35000, 14, true, "MP4");
        System.out.println("Collection contains this dto "+camera+" : "+collection.contains(camera));

        collection.addAll(extraList);
        System.out.println("After addAll size: "+collection.size());

        System.out.println("Is RemovedALl extraList: "+collection.removeAll(extraList));

        System.out.println("After removeAll size: "+collection.size());

        System.out.println("Is collection empty: " + collection.isEmpty());

    }
}
