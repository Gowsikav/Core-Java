package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.TVRemote;
import com.xworkz.interfaces.internal.Remote;

public class RemoteRunner {
    public static void main(String[] args) {
        Remote remote = new TVRemote();
        remote.powerOn();
        remote.changeChannel(5);
        remote.volumeUp();
        remote.volumeDown();
        remote.powerOff();

        TVRemote tvRemote = new TVRemote();
        tvRemote.powerOn();
        tvRemote.changeChannel(10);
        tvRemote.volumeUp();
        tvRemote.volumeDown();
        tvRemote.powerOff();
    }
}
