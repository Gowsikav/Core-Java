package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.SolarPoweredBus;
import com.xworkz.overriding.internal.Transport;

public class TransportRunner {
    public static void main(String[] args) {
        Transport basicTransport = new Transport();
        basicTransport.describe();

        SolarPoweredBus ecoBus = new SolarPoweredBus();
        ecoBus.describe();
        ecoBus.deployPanels();

        Transport smartBus = new SolarPoweredBus();
        smartBus.describe();
    }
}
