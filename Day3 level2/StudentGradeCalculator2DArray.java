import java.util.Scanner;
//Program to Calculate a grade with 2D array
public class StudentGradeCalculator2DArray {

    public static void main(String[] args) {
		//Create an object of class Scanner
        Scanner input = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Create a 2D array to store marks of 3 subjects (Physics, Chemistry, Maths) for each student
        double[][] marks = new double[numStudents][3]; // 3 subjects for each student
        double[] percentages = new double[numStudents]; // Array to store percentages
        String[] grades = new String[numStudents]; // Array to store grades

        // Input marks for each student in Physics, Chemistry, and Maths
        for (int i = 0; i < numStudents; i++) {
            double physics, chemistry, maths;

            // Input for Physics
            do {
                System.out.print("Enter marks in Physics for student " + (i + 1) + ": ");
                physics = input.nextDouble();
                if (physics < 0) {
                    System.out.println("Marks cannot be negative. Please enter valid marks.");
                }
            } while (physics < 0);

            // Input for Chemistry
            do {
                System.out.print("Enter marks in Chemistry for student " + (i + 1) + ": ");
                chemistry = input.nextDouble();
                if (chemistry < 0) {
                    System.out.println("Marks cannot be negative. Please enter valid marks.");
                }
            } while (chemistry < 0);

            // Input for Maths
            do {
                System.out.print("Enter marks in Maths for student " + (i + 1) + ": ");
                maths = input.nextDouble();
                if (maths < 0) {
                    System.out.println("Marks cannot be negative. Please enter valid marks.");
                }
            } while (maths < 0);

            // Store the marks in the 2D array (marks[i][0] = Physics, marks[i][1] = Chemistry, marks[i][2] = Maths)
            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;

            // Calculate total marks and percentage
            double totalMarks = physics + chemistry + maths;
            percentages[i] = (totalMarks / 300) * 100;

            // Assign grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "B";
            } else if (percentages[i] >= 70) {
                grades[i] = "C";
            } else if (percentages[i] >= 60) {
                grades[i] = "D";
            } else if (percentages[i] >= 50) {
                grades[i] = "E";
            } else if (percentages[i] >= 40) {
                grades[i] = "R";
            } else {
                grades[i] = "Remedial";
            }
        }

        // Display results for each student
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics Marks: " + marks[i][0]);
            System.out.println("Chemistry Marks: " + marks[i][1]);
            System.out.println("Maths Marks: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
        }

        input.close();
    }
}
