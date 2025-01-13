import java.util.Scanner;

public class EuclideanDistance {

    // Method to calculate the Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        // Formula: distance = sqrt((x2 - x1)^2 + (y2 - y1)^2)
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of the line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Formula for slope (m): m = (y2 - y1) / (x2 - x1)
        double m = (y2 - y1) / (x2 - x1);
        
        // Formula for y-intercept (b): b = y1 - m * x1
        double b = y1 - m * x1;

        // Return the slope and y-intercept in an array
        return new double[] {m, b};
    }

    public static void main(String[] args) {
        // Input values for the points (x1, y1) and (x2, y2)
        Scanner input		= new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Calculate the Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("The Euclidean distance between the points is: " + distance);

        // Find the equation of the line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double intercept = lineEquation[1];

        // Display the equation of the line
        System.out.println("The equation of the line is: y = " + slope + "x + " + intercept);
    }
}
