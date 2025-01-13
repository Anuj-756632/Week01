import java.util.Scanner;

public class ChocolatesDistributionUsingMethod {

    // Method to calculate the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        // Create an array to store the quotient (chocolates per child) and remainder (remaining chocolates)
        int[] result = new int[2];
        
        // Calculate the number of chocolates each child gets (quotient)
        result[0] = numberOfChocolates / numberOfChildren;
        
        // Calculate the remaining chocolates (remainder)
        result[1] = numberOfChocolates % numberOfChildren;
        
        // Return the array containing the quotient and remainder
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter the total number of chocolates
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        
        // Ask the user to enter the number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();
        
        // Ensure that the number of children is not zero to avoid division by zero error
        if (numberOfChildren != 0) {
            // Call the method to calculate chocolates per child and remaining chocolates
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            
            // Output the results
            System.out.println("Each child will get " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        } else {
            // If the number of children is zero, print an error message
            System.out.println("Error: Division by zero is not allowed. Number of children cannot be zero.");
        }
        
        // Close the scanner to avoid resource leaks
        input.close();
    }
}
