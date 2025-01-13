import java.util.Scanner;
//program to find the sum of numbers until the user enters 0
public class SumUntilZero {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        // Initialize the total sum variable to 0.0
        double total = 0.0;
        double number;

        // Use a while loop to continue asking for input until the user enters 0
        while (true) {
            // input a number
            System.out.println("Enter a number (0 to stop) ");
            number = input.nextDouble();

            // Check if the user entered 0, then break the loop
            if (number == 0) {
                break;
            }

            // Add the entered number to the total
            total += number;
        }

        // After exiting the loop, print the total sum
        System.out.println("The total sum is: " + total);

        // Close the scanner to avoid memory leaks
        input.close();
    }
}
