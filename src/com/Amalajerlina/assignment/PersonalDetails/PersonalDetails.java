package com.Amalajerlina.assignment.PersonalDetails;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter Full Name with Initial:");
        String name = sc.nextLine();

        System.out.println("Enter Roll Number:");
        int rollNo = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter Grade:");
        String grade = sc.nextLine();

        System.out.println("Enter Percentage:");
        String percentage = sc.nextLine();

        // Output
        System.out.println("\n--- Student Details ---");
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println("\t" + grade);
        System.out.println("\t\t" + percentage);

        sc.close();
    }
}
