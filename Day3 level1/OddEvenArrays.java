import java.util.Scanner;

public class OddEvenArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Check if the entered number is a natural number (positive integer)
        if (number <= 0) {
            System.out.println("Error! Please enter a natural number greater than 0.");
            return; // Exit the program
        }

        // Create arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1]; // To accommodate odd numbers
        int[] evenNumbers = new int[number / 2 + 1]; // To accommodate even numbers

        // Index variables for odd and even arrays
        int oddIndex = 0, evenIndex = 0;

        // Loop through the numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // Even number
                evenNumbers[evenIndex++] = i;
            } else {
                // Odd number
                oddNumbers[oddIndex++] = i;
            }
        }

        // Print the odd numbers array
        System.out.println("Odd numbers ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.println(oddNumbers[i] + " ");
        }

        // Print the even numbers array
        System.out.println("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.println(evenNumbers[i] + " ");
        }

        // Close the scanner
        input.close();
    }
}
