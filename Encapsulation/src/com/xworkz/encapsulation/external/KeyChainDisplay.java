package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.KeyChain;

public class KeyChainDisplay
{
    KeyChain keyChain;

    public KeyChainDisplay(KeyChain keyChain) {
        this.keyChain = keyChain;
        System.out.println("KeyChainDisplay Constructor");
    }

    public void show() {
        System.out.println("Material: " + keyChain.getMaterial());
        System.out.println("Key Count: " + keyChain.getKeyCount());
        System.out.println("Brand: " + keyChain.getBrand());
        System.out.println("Customized: " + keyChain.isCustomized());
        System.out.println("Price: " + keyChain.getPrice());
    }
}
