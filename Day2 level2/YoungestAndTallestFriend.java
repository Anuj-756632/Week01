import java.util.Scanner;
//Program to find Youngest and Tallest Friend
public class YoungestAndTallestFriend {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        // Take age and height input for Amar
        System.out.println("Enter Amar's age ");
        int amarAge = input.nextInt();
        System.out.println("Enter Amar's height (in cm) ");
        int amarHeight = input.nextInt();

        // Take age and height input for Akbar
        System.out.println("Enter Akbar's age ");
        int akbarAge = input.nextInt();
        System.out.println("Enter Akbar's height (in cm) ");
        int akbarHeight = input.nextInt();

        // Take age and height input for Anthony
        System.out.println("Enter Anthony's age ");
        int anthonyAge = input.nextInt();
        System.out.println("Enter Anthony's height (in cm) ");
        int anthonyHeight = input.nextInt();

        // Find the youngest friend (smallest age)
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend = "";

        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Find the tallest friend (largest height)
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = "";

        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Display the results
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

        // Close the scanner object to prevent resource leak
        input.close();
    }
}
