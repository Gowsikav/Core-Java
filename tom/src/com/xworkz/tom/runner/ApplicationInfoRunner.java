package com.xworkz.tom.runner;

import com.xworkz.tom.dto.ApplicationInfoDto;
import com.xworkz.tom.dto.OwnerDto;
import com.xworkz.tom.repository.ApplicationInfoRepository;
import com.xworkz.tom.repository.ApplicationInfoRepositoryImpl;
import com.xworkz.tom.util.AppType;
import com.xworkz.tom.util.Version;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationInfoRunner {
    public static void main(String[] args) {
        ApplicationInfoRepository applicationInfoRepository=new ApplicationInfoRepositoryImpl();
        List<ApplicationInfoDto> applicationList = applicationInfoRepository.findAll();

        System.out.println("All application by Type");
        List<ApplicationInfoDto> typeList=applicationList.stream().filter(applicationInfoDto -> applicationInfoDto.getType().equals(AppType.EDUCATION)).collect(Collectors.toList());
        typeList.forEach(System.out::println);

        System.out.println("=================================");
        System.out.println("ChargePerUser for FitTrack");
        applicationList.stream().filter(applicationInfoDto -> applicationInfoDto.getName().equalsIgnoreCase("FitTrack")).forEach(applicationInfoDto -> System.out.println(applicationInfoDto.getChargePerUser()));

        System.out.println("=====================================");
        System.out.println("Created date in desc order");
        applicationList.stream().sorted(Comparator.comparing(ApplicationInfoDto::getCreatedDate).reversed()).forEach(applicationInfoDto -> System.out.println("App Name: "+applicationInfoDto.getName()+" Created date: "+applicationInfoDto.getCreatedDate()));

        System.out.println("====================================");
        System.out.println("Sort all applications by Size in Desc order");
        List<ApplicationInfoDto> sortBySize=applicationList.stream().sorted(Comparator.comparing(ApplicationInfoDto::getSize).reversed()).collect(Collectors.toList());
        sortBySize.forEach(System.out::println);

        System.out.println("===================================");
        System.out.println("version by name,type");
        applicationList.stream().filter(applicationInfoDto -> applicationInfoDto.getName().equalsIgnoreCase("NoteTaker") && applicationInfoDto.getType().equals(AppType.UTILITY)).forEach(applicationInfoDto -> System.out.println("version: "+applicationInfoDto.getVersion()));

        System.out.println("=====================================");
        System.out.println("Find all applications by ownerName");
        applicationList.stream().filter(app -> app.getOwners().stream().anyMatch(owner -> owner.getOwnerName().equalsIgnoreCase("paul"))).forEach(System.out::println);

        System.out.println("======================================");
        System.out.println("Owners by app name");
        applicationList.stream().filter(applicationInfoDto -> applicationInfoDto.getName().equalsIgnoreCase("GameBox")).flatMap(app -> app.getOwners().stream()).forEach(System.out::println);

        System.out.println("======================================");
        System.out.println("Find all owner email's");
        applicationList.stream().flatMap(app -> app.getOwners().stream())
                .map(ownerDto -> ownerDto.getOwnerName()+" - "+ ownerDto.getEmailId())
                .forEach(System.out::println);

        System.out.println("====================================");
        System.out.println("Owner name and email by type and version");
        applicationList.stream()
                .filter(app -> app.getType() == AppType.GAME && app.getVersion() == Version.BETA)
                .flatMap(app -> app.getOwners().stream())
                .map(owner -> owner.getOwnerName() + " - " + owner.getEmailId())
                .forEach(System.out::println);

        System.out.println("=====================================");
        System.out.println("Application by created date");
        applicationList.stream().filter(applicationInfoDto -> applicationInfoDto.getCreatedDate().isEqual(LocalDate.of(2024, 5, 1))).forEach(System.out::println);

        System.out.println("========================================");
        OwnerDto owner = new OwnerDto("Steve", "steve@gmail.com", 9888999000L);
        ApplicationInfoDto app = new ApplicationInfoDto("CryptoMate", Version.RELEASE,
                LocalDate.of(2024, 5, 1), 450.0, AppType.BUSINESS, false, 8.99,
                Arrays.asList(owner));
        applicationList.add(32,app);
        System.out.println("Application added "+applicationList.get(32));

        System.out.println("Removed application at index 40: "+applicationList.remove(40));

        System.out.println("Owner details at index 20: "+applicationList.get(20).getOwners());

        OwnerDto owner1 = new OwnerDto("Anjali", "anjali@gmail.com", 9887399270L);
        ApplicationInfoDto app1 = new ApplicationInfoDto("Sudo", Version.ALPHA,
                LocalDate.of(2022, 9, 10), 289.0, AppType.GAME, true, 0,
                Arrays.asList(owner1));
        applicationList.set(15,app1);
        System.out.println("Application set at index 15 "+applicationList.get(15));

        List<OwnerDto> newOwners = Arrays.asList(
                new OwnerDto("Raja", "raja038@email.com", 6382947292L)
        );

        ApplicationInfoDto oldApp = applicationList.get(12);
        ApplicationInfoDto updatedApp = new ApplicationInfoDto(
                oldApp.getName(),
                oldApp.getVersion(),
                oldApp.getCreatedDate(),
                oldApp.getSize(),
                oldApp.getType(),
                oldApp.isFree(),
                oldApp.getChargePerUser(),
                newOwners
        );
        applicationList.set(12, updatedApp);
        System.out.println("Owners replaced at index 12 "+applicationList.get(12));

    }
}
