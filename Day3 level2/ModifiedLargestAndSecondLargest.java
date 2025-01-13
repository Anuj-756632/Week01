import java.util.Scanner;
//program of modified largestand second largest no
public class ModifiedLargestAndSecondLargest {

    public static void main(String[] args) {
        // Initialize necessary variables
        int number;
        int maxDigit = 10; // Max size of the array
        int index = 0; // Index to track the array position

        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Define an array to store the digits, size is initially set to maxDigit (10)
        int[] digits = new int[maxDigit];

        // Extract digits and store them in the array
        while (number != 0) {
            // If the array is full (index reaches maxDigit), increase the size of the array
            if (index == maxDigit) {
                maxDigit += 10; // Increase array size by 10
                // Create a new array with increased size
                int[] temp = new int[maxDigit];
                // Copy existing digits to the new array
                System.arraycopy(digits, 0, temp, 0, digits.length);
                // Reassign the digits array to the new temp array
                digits = temp;
            }

            // Add the last digit of the number to the array
            digits[index] = number % 10;
            number = number / 10; // Remove the last digit from the number
            index++;
        }

        // Variables to store the largest and second largest numbers
        int largest = -1;
        int secondLargest = -1;

        // Loop through the array to find the largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i]; // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second largest
            }
        }

        // Display the largest and second largest numbers
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);

        input.close();
    }
}
