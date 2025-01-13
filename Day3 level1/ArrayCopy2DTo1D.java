import java.util.Scanner;

public class ArrayCopy2DTo1D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        // Creating a 2D array with the given rows and columns
        int[][] matrix = new int[rows][columns];

        // Taking user input to fill the 2D array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Create a 1D array to store all the elements of the 2D array
        int[] array = new int[rows * columns];

        // Copy elements from the 2D array to the 1D array
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j]; // Copy each element
            }
        }

        // Display the 1D array
        System.out.println("The elements in the 1D array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Close scanner
        input.close();
    }
}
