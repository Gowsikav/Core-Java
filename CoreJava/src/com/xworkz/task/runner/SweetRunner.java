package com.xworkz.task.runner;

import com.xworkz.task.Dessert;
import com.xworkz.task.Sweet;

public class SweetRunner {
    public static void main(String[] args) {
        Sweet sweet = new Sweet();
        Dessert dessert = new Dessert(sweet);
        dessert.invoke();
    }
}
