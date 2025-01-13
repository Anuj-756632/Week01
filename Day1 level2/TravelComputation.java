import java.util.Scanner;
// Create TravelComputation Class to compute the Distance and Travel Time
public class TravelComputation {
   
   public static void main(String[] args) {
		//Create Scanner object to input
		Scanner input=new Scanner(System.in);
		
      // Create a variable name to indicate the person traveling
	  System.out.println("Enter name");
      String name = input.nextLine();
      
      // Create a variable fromCity, viaCity and toCity to indicate the city
      // from city, via city and to city the person is travelling
	  System.out.println("Enter fromCity, viaCity & toCity");
      String fromCity = input.nextLine();
	  String viaCity = input.nextLine();
      String toCity = input.nextLine();

      // Create a variable distanceFromToVia to indicate the distance 
      // between the fromCity to viaCity
	  System.out.println("Enter distance fromCity to viaCity ");
      double distanceFromToVia = input.nextDouble();

      // Create a variable distanceViaToFinalCity to indicate the distance 
      // between the viaCity to toCity
	  System.out.println("Enter distance viaCity to toCity ");
      double distanceViaToFinalCity = input.nextDouble();

      // Create a variable timeViaToFinalCity to indicate the time taken to
      // travel from viaCity to toCity in minutes
	  System.out.println("Enter time taken in whole journay");
      int timeTaken = input.nextInt();

      // Create a variable totalDistance to indicate the total distance
      // between the fromCity to toCity
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;
	  
      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + timeTaken);
   }
}
