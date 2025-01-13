import java.util.Scanner;
//Program to calculate bonus of employee in whole service
public class EmployeeBonus {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        //input the salary and years of service
        System.out.println("Enter the salary of the employee ");
        double salary = input.nextDouble();

        System.out.println("Enter the years of service: ");
        int yearsOfService = input.nextInt();

        // Check if the employee has more than 5 years of service
        if (yearsOfService > 5) {
            // Calculate the bonus (5% of the salary)
            double bonus = salary * 0.05;
            // Print the bonus
            System.out.println("The bonus for the employee is: " + bonus);
        } else {
            System.out.println("No bonus for the employee as years of service are 5 or less.");
        }

        // Close the scanner object to prevent resource leak
        input.close();
    }
}
