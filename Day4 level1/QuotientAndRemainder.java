import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find the quotient and remainder of two numbers
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Create an array to store the quotient and remainder
        int[] result = new int[2];
        
        // Calculate the quotient and remainder
        result[0] = number / divisor;  // quotient
        result[1] = number % divisor;  // remainder
        
        // Return the array containing quotient and remainder
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter the dividend and divisor
        System.out.print("Enter the dividend (number): ");
        int number = input.nextInt();
        
        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();
        
        // Check if the divisor is not zero to avoid division by zero
        if (divisor != 0) {
            // Call the method to find the quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);
            
            // Output the quotient and remainder
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        } else {
            // If divisor is zero, print an error message
            System.out.println("Error: Division by zero is not allowed.");
        }
        
        // Close the scanner to avoid resource leaks
        input.close();
    }
}
