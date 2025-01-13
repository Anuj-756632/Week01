import java.util.Scanner;

public class FactorsFinder {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a valid positive integer
        if (number <= 0) {
            System.out.println("Please enter a valid positive integer.");
            return;
        }

        // Initialize maxFactor and factors array
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // If i is a factor of number
                if (index == maxFactor) {
                    // If the factors array is full, resize it
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length); // Copy old array to temp
                    factors = temp; // Assign resized array to factors
                }
                factors[index++] = i; // Store the factor in the array
            }
        }

        // Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        // Close scanner
        input.close();
    }
}
