import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4
        // But, if it is divisible by 100, it must also be divisible by 400
        if (year >= 1582) {  // Check if the year is >= 1582
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    // A year divisible by 100 must also be divisible by 400
                    if (year % 400 == 0) {
                        return true; // It's a leap year
                    } else {
                        return false; // Not a leap year
                    }
                } else {
                    return true; // It's a leap year
                }
            } else {
                return false; // Not a leap year
            }
        } else {
            System.out.println("Year must be >= 1582 as per Gregorian calendar.");
            return false; // Invalid year as per Gregorian calendar
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        scanner.close();
    }
}
