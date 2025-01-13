import java.util.Scanner;

public class NumberIsPositiveNegativeZero {
    
    // Method to check whether the number is positive, negative, or zero
    public static int checkNumber(int number) {
        // If the number is zero, return 0
        if (number == 0) {
            return 0;
        }
        // If the number is negative, return -1
        else if (number < 0) {
            return -1;
        }
        // If the number is positive, return 1
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter number");
        
        // Read the number entered by the user
        int number = input.nextInt();
        
        // Call the checkNumber method and display the result
        // 1 for positive, -1 for negative, 0 for zero
        System.out.println("The number is: " + checkNumber(number));
        
        // Close the scanner to avoid resource leaks
        input.close();
    }
}
