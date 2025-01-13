import java.util.Scanner;
//program to find 
public class YoungerAndTallestFriend{
		public static void main(String[] args){
				//Create an Object of class Scanner
				Scanner input=new Scanner(System.in);
				
				//Declare and define Friend Name Array
				String[] friends={"Amar","Akbar","Anthony"};
				
				//size of the age and height array
				int size=friends.length;
				//declare age Array
				int[] age=new int[size];
				
				//declare height array
				double[] height=new double[size];
				
				//input the  friends name age and height
				for(int i=0;i<size;i++){
						System.out.println("Friend name: "+friends[i]);
						//input age
						System.out.println("Enter age");
						age[i]=input.nextInt();
						//input height
						System.out.println("Enter height");
						height[i]=input.nextInt();
				}
				//check and print the youngest and tallest friend 
				int youngestAge = age[0];
                String youngestFriend= "" ;
        
				// Find the tallest friend
				double tallestHeight = height[0];
				String tallestFriend = "";

				for (int i = 0; i <3; ++i) {
					if (age[i] <= youngestAge) {
						youngestAge = age[i];
						youngestFriend = friends[i];;
				    }
					
						if (height[i] > tallestHeight) {
								tallestHeight = height[i];
								tallestFriend = friends[i];
						}
				}
				System.out.println("\nThe youngest friend is: " + youngestFriend + " (Age: " + youngestAge + " years)");
				System.out.println("The tallest friend is: " + tallestFriend + " (Height: " + tallestHeight + " meters)");

        input.close();
    }
}