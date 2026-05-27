package org.example;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.print("Enter rectangle width:");
        rectangle.width = sc.nextDouble();
        System.out.print("Enter rextangle height:");
        rectangle.height = sc.nextDouble();
        System.out.println(rectangle.toString());
        }
    }
