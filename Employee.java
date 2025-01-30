class Employee{
    String name;
    int id;
    int salary;

    Employee(){
	name = "Karan Seangar";
	id = 24;
	salary = 80000;
    }

    void show(){
	System.out.println(this.name);
	System.out.println(this.id);
	System.out.println(this.salary);
    }

    public static void main(String[] args){
	Employee employee1 = new Employee();
	employee1.show();
    }

}
