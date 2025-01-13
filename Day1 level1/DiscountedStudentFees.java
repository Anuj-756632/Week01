//Program to calculate discounted fee to the students
public class DiscountedStudentFees{
       public static void main(String[] args){
	         //charging fee to the student of INR 125000
			int fee=125000;
			 
			 //Discount offer to willng 10
			int discountPercent=10;
			
			//Calculate pens to have each Student
			int discount=(10*125000)/100;
			
			//Discounted Fee to the student 
			int discountedfee=fee-discount;
			
			//Display the result
			System.out.println("The discount amount is INR "+discount +" and final discounted fee is INR "+discountedfee);
		}
}