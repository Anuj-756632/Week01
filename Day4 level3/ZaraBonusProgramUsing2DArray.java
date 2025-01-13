import java.util.*;

public class ZaraBonusProgramUsing2DArray {

    // Method to generate random salary and years of service for employees
    public static double[][] generateEmployeeData() {
        Random rand = new Random();
        double[][] employeeData = new double[10][2];  // 10 employees, 2 columns (salary, years of service)

        for (int i = 0; i < 10; i++) {
            // Generate random salary (5-digit salary)
            employeeData[i][0] = 10000 + (rand.nextInt(90000)); // Random salary between 10,000 and 99,999
            // Generate random years of service (between 1 and 20 years)
            employeeData[i][1] = 1 + rand.nextInt(20);
        }

        return employeeData;
    }

    // Method to calculate the new salary and bonus based on years of service
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] resultData = new double[10][3];  // 10 employees, 3 columns (salary, bonus, new salary)

        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus = 0;

            // Calculate bonus
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; // 5% bonus for employees with more than 5 years of service
            } else {
                bonus = oldSalary * 0.02; // 2% bonus for employees with less than 5 years of service
            }

            // Calculate new salary
            double newSalary = oldSalary + bonus;

            // Save the result in the resultData array
            resultData[i][0] = oldSalary;  // Old salary
            resultData[i][1] = bonus;      // Bonus amount
            resultData[i][2] = newSalary;  // New salary after adding the bonus
        }

        return resultData;
    }

    // Method to calculate the sum of old salary, new salary, and total bonus
    public static void calculateAndDisplayTotal(double[][] resultData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Calculate the totals
        for (int i = 0; i < 10; i++) {
            totalOldSalary += resultData[i][0];
            totalBonus += resultData[i][1];
            totalNewSalary += resultData[i][2];
        }

        // Display the results in tabular format
        System.out.println("-------------------------------------------------------------");
        System.out.println("Employee | Old Salary | Bonus | New Salary");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%8d   | %10.2f | %.2f | %.2f\n", (i + 1), resultData[i][0], resultData[i][1], resultData[i][2]);
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("Total    | %.2f | %.2f | %.2f\n", totalOldSalary, totalBonus, totalNewSalary);
        System.out.println("-------------------------------------------------------------");
    }

    public static void main(String[] args) {
        // Generate employee data (salary and years of service)
        double[][] employeeData = generateEmployeeData();

        // Calculate new salary and bonus for each employee
        double[][] resultData = calculateNewSalaryAndBonus(employeeData);

        // Display the total salaries and bonuses in a tabular format
        calculateAndDisplayTotal(resultData);
    }
}
