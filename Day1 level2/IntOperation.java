import java.util.Scanner;
//Program to calculate integer
public class IntOperation{
		public static void main(String[] args){
				//Create an object of Scanner class
				Scanner input=new Scanner(System.in);
				System.out.println("Enter three integer value");
				
				//Input three Integer values
				int a=input.nextInt();
				int b=input.nextInt();
				int c=input.nextInt();
				
				//Compute Integer Operation-1
				int operation1=a + b *c;
				
				//Compute Integer Operation-2
				int operation2=a * b + c;
				
				//Compute Integer Operation-3
				int operation3=c + a / b;
				
				//Compute Integer Operation-4
				int operation4=a % b + c;
				
				System.out.println("The results of Int Operations are "+operation1+","+operation2+","+operation3+" and "+operation4);
		}
	}