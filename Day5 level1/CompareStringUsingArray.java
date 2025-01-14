import java.util.Scanner;
 public class CompareStringUsingArray{
		public static char[] convertStringIntoCharArray(String string){
			char[] charArray=new char[string.length()];
			for(int i=0;i<string.length();i++){
				charArray[i]=string.charAt(i);	
				
			}	
			return charArray;
		}
		
		public static boolean compare( char []array,char[]charArray){
				if (array.length != charArray.length) {
					return false;
				}	
				for (int i = 0; i < array.length; i++) {
						if (array[i] != charArray[i]) {
						return false;
						}
				}
				return true;
		}
		
		public static void main(String[] args){
				Scanner input=new Scanner(System.in);
				String string=input.next();
			
				char[] array=string.toCharArray();
				
				if(compare(array,convertStringIntoCharArray(string))){
						System.out.println("Both are equal ");
					}
				else{
						System.out.println("Boyh are not equal");
					}
		}
	}					