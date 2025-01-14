import java.util.Scanner;

// Program to Create a substring using the `charAt` method and compare it with the `substring` method
public class CreateAndCompareString {

    // Method to create a substring using the charAt() method
    public static String subStringUsingcharAtMethod(int start, int end, String string) {
        String str = ""; // Initialize an empty string to build the substring

        // Loop from the start index to the end index to construct the substring
        for (int i = start; i < end; i++) {
            str += string.charAt(i);  // Append each character to the substring string
        }
        
        // Return the generated substring
        return str;
    }

    // Method to compare two strings and check if they are equal
    public static boolean compare(String str, String str2) {
        // Use the equals() method to compare the two strings
        if (str.equals(str2)) {
            return true;  // If strings are equal, return true
        } else {
            return false;  // If strings are not equal, return false
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a String");
        String string = input.next();  // Read the string input from the user

        // Prompt the user to enter the start index
        System.out.println("Enter Start index");
        int start = input.nextInt();  // Read the start index from the user

        // Prompt the user to enter the end index
        System.out.println("Enter End index");
        int end = input.nextInt();  // Read the end index from the user

        // Create a substring using the built-in substring() method of the String class
        String str2 = string.substring(start, end);  // This is the expected result

        // Compare the substring generated by the charAt method and the substring() method
        if (compare(subStringUsingcharAtMethod(start, end, string), str2)) {
            // If both substrings are equal, print this message
            System.out.println("Both are equal");
        } else {
            // If the substrings are not equal, print this message
            System.out.println("Both are not equal");
        }

        // Close the scanner to avoid resource leaks
        input.close();
    }
}