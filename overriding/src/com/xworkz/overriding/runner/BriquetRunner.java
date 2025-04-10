package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Bell;
import com.xworkz.overriding.internal.Briquet;

public class BriquetRunner
{
    public static void main(String[] args) {
        Briquet briquet = new Briquet();
        briquet.describe();

        Bell bell = new Bell();
        bell.describe();
        bell.ring();

        Briquet alertBell = new Bell();
        alertBell.describe();
    }
}
