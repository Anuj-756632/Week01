import java.util.Scanner;
//Program to find factor of no.
public class FactorsOfNumber {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        //input a number
        System.out.println("Enter a number: ");
        int number =input.nextInt();

        // Check and print all factors of the number
        System.out.println("Factors of " + number + " are:");

        // Loop from 1 to the number to check divisibility
        for (int i = 1; i <= number; i++) {
            // Check if the number is divisible by i (i is a factor)
            if (number % i == 0) {
                System.out.println(i);  // Print the factor
            }
        }

        // Close the scanner object to prevent resource leak
        input.close();
    }
}
