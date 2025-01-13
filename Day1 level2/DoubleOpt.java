import java.util.Scanner;
//Program of Double type Operation
public class DoubleOpt{
		public static void main(String []args){
				//Create an object of Scanner class
			Scanner input=new Scanner(System.in);
				
			System.out.println("Enter three Double values");
				
				//Input three Double type values
			double a=input.nextDouble();
			double b=input.nextDouble();
			double c=input.nextDouble();
				
				//Compute Integer Operation-1
			double operation1=a + b *c;
				
				//Compute Integer Operation-2
			double operation2=a * b + c;
				
				//Compute Integer Operation-3
			double operation3=c + a / b;
				
				//Compute Integer Operation-4
			double operation4=a % b + c;
				
			System.out.println("The results of Double Operations are "+operation1+","+operation2+","+operation3+" and "+operation4);
			input.close();
		}
	}