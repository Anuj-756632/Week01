import java.util.Random;

public class StudentScoreCard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math (PCM) for students
    public static int[][] generateRandomScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];  // Array to hold scores for PCM
        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(81) + 20;  // Physics score between 20 and 100
            scores[i][1] = rand.nextInt(81) + 20;  // Chemistry score between 20 and 100
            scores[i][2] = rand.nextInt(81) + 20;  // Math score between 20 and 100
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][4];  // Array to hold total, average, percentage, and grade
        
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];  // Total score
            double average = total / 3.0;  // Average score
            double percentage = (total / 300.0) * 100;  // Percentage score
            
            // Round off the values to 2 digits
            results[i][0] = total;  // Store total
            results[i][1] = Math.round(average * 100.0) / 100.0;  // Store average rounded to 2 decimals
            results[i][2] = Math.round(percentage * 100.0) / 100.0;  // Store percentage rounded to 2 decimals
            results[i][3] = getGrade(percentage);  // Store grade based on percentage
        }
        return results;
    }

    // Method to get the grade based on the percentage
    public static double getGrade(double percentage) {
        if (percentage >= 80) return 'B';
        else if (percentage >= 70) return 'C';
        else if (percentage >= 60) return 'D';
        else if (percentage >= 50) return 'E';
        else if (percentage >= 40) return 'R';
        else return 'F';
    }

    // Method to display the scorecard in tabular format
    public static void displayScoreCard(int[][] scores, double[][] results, int numStudents) {
        System.out.println("Student Score Card");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------------");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t\t");
            System.out.print(results[i][0] + "\t");
            System.out.print(results[i][1] + "\t\t");
            System.out.print(results[i][2] + "%\t\t");
            System.out.println((char) results[i][3]);
        }
    }

    // Main method
    public static void main(String[] args) {
        int numStudents = 5;  // Set the number of students (can be changed to any value)
        
        // Generate random scores for students
        int[][] scores = generateRandomScores(numStudents);
        
        // Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores, numStudents);
        
        // Display the scorecard
        displayScoreCard(scores, results, numStudents);
    }
}
