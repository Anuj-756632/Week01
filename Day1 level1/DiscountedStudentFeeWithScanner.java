import java.util.Scanner;
//Program to calculate discounted fee to the students with Scanner
public class DiscountedStudentFeeWithScanner{
       public static void main(String[] args){
			//create an object of Scanner
			Scanner input=new Scanner(System.in);
			
	         // input charging fee to the student of INR 
			int fee=input.nextInt();
			 
			 //Input Discount offer to willng 
			int discountPercent=input.nextInt();
			
			//Calculate pens to have each Student
			int discount=(discountPercent*fee)/100;
			
			//Discounted Fee to the student 
			int discountedfee=fee-discount;
			
			//Display the result
			System.out.println("The discount amount is INR "+discount +" and final discounted fee is INR "+discountedfee);
		}
	}