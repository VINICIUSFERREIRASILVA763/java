package org.example;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        double values;
        String name;
        System.out.print("Enter name:");
        name = sc.nextLine();
        student.setName(name);
        System.out.print("Enter the first quarter:");

        do {
            values = sc.nextDouble();
            student.setTrimestre1(values);
            if (student.getTrimestre1() > 30) {
                System.out.println("The maximum value for the first quarter is 30.");
                System.out.print("Enter again:");
            }
        } while (student.getTrimestre1() > 30);

        System.out.print("Enter the second quarter:");
        do {
            values = sc.nextDouble();
            student.setTrimestre2(values);
            if (student.getTrimestre2() > 35) {
                System.out.println("The maximum value for the second quarter is 35.");
                System.out.print("Enter again:");
            }
        } while (student.getTrimestre2() > 35);

        System.out.print("enter the third trimester:");
        do {
            values = sc.nextDouble();
            student.setTrimestre3(values);
            if (student.getTrimestre3() > 35) {
                System.out.println("The maximum value for the third quarter is 35.");
                System.out.print("Enter again:");
            }

        } while (student.getTrimestre3() > 35);


        System.out.printf("Final Grade = %.2f%n", student.notaFinal());
        System.out.println(student.aprovacao());
        sc.close();
    }
}
