package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Console;
import com.xworkz.overriding.internal.GamingConsole;

public class ConsoleRunner {
    public static void main(String[] args) {
        Console console = new Console();
        console.describe();

        GamingConsole gamingConsole = new GamingConsole();
        gamingConsole.describe();
        gamingConsole.loadGame();

        Console nextGen = new GamingConsole();
        nextGen.describe();
    }
}
