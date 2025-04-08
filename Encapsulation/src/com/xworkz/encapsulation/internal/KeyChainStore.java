package com.xworkz.encapsulation.internal;

public class KeyChainStore
{
    KeyChain keyChain;

    public KeyChainStore(KeyChain keyChain) {
        this.keyChain = keyChain;
        System.out.println("KeyChainStore Constructor");
    }

    public void setup() {
        keyChain.setMaterial("Metal");
        keyChain.setKeyCount(5);
        keyChain.setBrand("SwissGear");
        keyChain.setCustomized(true);
        keyChain.setPrice(199.99);

        System.out.println("Material: " + keyChain.getMaterial());
        System.out.println("Key Count: " + keyChain.getKeyCount());
        System.out.println("Brand: " + keyChain.getBrand());
        System.out.println("Customized: " + keyChain.isCustomized());
        System.out.println("Price: " + keyChain.getPrice());
    }
}
