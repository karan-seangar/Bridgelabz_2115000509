import java.util.Scanner;
class perimeter_of_rectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		double num1 = sc.nextInt();
		System.out.println("Enter width");
		double num2 = sc.nextInt();
		System.out.println("Perimeter of rectangle is "+ 2*(num1+num2));
		
	}
}