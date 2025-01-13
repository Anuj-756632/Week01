import java.util.Scanner;
//program to calculate a student grades in array
public class StudentGradeCalculator {

    public static void main(String[] args) {
		//Create an object of class Scanner
        Scanner input = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Arrays to store marks, percentage, and grade for each student
        double[] physicsMarks = new double[numStudents];
        double[] chemistryMarks = new double[numStudents];
        double[] mathsMarks = new double[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Input marks for each student
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
                System.out.print("Enter marks in Maths for student " + (i + 1));
                maths = input.nextDouble();
                if (maths < 0) {
                    System.out.println("Marks cannot be negative. Please enter valid marks.");
                }
            } while (maths < 0);

            // Store marks in arrays
            physicsMarks[i] = physics;
            chemistryMarks[i] = chemistry;
            mathsMarks[i] = maths;

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

        // Display results
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics Marks: " + physicsMarks[i]);
            System.out.println("Chemistry Marks: " + chemistryMarks[i]);
            System.out.println("Maths Marks: " + mathsMarks[i]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
        }

        input.close();
    }
}
