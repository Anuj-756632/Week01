import java.util.Scanner;
//Program of Multiplication btw 6 to 9
public class MultiplicationBtwSixToNine{
		public static void main(String[] args){
				//Create an object of Scanner class
				Scanner input=new Scanner(System.in);
				System.out.println("Enter the number");
				//Create a variable to store a number of multiplication
				int number=input.nextInt();
				
				//declare a array of multiplication
				int[] arrayOfMultiplication=new int[10];
				
				//size of array
				int size=arrayOfMultiplication.length;
				//create another variable index to store in the array
				int index=0;
				//store the multiplication of number into the array
				for(int i=1;i<size+1;i++){
						arrayOfMultiplication[index]=number*i;
						index++;
					}
					
					//Display the result of multiplication
					//int index1=0;//for index
				for(int i=6;i<=9;i++){
						
						System.out.println(number+"*"+i+"="+arrayOfMultiplication[i-1]);
						
					}
					//close the scanner class
					input.close();
		}
	}
				