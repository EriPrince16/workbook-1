package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose sandwich size:");
        System.out.println("1: Regular ($5.45)");
        System.out.println("2: Large ($8.95)");
        System.out.print("Enter your choice (1 or 2): ");
        int sizeChoice = scanner.nextInt();

        double basePrice;
        if (sizeChoice == 1) {
            basePrice = 5.45;
        } else if (sizeChoice == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Invalid size selection.");
            return;
        }

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        double discount = 0.0;

        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }

        double discountAmount = basePrice * discount;
        double finalPrice = basePrice - discountAmount;

        System.out.printf("Final price of your sandwich: $%.2f\n", finalPrice);
    }
}
