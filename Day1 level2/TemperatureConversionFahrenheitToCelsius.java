import java.util.Scanner;
//program to convert temperature fahrenheit to celsius 
public class TemperatureConversionFahrenheitToCelsius {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter temperature in fahrenheit
        System.out.println("Enter temperature in fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        // calculate Fahrenheit to Celsius
        double celsius = (fahrenheit-32)*5/9;;
        
        // Output the result
        System.out.println(" The "+fahrenheit+"fahrenheit is "+celsius+" celsius");
        
        // Close the scanner to avoid memory leak
        input.close();
    }
}
