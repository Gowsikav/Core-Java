package com.xworkz.home.runner;

import com.xworkz.home.exception.VideoPlayerException;

public class VideoPlayerSettings {
    public static void main(String[] args) {
        String device = "apple";
        String resolution = "4";

        try {
            if (!device.equalsIgnoreCase("Android") || device.equalsIgnoreCase("iOS")) {
                throw new VideoPlayerException("Device not compatible: " + device);
            }
            System.out.println("Device is compatible: " + device);

            try {
                if (!resolution.equalsIgnoreCase("720p") || resolution.equalsIgnoreCase("1080p") || resolution.equalsIgnoreCase("4K")) {
                    throw new VideoPlayerException("Resolution not supported: " + resolution);
                }
                System.out.println("Resolution is supported: " + resolution);
            } catch (VideoPlayerException e) {
                System.out.println("Inner error: " + e.getMessage());
            }

        } catch (VideoPlayerException e) {
            System.out.println("Outer error: " + e.getMessage());
        }
    }

}

