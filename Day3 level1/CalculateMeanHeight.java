import java.util.Scanner;
//Program to find the mean height of players
public class CalculateMeanHeight{
		public static void main(String[] args){
				//Create an object Of Scanner Class
				Scanner input=new Scanner(System.in);
				
				//Create a double type array
				double[] height=new double[11];
				
				//create a variable sum and assign 0
				double sum=0;
				
				//size of the array
				int size=height.length;
				
				//Using for loop to store value in array
				for(int i=0;i<size;i++){
				        System.out.println("Enter heights of the players");
						height[i]=input.nextDouble();
						sum+=height[i];
				}
				System.out.println("The mean height of the player is "+sum/11);
				input.close();
		}
	}