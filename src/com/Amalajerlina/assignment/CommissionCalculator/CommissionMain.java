package com.Amalajerlina.assignment.CommissionCalculator;
import java.util.Scanner;

// Student class with default constructor
class Student {
    public Student() {
        System.out.println("Student object is created");
    }
}

// Commission class
class Commission {
    String name;
    String address;
    String phone;
    double salesAmount;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Phone: ");
        phone = sc.nextLine();
        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
        // sc.close(); // Optional, avoid closing if reusing Scanner
    }

    void calculateCommission() {
        double commission = 0;
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0;
        }
        System.out.println("Commission for " + name + " is: " + commission);
    }
}

// Main class
public class CommissionMain {
    public static void main(String[] args) {
        Student s = new Student(); // Default constructor called
        Commission c = new Commission();
        c.acceptDetails();
        c.calculateCommission();
    }
}

