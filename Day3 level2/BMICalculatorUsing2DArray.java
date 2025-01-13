import java.util.Scanner;
//program to calculate BMI using 2D array
public class BMICalculatorUsing2DArray {

    public static void main(String[] args) {
	//Create an object of Scanner Class
        Scanner input = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Create a 2D array to store height, weight, and BMI
        // personData[i][0] = height, personData[i][1] = weight, personData[i][2] = BMI
        double[][] personData = new double[numberOfPersons][3];
        
        // Create an array to store weight status for each person
        String[] weightStatus = new String[numberOfPersons];

        // Input height and weight for each person
        for (int i = 0; i < numberOfPersons; i++) {
            double height, weight;

            // Input height (must be positive)
            do {
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                height = input.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value. Please try again.");
                }
            } while (height <= 0);

            // Input weight (must be positive)
            do {
                System.out.print("Enter weight (in kilograms) for person " + (i + 1) + ": ");
                weight = input.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value. Please try again.");
                }
            } while (weight <= 0);

            // Store height and weight in the 2D array
            personData[i][0] = height;
            personData[i][1] = weight;

            // Calculate BMI and store it in the 2D array
            personData[i][2] = weight / (height * height);

            // Determine the weight status based on BMI
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status for each person
        System.out.println("\n--- BMI Calculation Results ---");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][0] + " m");
            System.out.println("Weight: " + personData[i][1] + " kg");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
        }

        input.close();
    }
}
