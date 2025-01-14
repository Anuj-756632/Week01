import java.util.Scanner;

public class UppercaseComparison {

    // Method to convert the string to uppercase using ASCII values
    public static String convertToUppercaseCustom(String text) {
        StringBuilder upperCaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // If the character is lowercase, convert it to uppercase using ASCII values
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32); // Convert to uppercase by subtracting 32 from the ASCII value
            }
            upperCaseText.append(c);
        }
        return upperCaseText.toString();
    }

    // Method to compare two strings and return true if they are equal
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2); // Compare the two strings for equality
    }

    public static void main(String[] args) {
        // Create Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take complete text input from the user
        System.out.println("Enter a string:");
        String inputText = scanner.nextLine();

        // Convert the input text to uppercase using the custom method
        String customUpperCaseText = convertToUppercaseCustom(inputText);

        // Convert the input text to uppercase using the built-in toUpperCase() method
        String builtInUpperCaseText = inputText.toUpperCase();

        // Compare both the uppercase results
        boolean areStringsEqual = compareStrings(customUpperCaseText, builtInUpperCaseText);

        // Display the results
        System.out.println("\nOriginal Text: " + inputText);
        System.out.println("Uppercase (Custom Method): " + customUpperCaseText);
        System.out.println("Uppercase (Built-in Method): " + builtInUpperCaseText);

        if (areStringsEqual) {
            System.out.println("\nBoth methods produced the same result.");
        } else {
            System.out.println("\nThe results are different.");
        }

        // Close the scanner
        scanner.close();
    }
}
