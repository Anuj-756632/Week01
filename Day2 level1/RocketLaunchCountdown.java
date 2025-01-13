import java.util.Scanner;
//Program for Rocket Count Down
public class RocketLaunchCountdown {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        //input the countdown value
        System.out.println("Enter the countdown start value ");
        int counter = input.nextInt();

        // Check if the input is a valid positive integer
        if (counter <= 0) {
            System.out.println("Please enter a positive integer for the countdown.");
        } else {
            // Use a while loop to countdown from the input value to 1
            while (counter >= 1) {
                System.out.println("Countdown: " + counter);
                counter--;  // Decrement the counter by 1
            }

            // After countdown ends, print launch message
            System.out.println("Liftoff! Rocket has launched.");
        }

        // Close the scanner to avoid memory leaks
        input.close();
    }
}
