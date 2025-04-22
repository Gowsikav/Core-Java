package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.Laptop;
import com.xworkz.interfaces.internal.Computer;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Laptop();
        computer.boot();
        computer.openApp("Word Processor");
        computer.restart();
        computer.sleep();
        computer.shutdown();

        Laptop laptop = new Laptop();
        laptop.boot();
        laptop.openApp("Web Browser");
        laptop.restart();
        laptop.sleep();
        laptop.shutdown();
    }
}
