import java.util.Scanner;
//Program to calculate Weight pounds to kg
public class PoundsToKilograms {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        // input weight in pounds
        System.out.println("Enter weight in pounds ");
        double pounds = input.nextDouble();

        // Convert pounds to kilograms using the formula
        double kilograms = pounds * 2.2;

        // Display the result
        System.out.println("The weight of the person in pound is "+pounds+" and in kg is "+kilograms);

        // Close the scanner
        input.close();
    }
}
