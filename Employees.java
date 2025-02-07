class Employee{
    protected String name;
    protected int id;
    protected int salary;

    Employee(String name, int id,int salary){
	this.name = name;
	this.id = id;
	this.salary = salary;
    }
    void displayDetails(){
	System.out.println("\nEmployee details are: ");
	System.out.println("Name: " + name);
	System.out.println("ID: " + id);
	System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee{
    
    protected int teamSize;

    Manager(String name,int id,int salary,int teamSize){
	super(name,id,salary);
	this.teamSize = teamSize;
    }

    void displayDetails(){
	super.displayDetails();
        System.out.println("Team size: " + teamSize);
    }
}

class Developer extends Employee{

    protected String programmingLanguage;

    Developer(String name,int id,int salary, String programmingLanguage){
 	super(name,id,salary);
	this.programmingLanguage=programmingLanguage;
    }

    void displayDetails(){
	super.displayDetails();
	System.out.println("Programming language: " + programmingLanguage);
    }
}

class Intern extends Employee{

    protected int daysOfProgramm;
    
    Intern(String name,int id,int salary,int daysOfProgramm){
	super(name,id,salary);
	this.daysOfProgramm = daysOfProgramm;
    }

    void displayDetails(){
	super.displayDetails();
	System.out.println("Days of programm: " + daysOfProgramm);
    }
}
 

public class Employees{

    public static void main(String[] args){
	Employee employee1 = new Manager("karan seangar",31,80000,5);
	Employee employee2 = new Developer("Amit kumar",21,60000,"java");
	Employee employee3 = new Intern("Arun",18,12000,5);

	employee1.displayDetails();
	employee2.displayDetails();
	employee3.displayDetails();

    }
}
