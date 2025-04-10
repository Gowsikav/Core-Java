package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.EnglishLanguage;
import com.xworkz.overriding.internal.Language;

public class LanguageRunner {
    public static void main(String[] args) {
        Language genericLang = new Language();
        genericLang.describe();

        EnglishLanguage english = new EnglishLanguage();
        english.describe();
        english.grammarTip();

        Language spokenLang = new EnglishLanguage();
        spokenLang.describe();
    }
}
