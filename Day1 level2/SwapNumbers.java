import java.util.Scanner;
//Program to swap two number
public class SwapNumbers {

    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // Swapping process using a temporary variable
        int temp = number1;  // Store the value of number1 in temp
        number1 = number2;      // Assign the value of number2 to number1
        number2 = temp;      // Assign the value of temp (old number1) to number2

        // Display the numbers after swapping
        System.out.println("The swapped numbers are "+number1+" and "+number2);

        // Close the scanner to avoid memory leak
        input.close();
    }
}
