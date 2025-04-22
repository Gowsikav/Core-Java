package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Remote;

public class TVRemote implements Remote {

    @Override
    public void powerOn() {
        System.out.println("TVRemote powering on the TV");
    }

    @Override
    public void powerOff() {
        System.out.println("TVRemote powering off the TV");
    }

    @Override
    public void volumeUp() {
        System.out.println("TVRemote volume increased");
    }

    @Override
    public void volumeDown() {
        System.out.println("TVRemote volume decreased");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("TVRemote changed the channel to " + channel);
    }
}
