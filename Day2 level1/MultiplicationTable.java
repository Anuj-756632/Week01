import java.util.Scanner;
//
public class MultiplicationTable {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        //input a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Use a for loop to print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println("Multiplication table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println(); // Add an empty line for better formatting
        }

        // Close the scanner object to prevent resource leak
        input.close();
    }
}
