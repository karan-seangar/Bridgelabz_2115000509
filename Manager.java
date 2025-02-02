public class Manager extends Employee {

    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager manager = new Manager("M123", "Sales", 80000.0);
        manager.displayInfo();
        manager.modifySalary(85000.0);
        System.out.println("Updated Salary: " + manager.getSalary());
    }
}


