package com.xworkz.modifier;

import com.xworkz.modifier.external.*;
import com.xworkz.modifier.internal.*;

public class RunnerClass
{
    public static void main(String[] args)
    {
        God god=new God();
        god.puja();
        Priest priest=new Priest();
        priest.displayDetails();
        System.out.println("==============");

        Father father = new Father();
        father.sermon();
        Believer believer = new Believer();
        believer.attendService();
        System.out.println("==============");

        Visitor visitor = new Visitor();
        visitor.enjoy();
        LifeGuard lifeguard = new LifeGuard();
        lifeguard.monitor();
        System.out.println("==============");

        Collector collector = new Collector();
        collector.collect();
        Trador trador = new Trador();
        trador.trade();
        System.out.println("==============");

        Operator operator = new Operator();
        operator.operate();
        Engineer engineer = new Engineer();
        engineer.testDrone();
        System.out.println("==============");

        Barber barber = new Barber();
        barber.styleHair();
        Customer customer = new Customer();
        customer.getStyled();
        System.out.println("==============");

        MakeupArtist artist = new MakeupArtist();
        artist.makeup();
        ShopKeeper shopkeeper = new ShopKeeper();
        shopkeeper.sellProduct();
        System.out.println("==============");

        Model model = new Model();
        model.showcase();
        Buyer buyer = new Buyer();
        buyer.buyPerfume();
        System.out.println("==============");

        Player player = new Player();
        player.play();
        Dealer dealer = new Dealer();
        dealer.distribute();
        System.out.println("==============");

        Diver diver = new Diver();
        diver.collect();
        Tourist tourist = new Tourist();
        tourist.admire();
        System.out.println("==============");

        Ranger ranger = new Ranger();
        ranger.patrol();
        Camper camper = new Camper();
        camper.hike();
        System.out.println("==============");

    }
}
