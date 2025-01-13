import java.util.Scanner;
//Program to Calculate the rounds of the athlete
public class CalculateRoundOfAthlete{
		public static double calculateRounds(int side1,int side2, int side3,int distance){
					// Calculate the perimeter of the triangular track
					int perimeter=side1+side2+side3;
					
        // Calculate the total rounds the athlete can complete by dividing the total distance by the perimeter
					return distance/perimeter;
			}
		public static void main(String[] args){
				//Create an object of class Scanner
				Scanner input=new Scanner(System.in);
				
				// Total distance the athlete wants to run (5 kilometers converted to meters)

				int distance=5*1000;//5 kilometers = 5000 meters
				
				// Prompt user for the sides of the triangular track
				System.out.println("Enter First side");
				int side1=input.nextInt();// Get the length of the first side
        
				System.out.println("Enter second side");
				int side2=input.nextInt();// Get the length of the second side
        
				System.out.println("Enter third side");// Get the length of the third side
        
				int side3=input.nextInt();
				
				// Call the calculateRounds method and print the total number of rounds
        // Cast the result to an integer before printing (since we're interested in whole rounds)
				System.out.println("Total no. of rounds is: "+(int)calculateRounds(side1,side2,side3,distance));
		}
	}