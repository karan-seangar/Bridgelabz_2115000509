import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int employeeCount = 10;

        double[] salaries = new double[employeeCount];
        double[] yearsOfService = new double[employeeCount];
        double[] bonuses = new double[employeeCount];
        double[] newSalaries = new double[employeeCount];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < employeeCount; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Years of Service: ");
            double years = sc.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--; // Repeat the iteration for valid input
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        for (int i = 0; i < employeeCount; i++) {
            double bonusPercentage = yearsOfService[i] > 5 ? 0.05 : 0.02;
            double bonus = salaries[i] * bonusPercentage;
            double newSalary = salaries[i] + bonus;

            bonuses[i] = bonus;
            newSalaries[i] = newSalary;

            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalary;
        }

        System.out.println("\nEmployee Bonus Details:");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salaries[i] + 
                               ", Bonus = " + bonuses[i] + ", New Salary = " + newSalaries[i]);
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
