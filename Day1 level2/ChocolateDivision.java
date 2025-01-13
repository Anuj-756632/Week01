import java.util.Scanner;
//Program to Distribute Chocolates to children
public class ChocolateDivision {
    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        // Ask the user to input the number of chocolates
        System.out.println("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        // Ask the user to input the number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Check if there are no children to avoid division by zero
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            // Calculate the number of chocolates each child gets
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;

            // Calculate the number of remaining chocolates
            int remainingChocolates = numberOfChocolates % numberOfChildren;

            // Display the results
            System.out.println("The number of chocolates each child gets is "+chocolatesPerChild+" and the number of remaining chocolates are "+remainingChocolates);
            
        }

        // Close the scanner to avoid memory leak
        input.close();
    }
}
