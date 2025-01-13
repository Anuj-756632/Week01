import java.util.Scanner;
//Program to find Factorial of a number using for loop
public class FactorialProgramWithFor {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        //input a positive integer
        System.out.println("Enter a positive integer ");
        int number = input.nextInt();

        // Check if the entered number is positive
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize the factorial to 1 (as 0! = 1 and 1! = 1)
            int factorial = 1;
            
            // Use a while loop to compute the factorial
            int i = 1;
            for (;i <= number;i++) {
                factorial *= i;  // Multiply factorial by i
                
            }

            // Print the computed factorial
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the scanner object to prevent resource leak
        input.close();
    }
}
