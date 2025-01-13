import java.util.Scanner;
//Program to calculate height in cm to feet and inches
public class Height{
		public static void main(String[] args){
				//create object of Scanner class
				Scanner input=new Scanner(System.in);
				System.out.println("Enter height in cm");
				//input the Height in cm
				int cm=input.nextInt();
				
				//height in feet
				double feet=cm/(12*2.54);
				
				//height in inches
				double inches=cm/2.54;
				
				//Display the result
				System.out.println("Your Height in cm is "+cm+" while in feet is "+feet+" and inches is "+inches);
		}
	}