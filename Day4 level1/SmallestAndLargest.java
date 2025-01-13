import java.util.Scanner;

public class SmallestAndLargest {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        // Create an array to store the smallest and largest numbers
        int[] result = new int[2];
        
        // Find the smallest number
        int smallest = number1;  // Assume number1 is the smallest initially
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
        
        // Find the largest number
        int largest = number1;  // Assume number1 is the largest initially
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }
        
        // Store the smallest and largest numbers in the array
        result[0] = smallest;
        result[1] = largest;
        
        // Return the array containing smallest and largest
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter three numbers
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        
        System.out.print("Enter third number: ");
        int number3 = input.nextInt();
        
        // Call the method to find the smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);
        
        // Output the smallest and largest numbers
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
        
        // Close the scanner to avoid resource leaks
        input.close();
    }
}
