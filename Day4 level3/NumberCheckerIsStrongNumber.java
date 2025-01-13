import java.util.ArrayList;
import java.util.List;

public class NumberCheckerIsStrongNumber {

    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        List<Integer> factorsList = new ArrayList<>();

        // Loop to find factors
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factorsList.add(i);  // Adding the factor to the list
            }
        }
        factorsList.add(number);  // Add the number itself as a factor
        return factorsList.stream().mapToInt(Integer::intValue).toArray();  // Convert List to array
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors) {
        int maxFactor = factors[0];
        for (int factor : factors) {
            if (factor > maxFactor) {
                maxFactor = factor;
            }
        }
        return maxFactor;
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using the factors array
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);  // Cube the factor and multiply
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;  // Subtract the number itself to get proper divisors sum
        return sum == number;  // Check if sum of proper divisors equals the number itself
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;  // Subtract the number itself to get proper divisors sum
        return sum > number;  // If the sum of proper divisors is greater than the number, it's abundant
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;  // Subtract the number itself to get proper divisors sum
        return sum < number;  // If the sum of proper divisors is less than the number, it's deficient
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sumOfFactorial = 0;
        int originalNumber = number;

        // Calculate the sum of factorial of digits
        while (number > 0) {
            int digit = number % 10;
            sumOfFactorial += factorial(digit);  // Add factorial of the digit to sum
            number /= 10;
        }

        return sumOfFactorial == originalNumber;  // If sum of factorials equals the number, it's strong
    }

    // Helper method to calculate the factorial of a number
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Main method to call and test the utility methods
    public static void main(String[] args) {
        int number1 = 28;  // Perfect number
        int number2 = 12;  // Abundant number
        int number3 = 6;   // Deficient number
        int number4 = 145; // Strong number

        System.out.println("Testing Number: " + number1);
        int[] factors1 = findFactors(number1);
        System.out.println("Factors: " + arrayToString(factors1));
        System.out.println("Greatest Factor: " + greatestFactor(factors1));
        System.out.println("Sum of Factors: " + sumOfFactors(factors1));
        System.out.println("Product of Factors: " + productOfFactors(factors1));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors1));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number1));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number1));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number1));
        System.out.println("Is Strong Number: " + isStrongNumber(number1));

        System.out.println("\nTesting Number: " + number2);
        int[] factors2 = findFactors(number2);
        System.out.println("Factors: " + arrayToString(factors2));
        System.out.println("Greatest Factor: " + greatestFactor(factors2));
        System.out.println("Sum of Factors: " + sumOfFactors(factors2));
        System.out.println("Product of Factors: " + productOfFactors(factors2));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors2));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number2));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number2));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number2));
        System.out.println("Is Strong Number: " + isStrongNumber(number2));

        System.out.println("\nTesting Number: " + number3);
        int[] factors3 = findFactors(number3);
        System.out.println("Factors: " + arrayToString(factors3));
        System.out.println("Greatest Factor: " + greatestFactor(factors3));
        System.out.println("Sum of Factors: " + sumOfFactors(factors3));
        System.out.println("Product of Factors: " + productOfFactors(factors3));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors3));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number3));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number3));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number3));
        System.out.println("Is Strong Number: " + isStrongNumber(number3));

        System.out.println("\nTesting Number: " + number4);
        int[] factors4 = findFactors(number4);
        System.out.println("Factors: " + arrayToString(factors4));
        System.out.println("Greatest Factor: " + greatestFactor(factors4));
        System.out.println("Sum of Factors: " + sumOfFactors(factors4));
        System.out.println("Product of Factors: " + productOfFactors(factors4));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors4));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number4));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number4));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number4));
        System.out.println("Is Strong Number: " + isStrongNumber(number4));
    }

    // Helper method to convert array of factors to string
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }
}
