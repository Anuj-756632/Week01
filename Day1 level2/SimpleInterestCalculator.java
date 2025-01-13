import java.util.Scanner;
//Program to calculate Simple Interest
public class SimpleInterestCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        // input the Principal amount
        System.out.println("Enter the principal amount: ");
        double principal = input.nextDouble();

        //input the Rate of interest
        System.out.println("Enter the rate of interest: ");
        double rate = input.nextDouble();

        //input the Time period (in years)
        System.out.println("Enter the time period (in years): ");
        double time = input.nextDouble();

        // Calculate the Simple Interest using the formula
        double simpleInterest = (principal * rate * time) / 100;

        // Display the Simple Interest
        System.out.println("The Simple Interest is: "+simpleInterest+"for Principal "+principal+",Rate of Interest "+rate+" and Time "+time);

        // Close the scanner to avoid memory leaks
        input.close();
    }
}
