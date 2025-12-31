package com.Amalajerlina.assignment.CircleClass;
import java.util.Scanner;

class Circle {
    double radius;
    String color;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        radius = sc.nextDouble();
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter Color: ");
        color = sc.nextLine();
        // sc.close(); // Optional
    }

    void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.getInput();
        c.calcArea();
    }
}
