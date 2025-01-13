import java.util.Scanner;


public class CollinearPoints {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = input.nextDouble();


        if (isCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using slope formula.");
        } else {
            System.out.println("Points are not collinear using slope formula.");
        }


        if (isCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using area of triangle formula.");
        } else {
            System.out.println("Points are not collinear using area of triangle formula.");
        }


        // Sample test case
        System.out.println("\nSample Test Case:");
        double x1_sample = 2;
        double y1_sample = 4;
        double x2_sample = 4;
        double y2_sample = 6;
        double x3_sample = 6;
        double y3_sample = 8;


        if (isCollinearUsingSlope(x1_sample, y1_sample, x2_sample, y2_sample, x3_sample, y3_sample)) {
            System.out.println("Sample points are collinear using slope formula.");
        } else {
            System.out.println("Sample points are not collinear using slope formula.");
        }


        if (isCollinearUsingArea(x1_sample, y1_sample, x2_sample, y2_sample, x3_sample, y3_sample)) {
            System.out.println("Sample points are collinear using area of triangle formula.");
        } else {
            System.out.println("Sample points are not collinear using area of triangle formula.");
        }
    }


    public static boolean isCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Handle cases where denominator is zero (vertical lines)
        if (x1 == x2) {
            return x2 == x3; // All points have the same x-coordinate
        } else if (x2 == x3) {
            return false; // Different slopes for vertical lines
        }

        double slope1 = (y2 - y1) / (x2 - x1);
        double slope2 = (y3 - y2) / (x3 - x2);


        // Allow for small numerical errors
        return Math.abs(slope1 - slope2) < 1e-9;
    }


    public static boolean isCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        // Allow for small numerical errors
        return Math.abs(area) < 1e-9;
}
}