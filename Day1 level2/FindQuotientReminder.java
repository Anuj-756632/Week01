import java.util.Scanner;
//Program to print Quotient and reminder
public class FindQuotientReminder{
		public static void main(String[] args){
				//create an object of Scanner class
				Scanner input=new Scanner(System.in);
				System.out.println("Enter two no.");
				
				//Input two values
				int number1=input.nextInt();
				int number2=input.nextInt();
				
				//calculate Quotient
				int quotient=number1/number2;
				
				//Calculate Reminder
				int reminder=number1%number2;
				
				//Display result
				System.out.println("The Quotient is "+quotient+" and Reminder is "+reminder+" of two number "+number1+" and "+number2);
				input.close();
		}
	}
