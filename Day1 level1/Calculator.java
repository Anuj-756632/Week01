import java.util.Scanner;
//Program to calculate Arithmetic operation
public class Calculator{
		public static void main(String[] args){
				//create object of Scanner class
				Scanner input=new Scanner(System.in);
				System.out.println("Enter two numbwer");
				//Enter two inputs
				double num1=input.nextDouble();
				double num2=input.nextDouble();
				
				//Addition of two no
				double addition=num1+num2;
				
				//Subtract two no
				double subtraction=num1-num2;
				
				//multiply two no
				double multiplication=num1*num2;
				
				//division of two no
				double division=num1/num2;
				
				//Display result
				System.out.println("The addition, subtraction, multiplication and division value of 2 numbers"+num1+" and "+num2+" is "+addition+","+subtraction+","+multiplication+", and"+division);
		}
	}
