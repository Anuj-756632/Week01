import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of a quadratic equation
    public static double[] findRoots(int a, int b, int c) {
        double[] roots = new double[2]; // Array to store the roots
        
        // Calculate the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        // If delta is positive, we have two real roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            roots[0] = root1;
            roots[1] = root2;
        }
        // If delta is zero, there is one real root
        else if (delta == 0) {
            roots[0] = -b / (2.0 * a);
        }
        // If delta is negative, no real roots exist
        else {
            roots = new double[0];  // Return an empty array for no real roots
        }
        
        return roots;
    }

    public static void main(String[] args) {
        // Input values for a, b, and c
        Scanner input = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        int a = input.nextInt();
        System.out.print("Enter coefficient b: ");
        int b = input.nextInt();
        System.out.print("Enter coefficient c: ");
        int c = input.nextInt();

        // Find the roots of the quadratic equation
        double[] roots = findRoots(a, b, c);
        
        // Display the results
        if (roots.length == 0) {
            System.out.println("No real roots exist.");
        } else if (roots.length == 1) {
            System.out.println("The root is: " + roots[0]);
        } else {
            System.out.println("The roots are: " + roots[0] + " and " + roots[1]);
        }
    }
}
