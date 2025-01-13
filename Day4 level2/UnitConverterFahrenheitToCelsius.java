//Program to convert unit Fahrenheit to celsius
public class UnitConverterFahrenheitToCelsius {

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        // Test cases
        double fahrenheit2celsius = convertFahrenheitToCelsius(32);
        System.out.println("32°F = " + fahrenheit2celsius + "°C");

        double celsius2fahrenheit = convertCelsiusToFahrenheit(0);
        System.out.println("0°C = " + celsius2fahrenheit + "°F");

        double pounds2kilograms = convertPoundsToKilograms(10);
        System.out.println("10 pounds = " + pounds2kilograms + " kilograms");

        double kilograms2pounds = convertKilogramsToPounds(5);
        System.out.println("5 kilograms = " + kilograms2pounds + " pounds");

        double gallons2liters = convertGallonsToLiters(2);
        System.out.println("2 gallons = " + gallons2liters + " liters");

        double liters2gallons = convertLitersToGallons(3);
        System.out.println("3 liters = " + liters2gallons + " gallons");
    }
}
