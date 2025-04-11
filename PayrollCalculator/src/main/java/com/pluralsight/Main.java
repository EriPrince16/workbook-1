package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("How many hours have you worked? " );
        double hasWorked = scanner.nextDouble();

        System.out.print("What is your pay rate? ");
        double payRate = scanner.nextDouble();

        System.out.println("Calculating......");

        double grossPay = hasWorked * payRate;

        System.out.println(name + ", your gross pay is $" + grossPay);



    }

}
