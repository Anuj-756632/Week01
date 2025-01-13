import java.util.Scanner;

public class YoungestAndTallest {

    public static void main(String[] args) {
		//Create an object of class scanner
		Scanner input = new Scanner(System.in);
		
        // Define arrays to store the ages and heights of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        String[] friends = {"Amar", "Akbar", "Anthony"};


        // Input the ages and heights of the three friends
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the age of " + friends[i]);
            ages[i] = input.nextInt();
            System.out.println("Enter the height of " + friends[i] );
            heights[i] = input.nextDouble();
        }

        // Find the youngest friend
        int youngestAge = ages[0];
        String youngestFriend = friends[0];
        
        // Find the tallest friend
        double tallestHeight = heights[0];
        String tallestFriend = friends[0];

        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = friends[i];
            }

            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = friends[i];
            }
        }

        // Display the youngest and tallest friend
        System.out.println("\nThe youngest friend is: " + youngestFriend + " (Age: " + youngestAge + " years)");
        System.out.println("The tallest friend is: " + tallestFriend + " (Height: " + tallestHeight + " meters)");

        input.close();
    }
}
