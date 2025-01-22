import java.util.Scanner;
class km_to_mile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in kilometer");
		double num1 = sc.nextInt();
		
		System.out.println("Distance in miles is "+ num1*0.621371);
		
	}
}