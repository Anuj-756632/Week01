import java.util.Scanner;
//Program to check the no. is HarshadNumber
public class HarshadNumber {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // input a number
        System.out.println("Enter a number ");
        int number = input.nextInt();

        // Create a variable to store the sum of digits
        int sum = 0;
        int temp = number; // We need to keep the original number to check divisibility

        // Calculate the sum of the digits using a while loop
        while (temp != 0) {
            sum += temp % 10;  // Get the last digit and add it to sum
            temp /= 10;         // Remove the last digit
        }

        // Check if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }

        // Close the scanner to prevent resource leak
        input.close();
    }
}
