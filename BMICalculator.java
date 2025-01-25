import java.util.Scanner;
class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (in kg): ");
            weights[i] = sc.nextDouble();
            System.out.print("Height (in meters): ");
            heights[i] = sc.nextDouble();
        }

        for (int i = 0; i < numPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        System.out.println("\nDetails of each person:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + heights[i] + " m");
            System.out.println("Weight: " + weights[i] + " kg");
            System.out.println("BMI: " + bmis[i]);
            System.out.println("Weight Status: " + statuses[i]);
            System.out.println();
        }
    }
}
