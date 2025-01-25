import java.util.Scanner;
class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            while (true) {
                System.out.print("Weight (in kg): ");
                double weight = sc.nextDouble();
                if (weight > 0) {
                    personData[i][0] = weight;
                    break;
                } else {
                    System.out.println("Please enter a positive value for weight.");
                }
            }

            while (true) {
                System.out.print("Height (in meters): ");
                double height = sc.nextDouble();
                if (height > 0) {
                    personData[i][1] = height;
                    break;
                } else {
                    System.out.println("Please enter a positive value for height.");
                }
            }
        }

        for (int i = 0; i < numPersons; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nDetails of each person:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println();
        }
    }
}
