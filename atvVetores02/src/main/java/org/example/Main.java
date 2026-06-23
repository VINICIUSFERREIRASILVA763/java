package org.example;

import entities.Object;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        Object[] vect = new Object[n];

        for (int i = 0; i < vect.length; i++) {
            String name =sc.nextLine();
            double price = sc.nextDouble();
         vect[i] = new Object(name,price);
        }
        double sum= 0.0;
        for (int i = 0; i < vect.length; i++) {
           sum+=vect[i].getPrice();
        }
        double avg = sum / vect.length;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);
        sc.close();
        }
    }
