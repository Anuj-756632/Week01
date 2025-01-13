import java.util.Scanner;
//Program to calculate distance in km to miles to use Scanner
public class DistanceConvertWithScanner{
		public static void main(String[] args){
				//create object of Scanner class
				Scanner input=new Scanner(System.in);	
				System.out.println("Enter distance in km");
				//take input to the user
				int km=input.nextInt();
				
				//calculate miles to given km
				double miles=km*1.6;
				
				//Display result
				System.out.println("The total miles is "+miles+"mile for the given "+km+"km");
		}
	}