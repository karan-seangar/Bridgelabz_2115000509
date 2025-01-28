import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent for a given angle
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results as an array
        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrigonometricFunctions trigFunctions = new TrigonometricFunctions();

        // Take user input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Calculate trigonometric functions
        double[] results = trigFunctions.calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.println("For angle: " + angle + " degrees");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

        scanner.close();
    }
}
