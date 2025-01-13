import java.util.Scanner;
//Program to calculate Bmi in array
public class BMICalculator {

    public static void main(String[] args) {
		//Create abn object of Scanner class
		Scanner input = new Scanner(System.in);
        // Number of persons
        int numPersons = 3; // You can change this based on the number of persons

        // Arrays to store height, weight, BMI, and weight status
        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmiValues = new double[numPersons];
        String[] weightStatus = new String[numPersons];

        

        // Input height and weight for each person and calculate BMI
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1));

            // Input height in meters and weight in kilograms
            System.out.print("Enter height (in meters): ");
            heights[i] = input.nextDouble();

            System.out.print("Enter weight (in kilograms): ");
            weights[i] = input.nextDouble();

            // Calculate BMI: BMI = weight / (height * height)
            bmiValues[i] = weights[i] / (heights[i] * heights[i]);

            // Determine the weight status based on BMI value
            if (bmiValues[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmiValues[i] >= 18.5 && bmiValues[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmiValues[i] >= 25.0 && bmiValues[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the details for each person
        System.out.println("\n--- BMI Calculation Results ---");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height: " + heights[i] + " m");
            System.out.println("Weight: " + weights[i] + " kg");
            System.out.println("BMI: " + bmiValues[i]);
            System.out.println("Weight Status: " + weightStatus[i]);
        }

        input.close();
    }
}
