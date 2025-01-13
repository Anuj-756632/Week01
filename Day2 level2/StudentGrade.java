import java.util.Scanner;
//Program to find Student Grade
public class StudentGrade {

    public static void main(String[] args) {
        // Create a Scanner object to input
        Scanner input = new Scanner(System.in);

        // Declare variables for marks in Physics, Chemistry, and Maths
        double physicsMarks, chemistryMarks, mathsMarks;
        
        // Ask the user to input marks for the three subjects
        System.out.println("Enter marks for Physics ");
        physicsMarks = input.nextDouble();
        
        System.out.println("Enter marks for Chemistry ");
        chemistryMarks = input.nextDouble();
        
        System.out.println("Enter marks for Maths ");
        mathsMarks = input.nextDouble();

        // Calculate the total and percentage
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = (totalMarks / 300) * 100;

        // Display the percentage
        System.out.println("Percentage: " + percentage + "%");

        // Determine the grade based on the percentage
        String grade;
        
        if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else if (percentage >= 50) {
            grade = "E";
        } else if (percentage >= 40) {
            grade = "R";
        } else {
            grade = "Remedial standards";
        }

        // Display the grade
        System.out.println("Grade: " + grade);

        // Close the scanner object to prevent resource leak
        input.close();
    }
}
