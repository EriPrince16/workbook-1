package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("How many hours have you worked? " );
        double hoursWorked = scanner.nextDouble();

        System.out.print("What is your pay rate? ");
        double payRate = scanner.nextDouble();

        System.out.println("Calculating......");

        double grossPay = hoursWorked * payRate;

        System.out.printf("%s, your gross pay is $%.2f%n", name, grossPay);



    }

}
