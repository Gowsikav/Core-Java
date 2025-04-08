package com.xworkz.encapsulation;
import com.xworkz.encapsulation.external.*;
import com.xworkz.encapsulation.internal.*;


public class RunnerClass
{
    public static void main(String[] args) {
        Mutant mutant = new Mutant();
        MutationLab mutationLab = new MutationLab(mutant);
        mutationLab.mutate();
        Activation activation = new Activation(mutant);
        activation.run();
        System.out.println("===============");

        KeyChain keyChain = new KeyChain();
        KeyChainStore store = new KeyChainStore(keyChain);
        store.setup();
        KeyChainDisplay display = new KeyChainDisplay(keyChain);
        display.show();
        System.out.println("===============");

        Tank tank = new Tank();
        TankUnit tankunit = new TankUnit(tank);
        tankunit.deploy();
        TankInspection inspection = new TankInspection(tank);
        inspection.inspect();
        System.out.println("===============");

        Badge badge = new Badge();
        BadgeSystem badgeSystem = new BadgeSystem(badge);
        badgeSystem.generate();
        BadgeVerification verification = new BadgeVerification(badge);
        verification.verify();
        System.out.println("===============");

        PostOffice postOffice = new PostOffice();
        PostOfficeService service = new PostOfficeService(postOffice);
        service.register();
        PostOfficeInfo postOfficeInfo = new PostOfficeInfo(postOffice);
        postOfficeInfo.show();
        System.out.println("================");

        Occupation occupation = new Occupation();
        CareerService careerService = new CareerService(occupation);
        careerService.assign();
        OccupationDetails occupationDetails = new OccupationDetails(occupation);
        occupationDetails.display();
        System.out.println("================");

        Jet jet = new Jet();
        JetOperations jetOperations = new JetOperations(jet);
        jetOperations.configure();
        JetReview jetReview = new JetReview(jet);
        jetReview.review();
        System.out.println("=================");

        Garage garage = new Garage();
        GarageManager garageManager = new GarageManager(garage);
        garageManager.organize();
        GarageReport garageReport = new GarageReport(garage);
        garageReport.report();
        System.out.println("==================");

        Gym gym = new Gym();
        GymService gymService = new GymService(gym);
        gymService.setup();
        GymOverview gymOverview = new GymOverview(gym);
        gymOverview.show();
        System.out.println("==================");

        Apartment apartment = new Apartment();
        ApartmentManager apartmentManager = new ApartmentManager(apartment);
        apartmentManager.manage();
        ApartmentView apartmentView = new ApartmentView(apartment);
        apartmentView.display();
    }
}
