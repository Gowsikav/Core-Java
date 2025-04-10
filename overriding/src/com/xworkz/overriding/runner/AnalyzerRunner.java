package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Analyzer;
import com.xworkz.overriding.internal.Spectrometer;

public class AnalyzerRunner {
    public static void main(String[] args) {
        Analyzer basicAnalyzer = new Analyzer();
        basicAnalyzer.describe();

        Spectrometer laserAnalyzer = new Spectrometer();
        laserAnalyzer.describe();
        laserAnalyzer.measureWavelength();

        Analyzer advancedAnalyzer = new Spectrometer();
        advancedAnalyzer.describe();
    }
}
