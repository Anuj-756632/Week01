import java.util.Scanner;
//Program to calculate Simple Interest using method
public class SimpleInterest{
		public static double calculateSimpleInterest(int principal,double rate,double time){
						return (principal*rate*time)/100;
			}
		public static void main(String[] args){
				//Create an object of Scanner class
				Scanner input=new Scanner(System.in);
				
				//Daclare variable and assign vlaue to input
				System.out.print("Enter Principal amount:");
				int principal=input.nextInt();
				
				System.out.print("Enter rate of interest:");
				double rate=input.nextDouble();
				
				System.out.print("Enter Time to amount:");
				double time=input.nextDouble();
				
				System.out.println("The simple Interest is: "+calculateSimpleInterest(principal,rate,time));
			}
	}