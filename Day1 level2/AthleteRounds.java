import java.util.Scanner;
//Program to calculate rounds to the athlete
public class AthleteRounds {
    public static void main(String[] args) {
        // Create a Scanner object to  input
        Scanner input = new Scanner(System.in);

        // Ask the user to input the three sides of the triangle (in meters)
        System.out.println("Enter the length of three sides in meters ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Define the total distance the athlete needs to cover: 5 kilometers (5000 meters)
        double totalDistance = 5*1000;  // 5 kilometers = 5000 meters

        // Calculate the number of rounds required
        double rounds = totalDistance / perimeter;

        // Output the number of total no. of rounds in 5km
        System.out.println("The total number of rounds the athlete will run is "+rounds+" to complete 5 km");

        // Close the scanner to avoid memory leaks
        input.close();
    }
}
