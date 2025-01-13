import java.util.Scanner;
//program to count the digits
public class CountDigits {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        // input an integer
        System.out.println("Enter an integer ");
        int number = input.nextInt();

        // Initialize count to 0
        int count = 0;

        // If the number is 0, we handle it separately
        if (number == 0) {
            count = 1;  // 0 has 1 digit
        } else {
            // Loop to count the digits
            while (number != 0) {
                number /= 10;  // Remove the last digit
                count++;       // Increase the digit count
            }
        }

        // Display the count of digits
        System.out.println("The number has " + count + " digits.");

        // Close the scanner to prevent resource leak
        input.close();
    }
}
