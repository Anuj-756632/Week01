//Program to find th day of the week
public class DayOfWeek {

    public static void main(String[] args) {
        // Check if the program has received the correct number of arguments
        if (args.length != 3) {
            System.out.println("Please provide month, day, and year as arguments.");
            return;
        }

        // Parse the input arguments
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Apply the Gregorian Calendar formula
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Print the result (Day of the week as an integer)
        System.out.println(d0);
    }
}
