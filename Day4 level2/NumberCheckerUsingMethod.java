import java.util.Scanner;

public class NumberCheckerUsingMethod {

    // Method to check whether the number is positive or negative
    public static String isPositive(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero"; // In case the number is zero
        }
    }

    // Method to check whether the number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;  // number1 is greater
        } else if (number1 == number2) {
            return 0;  // numbers are equal
        } else {
            return -1; // number1 is less
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store the 5 numbers
        int[] numbers = new int[5];

        // Take user input for the 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array and process each number
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            // Check if the number is positive or negative
            String positivity = isPositive(number);
            System.out.println("Number " + (i + 1) + ": " + number + " is " + positivity);

            if (positivity.equals("Positive")) {
                // If positive, check if it's even or odd
                String evenOdd = isEven(number);
                System.out.println("Number " + (i + 1) + ": " + number + " is " + evenOdd);
            }
        }

        // Compare the first and last numbers in the array
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        // Display the result of the comparison
        if (result == 1) {
            System.out.println("\nThe first number is greater than the last number.");
        } else if (result == 0) {
            System.out.println("\nThe first number is equal to the last number.");
        } else {
            System.out.println("\nThe first number is less than the last number.");
        }

        scanner.close();
    }
}
