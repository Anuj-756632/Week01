import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of first 'n' natural numbers using a loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;  // Initialize sum variable to 0
        
        // Loop from 1 to n and add each number to sum
        for (int i = 1; i <= n; i++) {
            sum += i;  // Add the current number to sum
        }
        
        // Return the calculated sum
        return sum;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter a number 'n'
        System.out.print("Enter a number: ");
        int n = input.nextInt();  // Read the integer input from the user
        
        // Check if the input number is a positive integer
        if (n > 0) {
            // Call the method to calculate the sum of the first 'n' natural numbers
            int result = sumOfNaturalNumbers(n);
            // Output the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        } else {
            // If the input number is less than or equal to 0, display a message
            System.out.println("Please enter a positive integer.");
        }
        
        // Close the scanner to avoid resource leak
        input.close();
    }
}
