import java.util.Scanner;
//Program to find Multiple of no.
public class MultiplesOfNumber {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        //input a number
        System.out.println("Enter a number ");
        int number = input.nextInt();

        // Check for multiples of the number below 100 using a backward loop
        System.out.println("Multiples of " + number + " below 100:");
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of the input number
            if (i % number == 0) {
                System.out.println(i);  // Print the multiple
            }
        }

        // Close the scanner object to prevent resource leak
        input.close();
    }
}
