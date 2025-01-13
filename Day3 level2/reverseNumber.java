import java.util.Scanner;
//Program to ReverseNumber 
public class ReverseNumber {
    
    public static void main(String[] args) {
		//Create an object of class Scanner
        Scanner input = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Convert the number to a positive value (in case of negative input)
        number = Math.abs(number);
        
        // Find the count of digits in the number
        int count = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            count++;
            tempNumber /= 10;
        }
        
        // Create an array to store the digits of the number
        int[] digits = new int[count];
        
        // Extract digits and store them in the array
        tempNumber = number;
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10; // Get the last digit
            tempNumber /= 10; // Remove the last digit
        }
        
        // Display the digits in reverse order (from the digits array)
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        
        input.close();
    }
}
