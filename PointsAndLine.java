import java.util.Scanner;
class PointsAndLine {

    // Method to calculate the Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the slope and y-intercept of the line passing through two points
    public static String calculateLineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            // Special case for vertical lines
            return "The line is vertical with equation: x = " + x1;
        }

        // Calculate slope (m)
        double slope = (y2 - y1) / (x2 - x1);
        // Calculate y-intercept (b)
        double yIntercept = y1 - slope * x1;

        // Return the equation of the line
        return String.format("y = %.2f*x + %.2f", slope, yIntercept);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs for two points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate and display the Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between the two points: %.2f\n", distance);

        // Calculate and display the equation of the line
        String lineEquation = calculateLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: " + lineEquation);
    }
}
