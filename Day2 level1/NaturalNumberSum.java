import java.util.Scanner;
//Program to check the natural no and calculate the sum
public class NaturalNumberSum {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        // input a number
        System.out.println("Enter a number ");
        int number = input.nextInt();

        // Check if the number is a natural number (positive integer)
        if (number < 1) {
            System.out.println("The number "+number+" is not a natural number");
        } else {
            // Calculate the sum of the first 'number' natural numbers
            int sum = number * (number + 1) / 2;

            // Display the result
            System.out.println("The sum of "+number+" natural numbers is" + sum);
        }

        // Close the scanner to avoid memory leaks
        input.close();
    }
}
