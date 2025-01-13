import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate the wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        // Using the given formula to calculate the wind chill temperature
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to input the temperature and wind speed
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();
        
        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = input.nextDouble();
        
        // Create an object of WindChillCalculator to call the method
        WindChillCalculator calculator = new WindChillCalculator();
        
        // Calculate the wind chill temperature
        double windChill = calculator.calculateWindChill(temperature, windSpeed);
        
        // Output the result
        System.out.println("The wind chill temperature is: " + windChill + "°F");
        
        // Close the scanner to avoid resource leaks
        input.close();
    }
}
