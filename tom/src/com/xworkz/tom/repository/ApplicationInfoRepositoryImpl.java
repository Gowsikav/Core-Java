package com.xworkz.tom.repository;

import com.xworkz.tom.dto.ApplicationInfoDto;
import com.xworkz.tom.dto.OwnerDto;
import com.xworkz.tom.util.AppType;
import com.xworkz.tom.util.Version;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ApplicationInfoRepositoryImpl implements ApplicationInfoRepository{
    public ApplicationInfoRepositoryImpl()
    {
        System.out.println("ApplicationInfoRepository implementation constructor");
    }

    @Override
    public List<ApplicationInfoDto> findAll() {
        System.out.println("findAll method in ApplicationInfoRepository implementation");
        List<ApplicationInfoDto> applicationInfoDtoList=new ArrayList<>();

        OwnerDto owner1 = new OwnerDto("Alice", "alice@gmail.com", 8362947492L);
        ApplicationInfoDto app1 = new ApplicationInfoDto("ChatApp", Version.RELEASE,
                LocalDate.of(2023, 5, 20), 150.0, AppType.SOCIAL, false, 5.99,
                Arrays.asList(owner1));
        applicationInfoDtoList.add(app1);

        OwnerDto owner2 = new OwnerDto("Bob", "bob@gmail.com", 9348537833L);
        ApplicationInfoDto app2 = new ApplicationInfoDto("TaskManager", Version.BETA,
                LocalDate.of(2022, 8, 10), 120.0, AppType.UTILITY, true, 0.0,
                Arrays.asList(owner2));
        applicationInfoDtoList.add(app2);

        OwnerDto owner3 = new OwnerDto("Charlie", "charlie@gmail.com", 9012345678L);
        ApplicationInfoDto app3 = new ApplicationInfoDto("StudyHub", Version.ALPHA,
                LocalDate.of(2021, 12, 5), 300.5, AppType.EDUCATION, false, 3.99,
                Arrays.asList(owner3));
        applicationInfoDtoList.add(app3);

        OwnerDto owner4 = new OwnerDto("David", "david@gmail.com", 8123456789L);
        ApplicationInfoDto app4 = new ApplicationInfoDto("FitTrack", Version.RELEASE,
                LocalDate.of(2024, 1, 15), 180.0, AppType.UTILITY, false, 4.99,
                Arrays.asList(owner4));
        applicationInfoDtoList.add(app4);

        OwnerDto owner5 = new OwnerDto("Eva", "eva@gmail.com", 9988776655L);
        ApplicationInfoDto app5 = new ApplicationInfoDto("MindMap", Version.BETA,
                LocalDate.of(2023, 3, 10), 210.0, AppType.EDUCATION, true, 0.0,
                Arrays.asList(owner5));
        applicationInfoDtoList.add(app5);

        OwnerDto owner6 = new OwnerDto("Frank", "frank@gmail.com", 7766554433L);
        ApplicationInfoDto app6 = new ApplicationInfoDto("QuickNote", Version.ALPHA,
                LocalDate.of(2020, 7, 18), 80.0, AppType.BUSINESS, false, 1.49,
                Arrays.asList(owner6));
        applicationInfoDtoList.add(app6);

        OwnerDto owner7 = new OwnerDto("Grace", "grace@gmail.com", 6655443322L);
        ApplicationInfoDto app7 = new ApplicationInfoDto("GameZone", Version.RELEASE,
                LocalDate.of(2024, 6, 5), 500.0, AppType.GAME, false, 9.99,
                Arrays.asList(owner7));
        applicationInfoDtoList.add(app7);

        OwnerDto owner8 = new OwnerDto("Hank", "hank@gmail.com", 7788990011L);
        ApplicationInfoDto app8 = new ApplicationInfoDto("BizSuite", Version.BETA,
                LocalDate.of(2021, 9, 25), 250.0, AppType.BUSINESS, false, 7.99,
                Arrays.asList(owner8));
        applicationInfoDtoList.add(app8);

        OwnerDto owner9 = new OwnerDto("Ivy", "ivy@gmail.com", 8899001122L);
        ApplicationInfoDto app9 = new ApplicationInfoDto("LearnCode", Version.RELEASE,
                LocalDate.of(2022, 2, 14), 330.0, AppType.EDUCATION, true, 0.0,
                Arrays.asList(owner9));
        applicationInfoDtoList.add(app9);

        OwnerDto owner10 = new OwnerDto("Jake", "jake@gmail.com", 9000111222L);
        ApplicationInfoDto app10 = new ApplicationInfoDto("SocialBuzz", Version.ALPHA,
                LocalDate.of(2023, 11, 1), 270.0, AppType.SOCIAL, false, 2.99,
                Arrays.asList(owner10));
        applicationInfoDtoList.add(app10);

        OwnerDto owner11 = new OwnerDto("Liam", "liam@gmail.com", 9111222333L);
        ApplicationInfoDto app11 = new ApplicationInfoDto("PhotoSnap", Version.BETA,
                LocalDate.of(2022, 10, 18), 175.0, AppType.SOCIAL, false, 1.99,
                Arrays.asList(owner11));
        applicationInfoDtoList.add(app11);

        OwnerDto owner12 = new OwnerDto("Mia", "mia@gmail.com", 9222333444L);
        ApplicationInfoDto app12 = new ApplicationInfoDto("NoteTaker", Version.RELEASE,
                LocalDate.of(2021, 1, 5), 95.0, AppType.UTILITY, true, 0.0,
                Arrays.asList(owner12));
        applicationInfoDtoList.add(app12);

        OwnerDto owner13 = new OwnerDto("Noah", "noah@gmail.com", 9333444555L);
        ApplicationInfoDto app13 = new ApplicationInfoDto("BrainTrain", Version.ALPHA,
                LocalDate.of(2020, 4, 12), 220.0, AppType.EDUCATION, false, 2.49,
                Arrays.asList(owner13));
        applicationInfoDtoList.add(app13);

        OwnerDto owner14 = new OwnerDto("Olivia", "olivia@gmail.com", 9444555666L);
        ApplicationInfoDto app14 = new ApplicationInfoDto("HealthMate", Version.RELEASE,
                LocalDate.of(2023, 2, 8), 140.0, AppType.UTILITY, false, 4.49,
                Arrays.asList(owner14));
        applicationInfoDtoList.add(app14);

        OwnerDto owner15 = new OwnerDto("Paul", "paul@gmail.com", 9555666777L);
        ApplicationInfoDto app15 = new ApplicationInfoDto("CodeLab", Version.BETA,
                LocalDate.of(2022, 6, 22), 310.0, AppType.EDUCATION, true, 0.0,
                Arrays.asList(owner15));
        applicationInfoDtoList.add(app15);

        OwnerDto owner16 = new OwnerDto("Quinn", "quinn@gmail.com", 9666777888L);
        ApplicationInfoDto app16 = new ApplicationInfoDto("FinTrack", Version.RELEASE,
                LocalDate.of(2024, 3, 30), 280.0, AppType.BUSINESS, false, 6.99,
                Arrays.asList(owner16));
        applicationInfoDtoList.add(app16);

        OwnerDto owner17 = new OwnerDto("Ruby", "ruby@gmail.com", 9777888999L);
        ApplicationInfoDto app17 = new ApplicationInfoDto("WordMaster", Version.ALPHA,
                LocalDate.of(2021, 7, 14), 200.0, AppType.EDUCATION, false, 3.49,
                Arrays.asList(owner17));
        applicationInfoDtoList.add(app17);

        OwnerDto owner18 = new OwnerDto("Steve", "steve@gmail.com", 9888999000L);
        ApplicationInfoDto app18 = new ApplicationInfoDto("CryptoMate", Version.RELEASE,
                LocalDate.of(2024, 5, 1), 450.0, AppType.BUSINESS, false, 8.99,
                Arrays.asList(owner18));
        applicationInfoDtoList.add(app18);

        OwnerDto owner19 = new OwnerDto("Tina", "tina@gmail.com", 9999000111L);
        ApplicationInfoDto app19 = new ApplicationInfoDto("PhotoEditX", Version.BETA,
                LocalDate.of(2023, 8, 27), 275.0, AppType.SOCIAL, false, 2.49,
                Arrays.asList(owner19));
        applicationInfoDtoList.add(app19);

        OwnerDto owner20 = new OwnerDto("Uma", "uma@gmail.com", 9112233445L);
        ApplicationInfoDto app20 = new ApplicationInfoDto("GameBox", Version.ALPHA,
                LocalDate.of(2022, 9, 9), 550.0, AppType.GAME, false, 11.99,
                Arrays.asList(owner20));
        applicationInfoDtoList.add(app20);

        OwnerDto owner21 = new OwnerDto("Victor", "victor@gmail.com", 9123456789L);
        ApplicationInfoDto app21 = new ApplicationInfoDto("PlannerPro", Version.RELEASE,
                LocalDate.of(2022, 11, 2), 185.0, AppType.UTILITY, false, 3.99,
                Arrays.asList(owner21));
        applicationInfoDtoList.add(app21);

        OwnerDto owner22 = new OwnerDto("Wendy", "wendy@gmail.com", 9234567890L);
        ApplicationInfoDto app22 = new ApplicationInfoDto("StudyStack", Version.BETA,
                LocalDate.of(2021, 10, 15), 205.0, AppType.EDUCATION, true, 0.0,
                Arrays.asList(owner22));
        applicationInfoDtoList.add(app22);

        OwnerDto owner23 = new OwnerDto("Xander", "xander@gmail.com", 9345678901L);
        ApplicationInfoDto app23 = new ApplicationInfoDto("BizVault", Version.ALPHA,
                LocalDate.of(2020, 3, 7), 320.0, AppType.BUSINESS, false, 6.49,
                Arrays.asList(owner23));
        applicationInfoDtoList.add(app23);

        OwnerDto owner24 = new OwnerDto("Yara", "yara@gmail.com", 9456789012L);
        ApplicationInfoDto app24 = new ApplicationInfoDto("HealthPlus", Version.RELEASE,
                LocalDate.of(2023, 6, 1), 195.0, AppType.UTILITY, false, 4.49,
                Arrays.asList(owner24));
        applicationInfoDtoList.add(app24);

        OwnerDto owner25 = new OwnerDto("Zane", "zane@gmail.com", 9567890123L);
        ApplicationInfoDto app25 = new ApplicationInfoDto("SpeedGame", Version.BETA,
                LocalDate.of(2024, 1, 9), 470.0, AppType.GAME, false, 10.99,
                Arrays.asList(owner25));
        applicationInfoDtoList.add(app25);

        OwnerDto owner26 = new OwnerDto("Anita", "anita@gmail.com", 9678901234L);
        ApplicationInfoDto app26 = new ApplicationInfoDto("InstaScan", Version.ALPHA,
                LocalDate.of(2021, 4, 18), 260.0, AppType.SOCIAL, false, 1.49,
                Arrays.asList(owner26));
        applicationInfoDtoList.add(app26);

        OwnerDto owner27 = new OwnerDto("Brian", "brian@gmail.com", 9789012345L);
        ApplicationInfoDto app27 = new ApplicationInfoDto("DocuSync", Version.RELEASE,
                LocalDate.of(2023, 9, 12), 230.0, AppType.BUSINESS, false, 5.49,
                Arrays.asList(owner27));
        applicationInfoDtoList.add(app27);

        OwnerDto owner28 = new OwnerDto("Catherine", "catherine@gmail.com", 9890123456L);
        ApplicationInfoDto app28 = new ApplicationInfoDto("QuizTime", Version.BETA,
                LocalDate.of(2022, 5, 24), 145.0, AppType.EDUCATION, false, 2.99,
                Arrays.asList(owner28));
        applicationInfoDtoList.add(app28);

        OwnerDto owner29 = new OwnerDto("Derek", "derek@gmail.com", 9901234567L);
        ApplicationInfoDto app29 = new ApplicationInfoDto("WorkFlow", Version.RELEASE,
                LocalDate.of(2024, 2, 17), 310.0, AppType.UTILITY, false, 4.99,
                Arrays.asList(owner29));
        applicationInfoDtoList.add(app29);

        OwnerDto owner30 = new OwnerDto("Eliza", "eliza@gmail.com", 9012345670L);
        ApplicationInfoDto app30 = new ApplicationInfoDto("PixelDraw", Version.ALPHA,
                LocalDate.of(2021, 8, 29), 390.0, AppType.SOCIAL, false, 3.49,
                Arrays.asList(owner30));
        applicationInfoDtoList.add(app30);

        OwnerDto owner31 = new OwnerDto("Felix", "felix@gmail.com", 9123412341L);
        ApplicationInfoDto app31 = new ApplicationInfoDto("MindPalace", Version.BETA,
                LocalDate.of(2023, 1, 15), 275.0, AppType.EDUCATION, false, 3.75,
                Arrays.asList(owner31));
        applicationInfoDtoList.add(app31);

        OwnerDto owner32 = new OwnerDto("Georgia", "georgia@gmail.com", 9234523452L);
        ApplicationInfoDto app32 = new ApplicationInfoDto("QuickCalc", Version.ALPHA,
                LocalDate.of(2020, 2, 20), 95.0, AppType.UTILITY, true, 0.0,
                Arrays.asList(owner32));
        applicationInfoDtoList.add(app32);

        OwnerDto owner33 = new OwnerDto("Harry", "harry@gmail.com", 9345634563L);
        ApplicationInfoDto app33 = new ApplicationInfoDto("FitPro", Version.RELEASE,
                LocalDate.of(2022, 10, 10), 310.0, AppType.UTILITY, false, 5.49,
                Arrays.asList(owner33));
        applicationInfoDtoList.add(app33);

        OwnerDto owner34 = new OwnerDto("Isla", "isla@gmail.com", 9456745674L);
        ApplicationInfoDto app34 = new ApplicationInfoDto("GameRush", Version.BETA,
                LocalDate.of(2023, 7, 21), 530.0, AppType.GAME, false, 9.49,
                Arrays.asList(owner34));
        applicationInfoDtoList.add(app34);

        OwnerDto owner35 = new OwnerDto("Jack", "jack@gmail.com", 9567856785L);
        ApplicationInfoDto app35 = new ApplicationInfoDto("BizTool", Version.ALPHA,
                LocalDate.of(2021, 6, 12), 225.0, AppType.BUSINESS, false, 6.25,
                Arrays.asList(owner35));
        applicationInfoDtoList.add(app35);

        OwnerDto owner36 = new OwnerDto("Kara", "kara@gmail.com", 9678967896L);
        ApplicationInfoDto app36 = new ApplicationInfoDto("EduAid", Version.RELEASE,
                LocalDate.of(2023, 4, 18), 190.0, AppType.EDUCATION, true, 0.0,
                Arrays.asList(owner36));
        applicationInfoDtoList.add(app36);

        OwnerDto owner37 = new OwnerDto("Leo", "leo@gmail.com", 9789078907L);
        ApplicationInfoDto app37 = new ApplicationInfoDto("PhotoCraft", Version.ALPHA,
                LocalDate.of(2020, 11, 5), 260.0, AppType.SOCIAL, false, 2.75,
                Arrays.asList(owner37));
        applicationInfoDtoList.add(app37);

        OwnerDto owner38 = new OwnerDto("Mona", "mona@gmail.com", 9890189018L);
        ApplicationInfoDto app38 = new ApplicationInfoDto("GameMaster", Version.RELEASE,
                LocalDate.of(2024, 3, 25), 570.0, AppType.GAME, false, 12.49,
                Arrays.asList(owner38));
        applicationInfoDtoList.add(app38);

        OwnerDto owner39 = new OwnerDto("Neil", "neil@gmail.com", 9901290129L);
        ApplicationInfoDto app39 = new ApplicationInfoDto("DocTrack", Version.BETA,
                LocalDate.of(2022, 5, 2), 245.0, AppType.BUSINESS, false, 5.89,
                Arrays.asList(owner39));
        applicationInfoDtoList.add(app39);

        OwnerDto owner40 = new OwnerDto("Olga", "olga@gmail.com", 9012301230L);
        ApplicationInfoDto app40 = new ApplicationInfoDto("LangLearn", Version.ALPHA,
                LocalDate.of(2021, 9, 30), 280.0, AppType.EDUCATION, false, 4.99,
                Arrays.asList(owner40));
        applicationInfoDtoList.add(app40);

        OwnerDto owner41 = new OwnerDto("Peter", "peter@gmail.com", 9123123123L);
        ApplicationInfoDto app41 = new ApplicationInfoDto("CalcKing", Version.RELEASE,
                LocalDate.of(2023, 12, 5), 160.0, AppType.UTILITY, false, 2.99,
                Arrays.asList(owner41));
        applicationInfoDtoList.add(app41);

        OwnerDto owner42 = new OwnerDto("Queenie", "queenie@gmail.com", 9234234234L);
        ApplicationInfoDto app42 = new ApplicationInfoDto("MemoMaster", Version.BETA,
                LocalDate.of(2022, 9, 15), 135.0, AppType.EDUCATION, false, 1.99,
                Arrays.asList(owner42));
        applicationInfoDtoList.add(app42);

        OwnerDto owner43 = new OwnerDto("Ray", "ray@gmail.com", 9345345345L);
        ApplicationInfoDto app43 = new ApplicationInfoDto("ChatBuzz", Version.ALPHA,
                LocalDate.of(2024, 2, 19), 210.0, AppType.SOCIAL, false, 3.49,
                Arrays.asList(owner43));
        applicationInfoDtoList.add(app43);

        OwnerDto owner44 = new OwnerDto("Sophie", "sophie@gmail.com", 9456456456L);
        ApplicationInfoDto app44 = new ApplicationInfoDto("DataBank", Version.RELEASE,
                LocalDate.of(2021, 11, 11), 400.0, AppType.BUSINESS, false, 7.99,
                Arrays.asList(owner44));
        applicationInfoDtoList.add(app44);

        OwnerDto owner45 = new OwnerDto("Tom", "tom@gmail.com", 9567567567L);
        ApplicationInfoDto app45 = new ApplicationInfoDto("MindQuiz", Version.BETA,
                LocalDate.of(2023, 6, 30), 185.0, AppType.EDUCATION, true, 0.0,
                Arrays.asList(owner45));
        applicationInfoDtoList.add(app45);

        OwnerDto owner46 = new OwnerDto("Uma", "uma@gmail.com", 9678678678L);
        ApplicationInfoDto app46 = new ApplicationInfoDto("GameShot", Version.ALPHA,
                LocalDate.of(2020, 12, 10), 520.0, AppType.GAME, false, 10.49,
                Arrays.asList(owner46));
        applicationInfoDtoList.add(app46);

        OwnerDto owner47 = new OwnerDto("Violet", "violet@gmail.com", 9789789789L);
        ApplicationInfoDto app47 = new ApplicationInfoDto("TrackTime", Version.RELEASE,
                LocalDate.of(2024, 4, 6), 245.0, AppType.UTILITY, false, 4.59,
                Arrays.asList(owner47));
        applicationInfoDtoList.add(app47);

        OwnerDto owner48 = new OwnerDto("Will", "will@gmail.com", 9890890890L);
        ApplicationInfoDto app48 = new ApplicationInfoDto("BizStream", Version.BETA,
                LocalDate.of(2022, 8, 8), 290.0, AppType.BUSINESS, false, 6.79,
                Arrays.asList(owner48));
        applicationInfoDtoList.add(app48);

        OwnerDto owner49 = new OwnerDto("Xenia", "xenia@gmail.com", 9901901901L);
        ApplicationInfoDto app49 = new ApplicationInfoDto("LearnFast", Version.ALPHA,
                LocalDate.of(2021, 3, 22), 200.0, AppType.EDUCATION, false, 3.25,
                Arrays.asList(owner49));
        applicationInfoDtoList.add(app49);

        OwnerDto owner50 = new OwnerDto("Yusuf", "yusuf@gmail.com", 9012012012L);
        ApplicationInfoDto app50 = new ApplicationInfoDto("PhotoFun", Version.RELEASE,
                LocalDate.of(2023, 5, 1), 310.0, AppType.SOCIAL, false, 4.99,
                Arrays.asList(owner50));
        applicationInfoDtoList.add(app50);

        return applicationInfoDtoList;
    }
}
