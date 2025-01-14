import java.util.Scanner;
//Program to Create subString and compare
public class CreateAndCompareString{
	
		public static String subStringUsingcharAtMethod(int start,int end,String string){
				String str="";
				for(int i=start;i<end;i++){
						str+=string.charAt(i);
				}
				return str;
		}
		public static boolean compare(String str,String str2){
				if(str.equals(str2)) 
					return true;
				
				else 
					return false;
				
		}
		public static void main(String []args){
				Scanner input=new Scanner(System.in);
				System.out.println("Enter a String");
				String string=input.next();
				System.out.println("Enter Start index");
				int start=input.nextInt();
				System.out.println("Enter End index");
				int end=input.nextInt();
				
				String str2 = string.substring(start,end);
				
				if(compare(subStringUsingcharAtMethod(start,end,string),str2)){
						System.out.println("Both are equal");
					}
					else{
						System.out.println("Both are not equal");
					}
		}
	}