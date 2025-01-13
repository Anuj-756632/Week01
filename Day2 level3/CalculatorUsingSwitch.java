import java.util.Scanner;
//
public class CalculatorUsingSwitch {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        // Declare variables for the two numbers and the operator
        double first, second;
        String op;

        // input two numbers and the operator
        System.out.println("Enter first number ");
        first = input.nextDouble();

        System.out.println("Enter second number ");
        second = input.nextDouble();

        System.out.println("Enter operator (+, -, *, /): ");
        op = input.next();

        // Variable to store the result
        double result = 0;

        // Switch case to handle different operations
        switch (op) {
            case "+":
                result = first + second; // Addition
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second; // Subtraction
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second; // Multiplication
                System.out.println("Result: " + result);
                break;

            case "/":
                // Check if the second number is not zero to avoid division by zero
                if (second != 0) {
                    result = first / second; // Division
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                // If the operator is invalid, print an error message
                System.out.println("Invalid Operator.");
                break;
        }

        // Close the scanner to prevent resource leak
        input.close();
    }
}
