import java.util.Scanner;
//program to find largest and second largets number
public class LargestAndSecondLargest {

    public static void main(String[] args) {
		//Create an object of scanner class
		Scanner input = new Scanner(System.in);
		
        // Initialize necessary variables
        int number;
        int maxDigit = 10; // Max size of the array
        int index = 0; // Index to track the array position

        

        // Taking input from the user
        System.out.println("Enter a number ");
        number = input.nextInt();

        // Define an array to store the digits, size is set to maxDigit (10)
        int[] digits = new int[maxDigit];

        // Extract digits and store them in the array
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10; // Get the last digit
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
        if (secondLargest == -1) {
            System.out.println("There is no second largest digit.");
        } else {
            System.out.println("The largest digit is: " + largest);
            System.out.println("The second largest digit is: " + secondLargest);
        }

        input.close();
    }
}
