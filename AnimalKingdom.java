class Animal{
    private String name;
    private int age;
    
    Animal(String name,int age){
	this.name = name;
	this.age = age;
    }
    public String getName(){
	return name;
    }

    void makeSound(){
	System.out.println("some sounds");
    }
}

class Dog extends Animal{
    Dog(String name,int age){
	super(name,age);
    }

    void makeSound(){
	System.out.println(getName() + " Barks");
    }
}

class Cat extends Animal{
    Cat(String name,int age){
	super(name,age);
    }

    void makeSound(){
	System.out.println(getName() + " says meow");
    }
}

class Bird extends Animal{
    Bird(String name,int age){
	super(name,age);
    }

    void makeSound(){
	System.out.println(getName() + " chirp");
    } 
}


public class AnimalKingdom{

    public static void main(String[] args){
	Animal dog = new Dog("max",4);
	Animal cat = new Cat("Tom",3);
	Animal bird = new Bird("cherry",1);

	dog.makeSound();
	cat.makeSound();
	bird.makeSound();
    }
}
