import java.util.Scanner;
//Program to find the first no is smallest among three no
public class SmallestNumberCheck {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        // input three numbers
        System.out.println("Enter the three number: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Check if the first number is the smallest
        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println( "Is the first number the smallest? No");
        }

        // Close the scanner to avoid memory leaks
        input.close();
    }
}
