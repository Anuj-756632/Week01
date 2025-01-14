import java.util.Scanner;
import java.lang.NullPointerException;
public class NullPointerExceptionEx {

    // Method to generate NullPointerException
   
    // Method to handle NullPointerException
    public static void handleNullPointerException() {
        String text = null; // Initializing the string variable to null
        try {
            System.out.println("Attempting to call method on a null reference.");
            // Calling a method on the null reference which will throw NullPointerException
            int length = text.length(); // This will throw NullPointerException
            System.out.println("Length of string: " + length); // This line will not be executed
        } catch (NullPointerException e) {
            // Handling the NullPointerException
            System.out.println("Exception caught: NullPointerException");
            System.out.println("Cannot call method on a null reference.");
        }
    }

    public static void main(String[] args) {
        // First, generate the exception (this will crash the program)
        System.out.println("Generating NullPointerException...");
        // generateNullPointerException(); // Uncomment this line to generate exception without handling

        // Refactor the code to handle the exception
        System.out.println("\nHandling NullPointerException with try-catch...");
        handleNullPointerException(); // This will handle the exception
    }
}
