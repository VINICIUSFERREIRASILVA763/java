package org.example;
import entities.Product;
import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Enter product data:");
        System.out.print("Name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Price:");
        double price=sc.nextDouble();
    System.out.print("Quantity in stock:");
    int quantity= sc.nextInt();
    Product p =new Product(name,price,quantity);

        System.out.printf("Product data: %s, $%.2f, %d units, Total:$ %.2f %n ",p.name ,p.price, p.quantity, p.valueInStock());
        System.out.print("Enter the number of products to be added in stock:");
        quantity =sc.nextInt();
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
