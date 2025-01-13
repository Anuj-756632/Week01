//Program to distribute pen among Three students equally
public class DistributePens{
       public static void main(String[] args){
	         //Total no of pens to distribute
			int pens=14;
			 
			 //No of Students
			int students=3;
			
			//Calculate pens to have each Student
			int penPerStudent=pens/students;
			
			//Calculate Remaining pens
			int remainingPens=pens%students;
			
			//Display the result
			System.out.println("The Pen Per Student is "+penPerStudent+" and the remaining pen not distributed is "+remainingPens);
		}
	}