//  Program to Calculate Volume of earth
public class VolumeOfEarth{
		public static void main(String []args){
				//Radius of Earth in km
				double radiusInKm=6378;
				
				//Radius of Earth in miles
				double radiusInMiles=6378*1.6;
				
				//Value of pi
				double pi=3.14;
				
				//Calculate Volume of earth in km
				double volumeOfEarthKm=(4/3)*pi*(radiusInKm*radiusInKm*radiusInKm);
				
				//Calculate Volume of earth in miles
				double volumeOfEarthMiles=(4/3)*pi*(radiusInMiles*radiusInMiles*radiusInMiles);
				
				//Display the Result
				System.out.println("The volume of earth in cubic kilometers is "+volumeOfEarthKm+" and cubic miles is "+volumeOfEarthMiles);
		}
	}