import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a valid positive integer.");
            return; // Exit the program
        }

        // Create a String array to store the results
        String[] fizzBuzzArray = new String[number + 1]; // Array size is number + 1 for 0 to number

        // Loop through from 0 to the entered number
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzArray[i] = "FizzBuzz";  // Multiple of both 3 and 5
            } else if (i % 3 == 0) {
                fizzBuzzArray[i] = "Fizz";  // Multiple of 3
            } else if (i % 5 == 0) {
                fizzBuzzArray[i] = "Buzz";  // Multiple of 5
            } else {
                fizzBuzzArray[i] = Integer.toString(i);  // Normal number
            }
        }

        // Loop through and print the results in the format Position X = value
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + fizzBuzzArray[i]);
        }

        // Close scanner
        input.close();
    }
}
