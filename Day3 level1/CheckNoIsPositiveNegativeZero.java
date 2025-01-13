import java.util.Scanner;
//Program to check the no. is (+)ve, (-)ve, zero, even, odd
public class CheckNoIsPositiveNegativeZero{
			public static void main(String[] args){
					//Create an object od Scanner Class
					Scanner input=new Scanner(System.in);
					
					//Declare a array of numbers 
					int []arrayOfNumber=new int[5];
					
					//Size of array
					int size=arrayOfNumber.length;
					
					//Using for loop to take input
					for(int i=0;i<size;i++){
							//assign the number in the array
							System.out.println("Enter the number");
							arrayOfNumber[i]=input.nextInt();
							if(arrayOfNumber[i]==0){
									System.out.println("Number is Zero");
								}
							else if(arrayOfNumber[i]<0){
									System.out.println("Number is Negative");
								}
							else {
									if(arrayOfNumber[i]%2==0){
											System.out.println(arrayOfNumber[i]+" Number ia even");
										}
									else{
											System.out.println(arrayOfNumber[i]+" Number is odd");
										}
								}
						
						}
						if(arrayOfNumber[0]==arrayOfNumber[4]){
									System.out.println("First and Last number is Equal");
								}
							else if(arrayOfNumber[0]>arrayOfNumber[4]){
									System.out.println("First number is greater than the last number");
								}
							else{
									System.out.println("First number is lesser then the last number");
								}
				    //close the Scanner class
					input.close();
				}
	}