import java.util.Scanner;
//program to calculate Employee salary and bonus in array
public class ZaraBonus {

    public static void main(String[] args) {
        // Define arrays for salaries, years of service, bonuses, and new salaries
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Define variables to store the total bonus, total old salary, and total new salary
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        Scanner input = new Scanner(System.in);

        // Loop to take input for salary and years of service for 10 employees
        for (int i = 0; i < 10; i++) {
            // Input salary
            while (true) {
                System.out.print("Enter the salary for employee " + (i + 1) + ": ");
                salary[i] = input.nextDouble();
                if (salary[i] <= 0) {
                    System.out.println("Invalid salary. Please enter a positive number.");
                } else {
                    break;
                }
            }

            // Input years of service
            while (true) {
                System.out.print("Enter the years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = input.nextDouble();
                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service. Please enter a non-negative number.");
                } else {
                    break;
                }
            }
        }

        // Loop to calculate the bonus and new salary for each employee
        for (int i = 0; i < 10; i++) {
            // Calculate the bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus for employees with more than 5 years of service
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus for employees with 5 years or less of service
            }

            // Calculate the new salary
            newSalary[i] = salary[i] + bonus[i];

            // Update the total bonus, total old salary, and total new salary
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display the results
        System.out.println("\nTotal bonus payout: " + totalBonus);
        System.out.println("Total old salary payout: " + totalOldSalary);
        System.out.println("Total new salary payout: " + totalNewSalary);

        input.close();
    }
}
