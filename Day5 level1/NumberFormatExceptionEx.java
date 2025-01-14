import java.util.Scanner;
import java.lang.NumberFormatException;

public class NumberFormatExceptionEx {

    // Method to handle NumberFormatException
    public static void handelNumberFormatException() {
        // Create a scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter String");

        try {
            // Read the string input from the user
            String text = input.next();

            // Try to convert the string to an integer
            int number = Integer.parseInt(text); // This can throw NumberFormatException if input is not a valid number

            // If no exception is thrown, print the converted number
            System.out.println("Number is : " + number);

        } catch (NumberFormatException ex) {
            // Catch NumberFormatException if the string is not a valid integer
            System.out.println("Exception occurred: " + ex.getMessage()); // Print the exception message

            // Print the stack trace to see where the exception occurred
            ex.printStackTrace(); // This prints the detailed stack trace of the exception
        }
    }

    public static void main(String[] args) {
        // Print a message indicating that the program will handle NumberFormatException
        System.out.println("Handle NumberFormatException");

        // Call the method to handle the exception
        handelNumberFormatException();
    }
}
