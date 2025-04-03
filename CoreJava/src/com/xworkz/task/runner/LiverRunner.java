package com.xworkz.task.runner;

import com.xworkz.task.HumanLiver;
import com.xworkz.task.Liver;

public class LiverRunner {
    public static void main(String[] args) {
        Liver liver = new Liver();
        HumanLiver humanLiver = new HumanLiver(liver);
        humanLiver.invoke();
    }
}
