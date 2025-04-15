package com.pluralsight;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            double dailyRate = 29.99;
            double tollTag = 3.95;
            double gps = 2.95;
            double roadside = 3.95;
            double underageFeeRate = 0.30;

            Scanner input = new Scanner(System.in);

            System.out.print("Pickup date (just type it in, like 2025-04-15): ");
            String pickupDate = input.nextLine();

            System.out.print("How many days will you rent the car? ");
            int days = input.nextInt();
            input.nextLine();

            System.out.print("Do you want an electronic toll tag ($3.95/day)? (yes/no): ");
            String tollChoice = input.nextLine();

            System.out.print("Do you want GPS ($2.95/day)? (yes/no): ");
            String gpsChoice = input.nextLine();

            System.out.print("Do you want roadside assistance ($3.95/day)? (yes/no): ");
            String roadsideChoice = input.nextLine();

            System.out.print("How old are you? ");
            int age = input.nextInt();

            double basicCost = dailyRate * days;

            double optionsCost = 0;

            if (tollChoice.equalsIgnoreCase("yes")) {
                optionsCost += tollTag * days;
            }

            if (gpsChoice.equalsIgnoreCase("yes")) {
                optionsCost += gps * days;
            }

            if (roadsideChoice.equalsIgnoreCase("yes")) {
                optionsCost += roadside * days;
            }

            double underageFee = 0;
            if (age < 25) {
                underageFee = basicCost * underageFeeRate;
            }

            double total = basicCost + optionsCost + underageFee;

            System.out.println("\n--- Rental Summary ---");
            System.out.println("Pickup Date: " + pickupDate);
            System.out.printf("Basic Rental: $%.2f\n", basicCost);
            System.out.printf("Options Total: $%.2f\n", optionsCost);
            System.out.printf("Underage Surcharge: $%.2f\n", underageFee);
            System.out.printf("Total Cost: $%.2f\n", total);

            input.close();
        }
}
