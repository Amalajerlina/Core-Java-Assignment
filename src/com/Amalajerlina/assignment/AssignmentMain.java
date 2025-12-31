package com.Amalajerlina.assignment;
import com.Amalajerlina.assignment.employees.Manager;
import com.Amalajerlina.assignment.employees.Developer;
import com.Amalajerlina.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

    public static void main(String[] args) {

        Manager manager = new Manager("Amala", 1001, 90000, 6);
        Developer developer = new Developer("Jerlina", 1002, 65000, "Java");

        System.out.println("Manager Details:");
        EmployeeUtilities.displayEmployee(manager);

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.displayEmployee(developer);

        EmployeeUtilities.increaseSalary(developer, 5000);

        System.out.println("\nDeveloper After Salary Increment:");
        EmployeeUtilities.displayEmployee(developer);
    }
}
