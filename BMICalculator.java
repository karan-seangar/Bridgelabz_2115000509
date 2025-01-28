import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert height to meters
            data[i][2] = weight / (heightInMeters * heightInMeters); // Calculate BMI
        }
    }

    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];

        System.out.println("Enter weight (kg) and height (cm) for 10 individuals:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        calculateBMI(data);
        String[] statuses = determineBMIStatus(data);

        System.out.println("\nHeight (cm), Weight (kg), BMI, Status:");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%.2f cm, %.2f kg, %.2f, %s%n", data[i][1], data[i][0], data[i][2], statuses[i]);
        }
    }
}
