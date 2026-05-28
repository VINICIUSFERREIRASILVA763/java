package org.example;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee= new Employee();

        System.out.print("Name:");
        String name = sc.nextLine();
        employee.setName(name);

        System.out.print("Gross salary:");
        double values = sc.nextDouble();
        employee.setGrossSalary(values);

        System.out.print("Tax:");
        values =sc.nextDouble();
        employee.setTax(values);

        System.out.printf("Employee: %s, $%.2f%n",employee.getName(),employee.netSalary());
        System.out.print("Which percentage to increase salary?");
        values= sc.nextDouble();
        employee.increaseSalary(values);
        System.out.printf("Updated data: %s, $%.2f",employee.getName(),employee.netSalary());

        sc.close();
    }
}