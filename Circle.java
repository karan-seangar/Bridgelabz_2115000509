class Circle {
    int radius;
    Circle(int radius){
	this.radius = radius;
    }
    
    void area(){
	double area = 3.14 * Math.pow(radius,2);
	System.out.println("The area is: " + area);
    }

    void circumference(){
	double circumference = 2 * 3.14 * radius;
	System.out.println("The circumference is: " + circumference);
    }

    public static void main(String[] args){
	Circle c1 = new Circle(25);
	c1.area();
	c1.circumference();
    }

}
