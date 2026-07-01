package org.example;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar?");
        int n= sc.nextInt();
        double[] vect= new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero:");
            vect[i]=sc.nextDouble();
        }
        double value=0.0;

        System.out.print("VALORES =");
        for (int i = 0; i < n; i++) {
            System.out.printf(" %.1f",vect[i]);
            value+=vect[i];
        }
        System.out.printf("%nSOMA = %.2f",value);
        System.out.printf("%nMEDIA = %.2f",value/n);

        sc.close();
    }
}