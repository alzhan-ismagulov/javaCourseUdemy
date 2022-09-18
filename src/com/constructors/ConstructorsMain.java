package com.constructors;

import com.domainmodel.Employee;

import java.util.Date;

public class ConstructorsMain {
    public static void main(String[] args) {

        Employee employee = new Employee("Alzhan", "PM", 2000);
        Employee employee1 = new Employee("Jhon", "PM", 2000);
        System.out.println(employee);
        System.out.println(employee1);
    }
}
