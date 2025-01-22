import java.util.Scanner;
class power{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		double num1 = sc.nextInt();
		System.out.println("Enter power");
		double num2 = sc.nextInt();
		System.out.println("Power of "+ num1+" is "+ Math.pow(num1,num2));
		
	}
}