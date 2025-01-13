import java.util.Scanner;
//Program to calculate the no of handshake of students
public class HandeShakesOfStudentsPart2{
		public static int calculateMaxHandShakes(int numberOfStudent){
					
					return (numberOfStudent*(numberOfStudent-1))/2;
			}
		public static void main(String[] args){
				//Create an object of class Scanner
				Scanner input=new Scanner(System.in);
				
				//Declare variable and take an input 
				System.out.println("Enter the no. Students");
				int numberOfStudent=input.nextInt();
				
				//Call the function to calculate the handshakes
				System.out.println("The maximum no. of handshakes is: "+calculateMaxHandShakes(numberOfStudent));
			
		}
	}