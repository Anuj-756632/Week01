import java.util.Scanner;

public class SumOfNaturalNumbersUsingTwoWays {

    // Method to find the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        // Base case: if n is 1, return 1 (the sum of first 1 natural number)
        if (n == 1) {
            return 1;
        } else {
            // Recursive case: sum of first n natural numbers = n + sum of first (n-1) natural numbers
            return n + sumUsingRecursion(n - 1);
        }
    }

    // Method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number n
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the input is a positive natural number
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive natural number.");
            return; // Exit the program if input is not a natural number
        }

        // Calculate the sum using recursion
        int sumRecursion = sumUsingRecursion(n);
        
        // Calculate the sum using the formula
        int sumFormula = sumUsingFormula(n);

        // Compare both results and print the result
        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);

        // Check if both results are equal
        if (sumRecursion == sumFormula) {
            System.out.println("Both methods give the correct result.");
        } else {
            System.out.println("There is an issue with the results.");
        }

        scanner.close();
    }
}
