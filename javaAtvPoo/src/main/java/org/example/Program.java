package org.example;
import entities.Product;
import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
      Product p = new Product();
        System.out.println("Enter product data:");
        System.out.print("Name:");
        Scanner sc = new Scanner(System.in);
        p.name = sc.nextLine();
        System.out.print("Price:");
        p.price=sc.nextDouble();
    System.out.print("Quantity in stock:");
    p.quantity= sc.nextInt();
        System.out.printf("Product data: %s, $%.2f, %d units, Total:$ %.2f %n ",p.name ,p.price, p.quantity, p.valueInStock());
        System.out.print("Enter the number of products to be added in stock:");
        int quantity =sc.nextInt();
        p.addProducts(quantity);
        System.out.println(p.quantity);
        System.out.printf(
                "Updated data: %s,$%.2f,%d units,Total:$ %.2f %n",p.name,p.price,p.quantity,p.valueInStock());
        System.out.print("Enter the number of products to be removed from stock:");
        quantity= sc.nextInt();
        p.removeProducts(quantity);
        System.out.printf("Updated data: %s,$%.2f,%d units,Total:$ %.2f",p.name,p.price,p.quantity,p.valueInStock());
      sc.close();
        }
    }
