import java.util.Scanner;
//Progrm to calculate power of no.
public class PowerOfNumber {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        //input the base number and the power
        System.out.println("Enter the base number ");
        int number = input.nextInt();

        System.out.println("Enter the power (exponent) ");
        int power = input.nextInt();

        // Initialize result to 1 (since any number raised to the power of 0 is 1)
        int result = 1;

        // Use a for loop to compute the power
        for (int i = 1; i <= power; i++) {
            result *= number;  // Multiply result by number in each iteration
        }

        // Print the result
        System.out.println("Result: " + number + " raised to the power of " + power + " is: " + result);

        // Close the scanner object to prevent resource leak
        input.close();
    }
}
