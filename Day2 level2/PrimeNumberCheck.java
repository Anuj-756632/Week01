import java.util.Scanner;
//Program to check prime no. 
public class PrimeNumberCheck {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        //input a number
        System.out.println("Enter a number ");
        int number =input.nextInt();

        // A boolean variable to store the result (whether the number is prime)
        boolean isPrime = true;

        // Check if the number is less than or equal to 1 (not prime)
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop through all numbers from 2 to the number-1
            for (int i = 2; i < number; i++) {
                // If the number is divisible by i, it's not prime
                if (number % i == 0) {
                    isPrime = false;
                    break;  // Exit the loop as we found a divisor
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner object to prevent resource leak
        input.close();
    }
}
