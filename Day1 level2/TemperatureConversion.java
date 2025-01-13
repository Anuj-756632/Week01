import java.util.Scanner;
//program to convert temperature celsius to fahrenheit
public class TemperatureConversion {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter temperature in Celsius
        System.out.println("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        
        // calculate Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;;
        
        // Output the result
        System.out.println(" The "+celsius+" celsius is "+fahrenheit+" fahrenheit");
        
        // Close the scanner to avoid memory leak
        input.close();
    }
}
