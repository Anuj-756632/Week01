import java.util.Scanner;
//Program to find odd and even no.
public class OddEvenNumbers {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        // input a natural number
        System.out.println("Enter a natural number ");
        int number = input.nextInt();

        // Check if the number is positive (natural number)
        if (number <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            // Use a for loop to iterate through numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the current number is odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }

        // Close the scanner object to prevent resource leak
        input.close();
    }
}
