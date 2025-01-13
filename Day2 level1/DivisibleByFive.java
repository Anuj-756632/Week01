import java.util.Scanner;
//Program to find no. is divisible by 5
public class DivisibleByFive {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        // input a number
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("Is the number "+number+" divisible by 5? Yes");
        } else {
            System.out.println("Is the number "+number+" divisible by 5? No");
        }

        // Close the scanner to avoid memory leaks
        input.close();
    }
}
