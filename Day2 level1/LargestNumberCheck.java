import java.util.Scanner;
//Program to chek the largest no 
public class LargestNumberCheck {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        // input three numbers
        System.out.println("Enter the three numbers ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Check which number is the largest
        if (number1 >= number2 && number1 >= number3) {
            System.out.println("Is the first number the largest? yes");
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("Is the Second number the largest? yes");
        } else {
            System.out.println("Is the Third number the largest? yes");
        }

        // Close the scanner to avoid memory leaks
        input.close();
    }
}
