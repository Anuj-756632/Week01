import java.util.Scanner;

// Program to compare two Strings
public class CompareTwoStrings {

    // Method to compare two strings manually by checking character by character
    public static boolean compareStrings(String string1, String string2) {
        // First, check if the lengths of both strings are the same
        if (string1.length() != string2.length()) {
            return false;  // If lengths are different, they cannot be equal
        }
        
        // Loop through each character in both strings and compare them
        for (int i = 0; i < string1.length(); i++) {
            // If the characters at the same position are not equal, return false
            if (string1.charAt(i) != string2.charAt(i)) {
                return false;
            }
        }
        
        // If no differences were found, the strings are equal
        return true;
    }

    // Method to compare two strings using the built-in equals method
    public static boolean compareWithEquals(String string1, String string2) {
        // First, check if the lengths of both strings are the same
        if (string1.length() != string2.length()) {
            return false;  // If lengths are different, they cannot be equal
        }
        
        // Use the built-in String.equals() method to compare the strings
        return string1.equals(string2);
    }

    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user for the first string
        System.out.println("Enter string 1");
        String string1 = input.next();

        // Prompt the user for the second string
        System.out.println("Enter string 2");
        String string2 = input.next();

        // Compare the two strings using both the manual comparison method and the equals method
        if (compareStrings(string1, string2) && compareWithEquals(string1, string2)) {
            // If both methods return true, the strings are equal in both ways
            System.out.println("Both strings are equal in both ways");
        } else {
            // If any method returns false, the strings are not equal
            System.out.println("Both are not equal");
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}
