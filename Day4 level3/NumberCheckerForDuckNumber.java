import java.util.Arrays;
//Program to check number is duck number
public class NumberCheckerForDuckNumber {

    // Method to count the digits of the number
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversedDigits = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];
        }
        return reversedDigits;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigits(digits);
        return compareArrays(digits, reversedDigits);
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        // A duck number must contain at least one zero but not start with zero
        if (digits[0] == 0) {
            return false;  // Duck number can't start with zero
        }
        // Check if there is any zero in the digits (except the first one)
        for (int digit : digits) {
            if (digit == 0) {
                return true;  // It is a duck number
            }
        }
        return false;  // No zero present, so it's not a duck number
    }

    // Main method to call and test the utility methods
    public static void main(String[] args) {
        int number = 123456;

        System.out.println("Number: " + number);

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Store digits in an array
        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Reverse digits array
        int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversedDigits));

        // Check if number is a palindrome
        boolean palindrome = isPalindrome(number);
        System.out.println("Is Palindrome: " + palindrome);

        // Check if number is a duck number
        boolean duckNumber = isDuckNumber(number);
        System.out.println("Is Duck Number: " + duckNumber);

        // Testing another number
        int number2 = 10234;

        System.out.println("\nNumber: " + number2);

        // Count digits
        digitCount = countDigits(number2);
        System.out.println("Count of digits: " + digitCount);

        // Store digits in an array
        digits = storeDigits(number2);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Reverse digits array
        reversedDigits = reverseDigits(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversedDigits));

        // Check if number is a palindrome
        palindrome = isPalindrome(number2);
        System.out.println("Is Palindrome: " + palindrome);

        // Check if number is a duck number
        duckNumber = isDuckNumber(number2);
        System.out.println("Is Duck Number: " + duckNumber);
    }
}
