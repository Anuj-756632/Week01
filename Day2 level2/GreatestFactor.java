import java.util.Scanner;
//Program to find Greatest Factor
public class GreatestFactor {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        //input a number
        System.out.println("Enter a number ");
        int number = input.nextInt();

        // Initialize greatestFactor to 1 (since 1 is a factor of every number)
        int greatestFactor = 1;

        // Loop from number - 1 down to 1 to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            // Check if i is a factor of the number
            if (number % i == 0) {
                greatestFactor = i;  // Assign i as the greatest factor
                break;  // Exit the loop once the greatest factor is found
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        // Close the scanner object to prevent resource leak
        input.close();
    }
}
