import java.util.Scanner;

public class CalendarDisplay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        displayCalendar(month, year);
    }

    public static void displayCalendar(int month, int year) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month < 1 || month > 12) {
            System.out.println("Invalid month.");
            return;
        }

        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // Leap year
        }

        String monthName = months[month - 1];
        int days = daysInMonth[month - 1];

        System.out.println("\nIn " + monthName + " " + year);
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        int firstDay = getFirstDayOfMonth(month, year);

        // Indentation for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   \t");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d\t", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400==0);
}
}