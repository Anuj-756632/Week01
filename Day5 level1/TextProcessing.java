import java.util.Scanner;

public class TextProcessing {

    // Method to convert the string to lowercase using ASCII values
    public static String convertToLowercaseCustom(String text) {
        StringBuilder lowerCaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // If the character is uppercase, convert it to lowercase using ASCII values
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32); // Convert to lowercase by adding 32 to the ASCII value
            }
            lowerCaseText.append(c);
        }
        return lowerCaseText.toString();
    }

    // Method to compare two strings and return true if they are equal
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2); // Compare the two strings for equality
    }

    // Method to split the text into words and return the words along with their lengths in a 2D array
    public static String[][] splitTextToWords(String text) {
        String[] words = text.split(" "); // Split the text by spaces into words
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Store the word
            result[i][1] = String.valueOf(words[i].length()); // Store the length of the word
        }
        return result;
    }

    public static void main(String[] args) {
        // Create Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take complete text input from the user
        System.out.println("Enter a string:");
        String inputText = scanner.nextLine();

        // Convert the input text to lowercase using the custom method
        String customLowerCaseText = convertToLowercaseCustom(inputText);

        // Convert the input text to lowercase using the built-in toLowerCase() method
        String builtInLowerCaseText = inputText.toLowerCase();

        // Compare both the lowercase results
        boolean areStringsEqual = compareStrings(customLowerCaseText, builtInLowerCaseText);

        // Display the results of the lowercase conversion and comparison
        System.out.println("\nOriginal Text: " + inputText);
        System.out.println("Lowercase (Custom Method): " + customLowerCaseText);
        System.out.println("Lowercase (Built-in Method): " + builtInLowerCaseText);

        if (areStringsEqual) {
            System.out.println("\nBoth methods produced the same result.");
        } else {
            System.out.println("\nThe results are different.");
        }

        // Split the text into words and display the words along with their lengths in a 2D array
        String[][] wordsAndLengths = splitTextToWords(inputText);
        
        System.out.println("\nWords and their lengths:");
        for (int i = 0; i < wordsAndLengths.length; i++) {
            System.out.println("Word: " + wordsAndLengths[i][0] + ", Length: " + wordsAndLengths[i][1]);
        }

        // Close the scanner
        scanner.close();
    }
}
