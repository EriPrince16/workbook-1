package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        double bobSalary = 50000;
        double garySalary = 200000.99;

        // then code solution
        double highestSalary = Math.max(bobSalary, garySalary);
        // Print out results
        System.out.println("Highest salary is: " + highestSalary);

        // Question 2:
        double carPrice = 12000;
        double truckPrice = 18000;

        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("Lowest price is: " + lowestPrice);

        // Question 3

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the circle is: " + area);

        // Question 4

        double x = 5.0;
        double sqrtX = Math.sqrt(x);

        System.out.println("The square root of x is: " + sqrtX);

        // Question 5

        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between the points are: " + distance);

        // Question 6

        double number = -3.8;
        double absoluteValue = Math.abs(number);

        System.out.println("The absolute positive value is: " + absoluteValue);

        // Question 7

        double randomNumber = Math.random();

        System.out.println("The random number is " + randomNumber);



        // Print the result



    }
}
