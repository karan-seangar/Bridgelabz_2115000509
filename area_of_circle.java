import java.util.Scanner;
class area_of_circle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		double num1 = sc.nextInt();
		
		System.out.println("Area of the circle is "+ 3.14*num1*num1);
		
	}
}