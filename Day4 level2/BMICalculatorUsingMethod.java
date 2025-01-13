import java.util.Scanner;

public class BMICalculatorUsingMethod {

    // Method to calculate the BMI for each person and populate the 2D array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0]; // Weight in kg
            double heightInCm = data[i][1]; // Height in cm
            double heightInM = heightInCm / 100; // Convert height to meters
            
            // Calculate BMI: BMI = weight / (height * height)
            double bmi = weight / (heightInM * heightInM);
            data[i][2] = bmi; // Store BMI in the third column of the 2D array
        }
    }

    // Method to determine the BMI status of each person
    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[10]; // Array to store the BMI status of each person

        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2]; // Get BMI from the 2D array

            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        return statuses;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 2D array to store weight (kg), height (cm), and BMI for each person
        double[][] data = new double[10][3]; // 10 persons, 3 columns: weight, height, BMI

        // Input weight and height for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            // Input weight (in kg)
            System.out.print("Weight (kg): ");
            data[i][0] = input.nextDouble();

            // Input height (in cm)
            System.out.print("Height (cm): ");
            data[i][1] = input.nextDouble();
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Determine the BMI status of each person
        String[] statuses = determineBMIStatus(data);

        // Display the BMI information for each person
        System.out.println("\nBMI Information for 10 Persons:");
        System.out.println("Person | Weight (kg) | Height (cm) | BMI      | Status");
        //System.out.println("--------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d | %12.2f | %12.2f | %8.2f | %s\n", 
                    (i + 1), data[i][0], data[i][1], data[i][2], statuses[i]);
        }

        input.close();
    }
}
