//Program to convert unit by methods
public class UnitConverterYardToFeet {

    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet / 3;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    // Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        // Test cases
        double yards2feet = convertYardsToFeet(3);
        System.out.println("3 yards = " + yards2feet + " feet");

        double feet2yards = convertFeetToYards(1);
        System.out.println("1 foot = " + feet2yards + " yards");

        double meters2inches = convertMetersToInches(1);
        System.out.println("1 meter = " + meters2inches + " inches");

        double inches2meters = convertInchesToMeters(1);
        System.out.println("1 inch = " + inches2meters + " meters");

        double inches2cm = convertInchesToCentimeters(1);
        System.out.println("1 inch = " + inches2cm + " centimeters");

        double km2miles = convertKmToMiles(1);
        System.out.println("1 kilometer = " + km2miles + " miles");

        double miles2km = convertMilesToKm(1);
        System.out.println("1 mile = " + miles2km + " kilometers");

        double meters2feet = convertMetersToFeet(1);
        System.out.println("1 meter = " + meters2feet + " feet");

        double feet2meters = convertFeetToMeters(1);
        System.out.println("1 foot = " + feet2meters + " meters");
    }
}
