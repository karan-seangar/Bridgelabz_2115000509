public class UnitConverter {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3; // Conversion factor
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333; // Conversion factor
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701; // Conversion factor
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254; // Conversion factor
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54; // Conversion factor
        return inches * inches2cm;
    }

    // Main method to test the UnitConverter class
    public static void main(String[] args) {
        // Testing the methods
        double yards = 5;
        System.out.println(yards + " yards to feet: " + convertYardsToFeet(yards));

        double feet = 15;
        System.out.println(feet + " feet to yards: " + convertFeetToYards(feet));

        double meters = 2;
        System.out.println(meters + " meters to inches: " + convertMetersToInches(meters));

        double inches = 50;
        System.out.println(inches + " inches to meters: " + convertInchesToMeters(inches));

        System.out.println(inches + " inches to centimeters: " + convertInchesToCentimeters(inches));
    }
}
