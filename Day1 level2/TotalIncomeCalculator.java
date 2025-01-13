import java.util.Scanner;
//program to calculate Salary
public class TotalIncomeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // Ask the user to input their salary
        System.out.print("Enter your salary: ");
        double salary =input.nextDouble();

        // Ask the user to input their bonus
        System.out.print("Enter your bonus: ");
        double bonus = input.nextDouble();

        // calculate the total income
        double totalIncome = salary + bonus;

        // Output the result
        System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+" Hence Total Income is INR "+totalIncome);

        // Close the scanner to avoid memory leak
        input.close();
    }
}
