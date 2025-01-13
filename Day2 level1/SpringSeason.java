//program to check the month is spring or not
public class SpringSeason {

    public static void main(String[] args) {
        // Ensure there are two command line arguments (month and day)
        if (args.length != 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        // Parse the month and day from the command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the given date is within the Spring season
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
