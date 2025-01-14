import java.util.Scanner;

public class CompareStringUsingArray {

    // Method to convert a String into a character array
    public static char[] convertStringIntoCharArray(String string) {
        // Create a character array of the same length as the input string
        char[] charArray = new char[string.length()];
        
        // Loop through each character of the string and assign it to the char array
        for (int i = 0; i < string.length(); i++) {
            charArray[i] = string.charAt(i); // Use charAt to get the character at position i
        }
        
        // Return the populated character array
        return charArray;
    }
    
    // Method to compare two character arrays
    public static boolean compare(char[] array, char[] charArray) {
        // Check if the lengths of the arrays are the same
        if (array.length != charArray.length) {
            return false; // If lengths differ, they cannot be equal
        }

        // Loop through each element of both arrays and compare them
        for (int i = 0; i < array.length; i++) {
            if (array[i] != charArray[i]) {
                return false; // If any character is different, arrays are not equal
            }
        }
        
        // If no differences are found, the arrays are equal
        return true;
    }

    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner input = new Scanner(System.in);

        // Read a string input from the user
        System.out.println("Enter a string");
        String string = input.next();

        // Convert the string into a char array using the toCharArray method
        char[] array = string.toCharArray();
        
        // Compare the char array from the string and the one created manually
        if (compare(array, convertStringIntoCharArray(string))) {
            // If the arrays are equal, print this message
            System.out.println("Both are equal");
        } else {
            // If the arrays are not equal, print this message
            System.out.println("Both are not equal");
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}
