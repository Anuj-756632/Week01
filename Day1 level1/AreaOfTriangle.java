import java.util.Scanner;
//Program to Find Area of triangle
public class AreaOfTriangle{
		public static void main(String[] args){
				//Create an object of Scanner Calss
				Scanner input=new Scanner(System.in);
				System.out.println("Enter Base and Height");
				
				//Input Base and height
				int base=input.nextInt();
				int height=input.nextInt();
				
				//Area of triangle in cm
				double areaCm=(1*(base*height)/2);
				
				//Area of triangle in feet
				double areaFeet=areaCm/(12*2.54);
				
				//Area of triangle in cm
				double areaInches=areaCm/2.54;
				
				//Display result
				System.out.println("Your Area of triangle in cm is "+areaCm+" while in feet is "+areaFeet+" and inches is "+areaInches);
		}
	}		