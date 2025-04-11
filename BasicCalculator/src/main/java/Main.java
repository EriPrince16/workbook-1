import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter number 2: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What do you want to do? ");
        System.out.print("Enter 'add' , 'subtract' , 'multiply' or 'divide': ");
        String action = scanner.nextLine();

        System.out.println("Calculating......");

        double result = num1 * num2;
        System.out.println("The answer is: " + result);
    }

}

