import java.util.Scanner;
//Program to check the no. is ArmstrongNumber
public class ArmstrongNumber {

    public static void main(String[] args) {
        // Create a Scanner object to input 
        Scanner input = new Scanner(System.in);

        //input a number
        System.out.println("Enter a number ");
        int number = input.nextInt();

        // Initialize the sum variable to store the sum of cubes of digits
        int sum = 0;

        // Store the original number for later comparison
        int originalNumber = number;

        // While loop to extract each digit and calculate the sum of cubes
        while (number != 0) {
            int digit = number % 10;  // Get the last digit of the number
            sum += digit * digit * digit;  // Add the cube of the digit to sum
            number /= 10;  // Remove the last digit by dividing the number by 10
        }

        // Check if the sum of cubes of digits is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is Not an Armstrong number.");
        }

        // Close the scanner to prevent resource leak
        input.close();
    }
}
