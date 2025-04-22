package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Blender;

public class HandBlender implements Blender {

    @Override
    public void turnOn() {
        System.out.println("HandBlender is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("HandBlender is turned off");
    }

    @Override
    public void setSpeedLevel(int level) {
        System.out.println("HandBlender speed level set to " + level);
    }

    @Override
    public void setTimer(int minutes) {
        System.out.println("HandBlender timer set to " + minutes + " minutes");
    }

    @Override
    public void startBlending() {
        System.out.println("HandBlender is blending");
    }

    @Override
    public void stopBlending() {
        System.out.println("HandBlender has stopped blending");
    }

    @Override
    public void addIngredients(String ingredient) {
        System.out.println("HandBlender added ingredient: " + ingredient);
    }

    @Override
    public void checkBlendStatus() {
        System.out.println("HandBlender is checking blend status");
    }

    @Override
    public void setMode(String mode) {
        System.out.println("HandBlender mode set to " + mode);
    }
}
