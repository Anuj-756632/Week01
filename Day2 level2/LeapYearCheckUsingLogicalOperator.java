import java.util.Scanner;
//Program to check the leapYear using Logical && and || operator
public class LeapYearCheckUsingLogicalOperator {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        // input a year
        System.out.println("Enter a year ");
        int year = input.nextInt();

        // Check if the year is greater than or equal to 1582 (Gregorian calendar)
        if (year >= 1582) {
            // Using a single if condition with logical AND (&&) and OR (||) operators
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year must be greater than or equal to 1582 (Gregorian calendar).");
        }

        // Close the scanner object to prevent resource leak
        input.close();
    }
}
