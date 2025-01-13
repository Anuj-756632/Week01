import java.util.Scanner;

public class YoungestTallestFriendsUsingMethod {

    // Method to find the youngest friend
    public static String findYoungest(int[] ages) {
        int youngestAge = ages[0];
        String youngestFriend = "Amar";

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                switch (i) {
                    case 1:
                        youngestFriend = "Akbar";
                        break;
                    case 2:
                        youngestFriend = "Anthony";
                        break;
                }
            }
        }
        return youngestFriend;
    }

    // Method to find the tallest friend
    public static String findTallest(int[] heights) {
        int tallestHeight = heights[0];
        String tallestFriend = "Amar";

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                switch (i) {
                    case 1:
                        tallestFriend = "Akbar";
                        break;
                    case 2:
                        tallestFriend = "Anthony";
                        break;
                }
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arrays to store ages and heights of the 3 friends
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Input the age and height for each friend
        System.out.println("Enter the age and height for each friend:");

        // Input for Amar
        System.out.print("Enter age of Amar: ");
        ages[0] = input.nextInt();
        System.out.print("Enter height of Amar: ");
        heights[0] = input.nextInt();

        // Input for Akbar
        System.out.print("Enter age of Akbar: ");
        ages[1] = input.nextInt();
        System.out.print("Enter height of Akbar: ");
        heights[1] = input.nextInt();

        // Input for Anthony
        System.out.print("Enter age of Anthony: ");
        ages[2] = input.nextInt();
        System.out.print("Enter height of Anthony: ");
        heights[2] = input.nextInt();

        // Find and display the youngest friend
        String youngest = findYoungest(ages);
        System.out.println("The youngest friend is: " + youngest);

        // Find and display the tallest friend
        String tallest = findTallest(heights);
        System.out.println("The tallest friend is: " + tallest);

        input.close();
    }
}
