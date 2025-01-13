import java.util.Scanner;
//Program to find No. in negative,positive or zero
public class PositiveNegativeZero {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        // input a number
        System.out.println("Enter a number ");
        int number = input.nextInt();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the scanner to avoid memory leaks
        input.close();
    }
}
