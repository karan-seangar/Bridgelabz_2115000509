import java.util.Scanner;
class simple_interest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal amount");
		double num1 = sc.nextInt();
		System.out.println("Enter Rate");
		double num2 = sc.nextInt();
		System.out.println("Enter Time");
		double num3 = sc.nextInt();
		System.out.println("Simple interest is "+ (num1*num2*num3)/100);
		
	}
}