import java.util.Scanner;
//Program to check the voting age of student

public class VotingAge{
		public static void main(String[] args){
				//Create an object of Scanner Class
				Scanner input=new Scanner(System.in);
				
				//declare the array
				int []studentAge=new int[10];
				
				//size of the array with the length
				int arraySize=studentAge.length;
				
				//Using for loop to assign the age to the student				
				for(int i=0;i<arraySize;i++){
				System.out.println("Enter age of Student");
				//input the age of students
						studentAge[i]=input.nextInt();
						//check the age for voting and print according to the age
						if(studentAge[i]>=18){
								System.out.println(" The student with the age "+studentAge[i]+" can vote");
						}
						else{
								System.out.println("The student with the age "+studentAge[i]+" cannot vote");
						}
				}
		}
	}
