package com.Amalajerlina.assignment.utilities;

import com.Amalajerlina.assignment.employees.Employee;

public class EmployeeUtilities {

    public static void displayEmployee(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }

    public static void increaseSalary(Employee employee, double amount) {
        employee.setSalary(employee.getSalary() + amount);
    }
}

