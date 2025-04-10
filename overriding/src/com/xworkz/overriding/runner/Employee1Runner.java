package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Employee1;
import com.xworkz.overriding.internal.Manager;

public class Employee1Runner
{
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.describe();

        Manager mgr = new Manager();
        mgr.describe();
        mgr.manageTeam();

        Employee1 emp1 = new Manager();
        emp1.describe();
    }
}
