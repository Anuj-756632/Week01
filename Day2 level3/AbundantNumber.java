import java.util.Scanner;
//Program to find Abundant Number
public class AbundantNumber {

    public static void main(String[] args) {
        // Create a Scanner object to input 
        Scanner input = new Scanner(System.in);

        // input a number
        System.out.println("Enter a number ");
        int number = input.nextInt();

        // Initialize sum of divisors to 0
        int sum = 0;

        // Loop through all integers from 1 to number - 1
        for (int i = 1; i < number; i++) {
            // Check if i is a divisor of the number
            if (number % i == 0) {
                sum += i; // Add divisor to sum
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }

        // Close the scanner to prevent resource leak
        input.close();
    }
}
