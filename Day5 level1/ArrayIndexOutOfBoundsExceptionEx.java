import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;
public class ArrayIndexOutOfBoundsExceptionEx{
			public static void handelArrayIndexOutOfBoundsException(){
			Scanner input=new Scanner(System.in);
					System.out.println("Enter array Size");
					
					int size=input.nextInt();
				
					int []array=new int[size];
					try{
						for(int i=0;i<size;i++){
							System.out.println("Enter input");
							array[i]=input.nextInt();
							}
						for(int i=0;i<size+1;i++){
							System.out.println(array[i]);
						}
					}
					catch(ArrayIndexOutOfBoundsException ex){
							System.out.println("ArrayIndexOutOfBoundsException occour: ");
							System.out.println("Array size exceed: "+ex.getMessage());
							System.out.println(ex.getStackTrace());
					}
			}

			public static void main(String[] args){
					System.out.println("Handel ArrayIndexOutOfBoundsException");
					handelArrayIndexOutOfBoundsException();
				}
		}