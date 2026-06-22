package org.example;

import entities.AccountBanking;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        AccountBanking banking;

        System.out.print("Enter account number:");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder:");
        String holderName = sc.nextLine();


        String CheckYN;
        System.out.print("Is there na initial CheckYN (y/n)?");
           CheckYN = sc.nextLine();
            if (CheckYN.equals("y")){

                System.out.print("Enter initial CheckYN value:");
                double firstDeposit = sc.nextDouble();
                 banking = new AccountBanking(accountNumber,holderName,firstDeposit);
            } else {
                banking = new AccountBanking(accountNumber,holderName);
            }

            System.out.println(banking.toString());
         System.out.print("Enter a deposit value:");
         double deposit= sc.nextDouble();
         banking.deposit(deposit);
        System.out.println(banking.getBalance());
        System.out.println("Updated account data:");
        System.out.println(banking.toString());

        System.out.print("Enter a withdraw value:");
        deposit= sc.nextDouble();
        banking.bankWithdrawal(deposit);
        System.out.println("Updated account data:");
        System.out.print(banking.toString());
        sc.close();
        }
    }
