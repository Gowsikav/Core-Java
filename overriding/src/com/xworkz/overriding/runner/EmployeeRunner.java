package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Employee;
import com.xworkz.overriding.internal.Engineer;

public class EmployeeRunner
{
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.describe();

        Engineer engineer = new Engineer();
        engineer.describe();
        engineer.code();

        Employee employee1 = new Engineer();
        employee1.describe();
    }
}
