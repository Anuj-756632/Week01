import java.util.Scanner;
//Program to check voting Age
public class VotingEligibility {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        // input their age
        System.out.println("Enter your age ");
        int age = input.nextInt();

        // Check if the person can vote
        if (age >= 18) {
            System.out.println("The person's age is "+age+" and can vote.");
        } else {
            System.out.println("The person's age is "+age+" and cannot vote");
        }

        // Close the scanner to avoid memory leaks
        input.close();
    }
}
