import java.util.Scanner;
import java.lang.NumberFormatException;
public class NumberFormatExceptionEx{
		public static void handelNumberFormatException(){
				Scanner input=new Scanner(System.in);
				System.out.println("Enter String");
				
				try{
					String text=input.next();
					int number=Integer.parseInt(text);
					System.out.println("Number is :"+number);
				}catch(NumberFormatException ex){
						System.out.println("Exception occour "+ ex.getMessage());
						System.out.println(ex.getStackTrace());
					}
		}
		public static void main(String[] args){
				System.out.println("Handel NumberFormatException");
				handelNumberFormatException();
				
		}
	}