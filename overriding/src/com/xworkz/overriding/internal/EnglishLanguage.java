package com.xworkz.overriding.internal;

public class EnglishLanguage extends Language{
    public EnglishLanguage() {
        System.out.println("EnglishLanguage constructor");
    }

    @Override
    public void describe() {
        System.out.println("English is a widely spoken international language.");
    }

    public void grammarTip() {
        System.out.println("Remember: 'their', 'there', and 'they’re' have different meanings!");
    }
}
