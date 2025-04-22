package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Scanner;

public class DocumentScanner implements Scanner {

    @Override
    public void scan() {
        System.out.println("Running scan in DocumentScanner");
    }
}
