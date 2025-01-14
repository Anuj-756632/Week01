import java.util.Scanner;
public class IllegalArgumentExceptionEx{
		public static void handleIllegalArgumentException(){
				try{
					Scanner input=new Scanner(System.in);
					System.out.println("Enter String");
					String text=input.next();
					System.out.println("Enter start index");
					int start=input.nextInt();
					System.out.println("Enter end index");
					int end=input.nextInt();
					String str=text.substring(start,end);
					}catch(IllegalArgumentException ex){
							System.out.println(ex.getMessage());
							System.out.println("calling wrong indexes");
						}
				finally {
						// Close the scanner to avoid resource leak
						input.close();
					}
			}
				
		public static void main(String[] args){
				System.out.println("Handel IllegalArgumentException");

				handleIllegalArgumentException();
			}
	}