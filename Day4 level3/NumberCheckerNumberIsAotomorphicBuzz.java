public class NumberCheckerNumberIsAotomorphicBuzz {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;  // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // Found a divisor, so it's not prime
            }
        }
        return true;  // No divisors found, the number is prime
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        
        // Sum the digits of the square of the number
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        
        return sumOfDigits == number;  // If sum of digits equals the number itself, it's a neon number
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int originalNumber = number;
        
        // Calculate sum and product of digits
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        
        return sum == product;  // If sum equals product, it's a spy number
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        
        // Check if the square ends with the number itself
        return (square % (int)Math.pow(10, countDigits(number))) == number;
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;  // Divisible by 7 or ends with 7
    }

    // Method to count the digits of a number
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    // Main method to call and test the utility methods
    public static void main(String[] args) {
        int number1 = 28;
        int number2 = 9;
        int number3 = 9;
        int number4 = 5;
        int number5 = 70;
        int number6 = 16;
        int number7 = 12;
        
        System.out.println("Testing Number: " + number1);
        System.out.println("Is Prime: " + isPrime(number1));
        System.out.println("Is Neon: " + isNeon(number1));
        System.out.println("Is Spy: " + isSpy(number1));
        System.out.println("Is Automorphic: " + isAutomorphic(number1));
        System.out.println("Is Buzz: " + isBuzz(number1));
        
        System.out.println("\nTesting Number: " + number2);
        System.out.println("Is Prime: " + isPrime(number2));
        System.out.println("Is Neon: " + isNeon(number2));
        System.out.println("Is Spy: " + isSpy(number2));
        System.out.println("Is Automorphic: " + isAutomorphic(number2));
        System.out.println("Is Buzz: " + isBuzz(number2));
        
        System.out.println("\nTesting Number: " + number3);
        System.out.println("Is Prime: " + isPrime(number3));
        System.out.println("Is Neon: " + isNeon(number3));
        System.out.println("Is Spy: " + isSpy(number3));
        System.out.println("Is Automorphic: " + isAutomorphic(number3));
        System.out.println("Is Buzz: " + isBuzz(number3));
        
        System.out.println("\nTesting Number: " + number4);
        System.out.println("Is Prime: " + isPrime(number4));
        System.out.println("Is Neon: " + isNeon(number4));
        System.out.println("Is Spy: " + isSpy(number4));
        System.out.println("Is Automorphic: " + isAutomorphic(number4));
        System.out.println("Is Buzz: " + isBuzz(number4));
        
        System.out.println("\nTesting Number: " + number5);
        System.out.println("Is Prime: " + isPrime(number5));
        System.out.println("Is Neon: " + isNeon(number5));
        System.out.println("Is Spy: " + isSpy(number5));
        System.out.println("Is Automorphic: " + isAutomorphic(number5));
        System.out.println("Is Buzz: " + isBuzz(number5));
        
        System.out.println("\nTesting Number: " + number6);
        System.out.println("Is Prime: " + isPrime(number6));
        System.out.println("Is Neon: " + isNeon(number6));
        System.out.println("Is Spy: " + isSpy(number6));
        System.out.println("Is Automorphic: " + isAutomorphic(number6));
        System.out.println("Is Buzz: " + isBuzz(number6));
        
        System.out.println("\nTesting Number: " + number7);
        System.out.println("Is Prime: " + isPrime(number7));
        System.out.println("Is Neon: " + isNeon(number7));
        System.out.println("Is Spy: " + isSpy(number7));
        System.out.println("Is Automorphic: " + isAutomorphic(number7));
        System.out.println("Is Buzz: " + isBuzz(number7));
    }
}
