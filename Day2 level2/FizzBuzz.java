import java.util.Scanner;
//Program to print Fizz or buzz according to condition
public class FizzBuzz {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        //input a positive integer
        System.out.println("Enter a positive integer ");
        int number = input.nextInt();

        // Check if the input number is positive
        if (number > 0) {
            // Loop from 0 to the entered number
            for (int i = 1; i <= number; i++) {
                // If the number is divisible by both 3 and 5, print "FizzBuzz"
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // If the number is divisible by 3, print "Fizz"
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // If the number is divisible by 5, print "Buzz"
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Otherwise, print the number itself
                else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close the scanner object to prevent resource leak
        input.close();
    }
}
