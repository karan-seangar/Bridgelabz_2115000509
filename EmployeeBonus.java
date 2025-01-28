import java.util.Random;
class EmployeeBonus {

    // Method to initialize salaries and years of service for 10 employees
    public static double[][] initializeData() {
        double[][] data = new double[10][2]; // [][0]: Salary, [][1]: Years of Service
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            data[i][0] = 20000 + random.nextInt(80001); // Generate random salary between 20000 and 100000
            data[i][1] = random.nextInt(11);           // Generate random years of service between 0 and 10
        }
        return data;
    }

    // Method to calculate bonus, new salary, and return updated data
    public static double[][] calculateBonusAndNewSalary(double[][] data) {
        double[][] updatedData = new double[10][3]; // [][0]: Old Salary, [][1]: Bonus, [][2]: New Salary

        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            double yearsOfService = data[i][1];
            double bonus = (yearsOfService > 5) ? (0.05 * salary) : (0.02 * salary);
            double newSalary = salary + bonus;

            updatedData[i][0] = salary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = newSalary;
        }
        return updatedData;
    }

    // Method to calculate and display the total bonus, old salary sum, and new salary sum
    public static void displaySummary(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-5s %-15s %-15s %-15s %-15s%n", "ID", "Old Salary", "Years of Service", "Bonus", "New Salary");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            double oldSalary = updatedData[i][0];
            double bonus = updatedData[i][1];
            double newSalary = updatedData[i][2];
            double yearsOfService = oldSalary == newSalary - bonus ? 5 : 10;

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%-5d %-15.2f %-15d %-15.2f %-15.2f%n", (i + 1), oldSalary, yearsOfService, bonus, newSalary);
        }

        System.out.println("----------------------------------------------------------------------");
        System.out.printf("Total %-15.2f %-15s %-15.2f %-15.2f%n", totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        // Step 1: Initialize salaries and years of service
        double[][] data = initializeData();

        // Step 2: Calculate bonus and new salaries
        double[][] updatedData = calculateBonusAndNewSalary(data);

        // Step 3: Display summary in tabular format
        displaySummary(updatedData);
    }
}
