import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate the sine, cosine, and tangent of an angle
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculate sine, cosine, and tangent using Math functions
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        // Store the results in an array
        double[] result = {sine, cosine, tangent};
        
        // Return the array containing sine, cosine, and tangent
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter an angle in degrees
        System.out.print("Enter an angle in degrees: ");
        double angle = input.nextDouble();
        
        // Create an object of TrigonometricFunctions to call the method
        TrigonometricFunctions calculator = new TrigonometricFunctions();
        
        // Call the method to calculate trigonometric functions
        double[] result = calculator.calculateTrigonometricFunctions(angle);
        
        // Output the results
        System.out.println("Sine of " + angle + " degrees: " + result[0]);
        System.out.println("Cosine of " + angle + " degrees: " + result[1]);
        System.out.println("Tangent of " + angle + " degrees: " + result[2]);
        
        // Close the scanner to avoid resource leaks
        input.close();
    }
}
