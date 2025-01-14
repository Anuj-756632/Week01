import java.util.Scanner;

public class StringOutOFBoundExceptionEx {

    // Method to handle StringIndexOutOfBoundsException
    public static void handelStringOutOfBoundsException() {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Read a string from the user
        System.out.println("Enter string");
        String text = input.next();

        // Read an index value from the user
        System.out.println("Enter index");
        int index = input.nextInt();

        try {
            // Attempt to retrieve the character at the specified index from the string
            char ch = text.charAt(index);

            // Print the character if no exception occurred
            System.out.println(ch);

        } catch (StringIndexOutOfBoundsException ex) {
            // Catch the StringIndexOutOfBoundsException if the index is out of range for the string
            System.out.println(ex.getMessage());  // Print the exception message

            // Print the stack trace to show where the exception occurred in the code
            ex.printStackTrace();  // This prints the detailed exception information
        }
    }

    public static void main(String[] args) {
        // Call the method to handle the StringIndexOutOfBoundsException
        handelStringOutOfBoundsException();
    }
}
