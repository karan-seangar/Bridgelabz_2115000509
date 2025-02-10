abstract class Employee{
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    public void displayDetails(){
        System.out.println("Employee Details : ");
        System.out.println("Employee Id : " + employeeId);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Base Salary : " + baseSalary);
    }
}

interface Department{

    void assignDepartment();

    void getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department{
    private String departmentName;
    private int workingHours;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, String departmentName, int workingHours){
        super(employeeId, name, baseSalary);
        this.departmentName = departmentName;
        this.workingHours = workingHours;
    }

    public int getWorkingHours(){
        return workingHours;
    }

    public void setWorkingHours(int workingHours){
        this.workingHours = workingHours;
    }

    @Override
    public void assignDepartment(){
        System.out.println("Department assigned to Full Time Employee");
    }

    @Override
    public void getDepartmentDetails(){
        System.out.println("Employee Department Name : " + departmentName);
    }

    @Override
    public double calculateSalary(){
        return getBaseSalary() + (workingHours * 100);
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Full Time Employee Salary : " + calculateSalary());
    }
}

class PartTimeEmployee extends Employee implements Department{
    private String departmentName;
    private int workingHours;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, String departmentName, int workingHours){
        super(employeeId, name, baseSalary);
        this.departmentName = departmentName;
        this.workingHours = workingHours;
    }

    public int getWorkingHours(){
        return workingHours;
    }

    public void setWorkingHours(int workingHours){
        this.workingHours = workingHours;
    }

    @Override
    public void assignDepartment(){
        System.out.println("Department assigned to Part Time Employee");
    }

    @Override
    public void getDepartmentDetails(){
        System.out.println("Department Name : " + departmentName);
    }

    @Override
    public double calculateSalary(){
        return getBaseSalary() + (workingHours * 50);
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Part Time Employee Salary : " + calculateSalary());
    }
}

public class EmployeeManagementSystem{
    public static void main(String []args){
        Employee employee1 = new FullTimeEmployee(101, "Amit", 50000, "Development", 70);
        employee1.displayDetails();
        ((FullTimeEmployee) employee1).getDepartmentDetails();

        System.out.println();

        Employee employee2 = new PartTimeEmployee(102, "Arun", 20000, "Testing", 60);
        employee2.displayDetails();
        ((PartTimeEmployee) employee2).getDepartmentDetails();

    }
}
