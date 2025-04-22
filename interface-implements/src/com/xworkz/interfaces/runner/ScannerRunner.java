package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.DocumentScanner;
import com.xworkz.interfaces.internal.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {
        Scanner scanner = new DocumentScanner();
        scanner.scan();

        DocumentScanner documentScanner = new DocumentScanner();
        documentScanner.scan();
    }
}
