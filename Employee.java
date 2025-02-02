public class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void modifySalary(double newSalary) {
        salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }
}

