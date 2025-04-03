package com.xworkz.task.runner;

import com.xworkz.task.BlackAndWhite;
import com.xworkz.task.Television;

public class BlackAndWhiteRunner {
    public static void main(String[] args) {
        BlackAndWhite blackAndWhite = new BlackAndWhite();
        Television television = new Television(blackAndWhite);
        television.invoke();
    }
}
