import java.util.Scanner;

public class NumberStorage {

    public static void main(String[] args) {
        // Declare the array and initialize other variables
        double[] numbers = new double[10]; // Array to store up to 10 elements
        double total = 0.0; // Variable to store the total sum
        int index = 0; // Index to track the position in the array

        Scanner input = new Scanner(System.in);

        // Infinite loop for taking user inputs
        while (true) {
            // Take user input
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();

            // Check if the input is 0 or negative or if array size limit is reached
            if (num <= 0 || index == 9) {
                break; // Exit the loop if 0 or negative is entered or 10 elements have been added
            }

            // Add the number to the array and increment the index
            numbers[index] = num;
            index++;
        }

        // Calculate the total sum of the numbers in the array
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the numbers in the array
        System.out.println("\nNumbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Display the total sum
        System.out.println("\nTotal sum of the numbers: " + total);

        input.close();
    }
}
