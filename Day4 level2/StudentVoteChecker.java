import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote based on their age
    public boolean canStudentVote(int age) {
        // Validate if age is negative, return false if invalid
        if (age < 0) {
            return false;
        }
        // Check if age is 18 or greater, return true if eligible to vote
        if (age >= 18) {
            return true;
        }
        // Otherwise, return false
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the ages of 10 students
        int[] studentAges = new int[10];
        StudentVoteChecker voteChecker = new StudentVoteChecker(); // Create an instance of StudentVoteChecker

        // Loop through the array to take input for each student's age
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();

            // Check if the student can vote using canStudentVote method
            if (voteChecker.canStudentVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        scanner.close();
    }
}
