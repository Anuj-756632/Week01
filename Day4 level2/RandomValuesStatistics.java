import java.util.*;

public class RandomValuesStatistics {

    // Method to generate an array of 4-digit random numbers of a given size
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            // Generate a 4-digit random number (1000 to 9999)
            randomNumbers[i] = 1000 + random.nextInt(9000); // Random number between 1000 and 9999
        }

        return randomNumbers;
    }

    // Method to find average, min, and max values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Calculate sum, min, and max in one loop
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Return the results: average, min, and max
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int size = 5;

        // Generate an array of 5 4-digit random numbers
        int[] randomNumbers = generate4DigitRandomArray(size);

        // Display the random numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }

        // Find the average, min, and max of the numbers
        double[] stats = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("\nStatistics:");
        System.out.println("Average value: " + stats[0]);
        System.out.println("Minimum value: " + stats[1]);
        System.out.println("Maximum value: " + stats[2]);
    }
}
