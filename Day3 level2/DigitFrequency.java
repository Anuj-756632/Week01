import java.util.Scanner;
//program to find the digit frequency
public class DigitFrequency {

    public static void main(String[] args) {
		//Create an object of class Scanner
        Scanner input = new Scanner(System.in);

        // Take input for the number
        System.out.println("Enter a number ");
        int number = input.nextInt();

        // Convert the number to a positive value (to handle negative input)
        number = Math.abs(number);

        // Array to store the digits of the number
        int[] digits = new int[10]; // We only have digits from 0 to 9
        int[] frequency = new int[10]; // Array to store frequency of each digit

        // Extract digits and store them in the digits array
        while (number > 0) {
            int digit = number % 10;  // Get the last digit
            digits[digit]++;  // Increase the frequency of the digit
            number /= 10;  // Remove the last digit from the number
        }

        // Display the frequency of each digit
        System.out.println("\nFrequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (digits[i] > 0) {
                System.out.println("Digit " + i + ": " + digits[i] + " time(s)");
            }
        }

        input.close();
    }
}
