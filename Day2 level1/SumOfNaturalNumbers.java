import java.util.Scanner;
//program To find the sum of natural no.
public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        //input a natural number
        System.out.println("Enter a natural number: ");
        int n = input.nextInt();

        // Check if the entered number is a natural number (greater than 0)
        if (n > 0) {
            // Calculate sum using the formula n*(n+1)/2
            int formulaSum = n * (n + 1) / 2;

            // Calculate sum using a while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;  // Add i to the sum
                i++;  // Increment i
            }

            // Display the results
            System.out.println("Sum using the formula: " + formulaSum);
            System.out.println("Sum using the while loop: " + loopSum);

            // Compare the two results
            if (formulaSum == loopSum) {
                System.out.println("The results match. Both methods are correct!");
            } else {
                System.out.println("There is a mistake. The results do not match.");
            }
        } else {
            System.out.println("Please enter a valid natural number (greater than 0).");
        }

        // Close the scanner object to prevent resource leak
        input.close();
    }
}
