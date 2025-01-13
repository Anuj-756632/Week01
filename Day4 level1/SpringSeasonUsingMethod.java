public class SpringSeasonUsingMethod {

    // Method to check if the given month and day is within the Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Check if the date is within the Spring season (March 20 to June 20)
        // Spring starts on March 20 (3/20) and ends on June 20 (6/20)
        
        // If month is March (3), check if the day is 20 or later
        if (month == 3 && day >= 20) {
            return true;
        }
        // If month is between April (4) and June (6), it's always Spring
        else if (month >= 4 && month <= 6) {
            return true;
        }
        // If month is June (6), check if the day is 20 or earlier
        else if (month == 6 && day <= 20) {
            return true;
        }
        // Otherwise, it's not Spring
        return false;
    }

    public static void main(String[] args) {
        // Check if two arguments (month and day) are passed in command line
        if (args.length == 2) {
            try {
                // Parse the month and day from the command line arguments
                int month = Integer.parseInt(args[0]);
                int day = Integer.parseInt(args[1]);
                
                // Check if the input month and day fall within the Spring season
                if (isSpringSeason(month, day)) {
                    System.out.println("It's a Spring Season");
                } else {
                    System.out.println("Not a Spring Season");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid integer values for month and day.");
            }
        } else {
            System.out.println("Please enter both month and day as command line arguments.");
        }
    }
}
