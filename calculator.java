// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("You can perform basic arithmetic operations here!");
        System.out.println();
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.println("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter second number: ");
        double b = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    System.out.println("check and enter an valid input");
                    
                    return; 
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                scanner.close();
                return; // Exit early for invalid operator
        }

        System.out.println("The result is: " + result);
        scanner.close();
    }
}
