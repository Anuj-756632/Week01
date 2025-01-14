import java.util.Scanner;
//Program to compare two Strings
public class CompareTwoStrings{
		public static boolean compareStrings(String string1,String string2){
				if (string1.length()!=string2.length()){
						return false;
					}
				for(int i=0;i<string1.length();i++){
						if((string1.charAt(i))==(string2.charAt(i))){
								return true;
							}
					}
					return true;
			}
			
		//compare with equals method
		public static boolean compareWithEquals(String string1,String string2){
					if (string1.length()!=string2.length()){
						return false;
					}
					return string1.equals(string2);
		}
		public static void main(String[] args){
				Scanner input=new Scanner(System.in);
				System.out.println("Enter string 1");
				
				String string1=input.next();
				System.out.println("Enter String 2");
				
				String string2=input.next();
				if(compareStrings(string1,string2)&& compareWithEquals(string1,string2)){
							System.out.println("Both String is equals in both ways");
				}
				else{
					System.out.println("Both are not equals");
				}
		}
	}
				