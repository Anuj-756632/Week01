import java.util.Scanner;

public class IllegalArgumentExceptionEx {

    // Method to handle IllegalArgumentException
    public static void handleIllegalArgumentException() {
        // Scanner object to get user input
        Scanner input = new Scanner(System.in);
        
        try {
            // Prompt user to enter a string
            System.out.println("Enter String");
            String text = input.next(); // Read string input from user
            
            // Prompt user to enter start index
            System.out.println("Enter start index");
            int start = input.nextInt(); // Read start index
            
            // Prompt user to enter end index
            System.out.println("Enter end index");
            int end = input.nextInt(); // Read end index
            
            // Attempt to get the substring based on provided indexes
            String str = text.substring(start, end); // This may throw an exception if the indices are invalid
            
        } catch (IllegalArgumentException ex) {
            // Catch IllegalArgumentException if thrown by the substring method
            System.out.println(ex.getMessage()); // Print the exception message
            System.out.println("Calling wrong indexes"); // Inform the user that invalid indexes were used
        } finally {
            // Close the scanner to prevent resource leaks
            input.close();
        }
    }

    public static void main(String[] args) {
        // Print message indicating that we are handling an IllegalArgumentException
        System.out.println("Handle IllegalArgumentException");

        // Call the method that handles the exception
        handleIllegalArgumentException();
    }
}
