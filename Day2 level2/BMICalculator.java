import java.util.Scanner;
//Program to claculate Bmi
public class BMICalculator {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        // Declare variables for weight and height
        double weight, height, bmi;

        //input their weight (in kg) and height (in cm)
        System.out.println("Enter weight in kg ");
        weight = input.nextDouble();

        System.out.print("Enter height in cm: ");
        height = input.nextDouble();

        // Convert height from cm to meters
        height = height / 100;

        // Calculate BMI using the formula
        bmi = weight / (height * height);

        // Display the calculated BMI
        System.out.println("Your BMI is: " + bmi);

        // Determine the weight status based on BMI
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display the weight status
        System.out.println("Your weight status is: " + status);

        // Close the scanner object to prevent resource leak
        input.close();
    }
}
