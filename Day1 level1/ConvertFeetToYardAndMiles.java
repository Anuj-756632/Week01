import java.util.Scanner;
//Program to calculate the distance in yard and miles
public class ConvertFeetToYardAndMiles{
		public static void main(String []args){
				//Create an object of Scanner class
				Scanner input=new Scanner(System.in);
				System.out.println("Enter Distance in feet");
				
				//input Distance in feet
				int distanceInFeet=input.nextInt();
				
				//calculate feet to yard
				int distanceInyard=distanceInFeet/3;
				
				//calculate feet to milesint 
				int distanceInmiles=distanceInyard/1760;
				
				//Display result
				System.out.println("Distance in feet "+distanceInFeet+" while in yard is "+distanceInyard+" and miles is "+distanceInmiles);
		}
	}
				