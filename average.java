import java.util.Scanner;
class average{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		double num1 = sc.nextInt();
		System.out.println("Enter number 2");
		double num2 = sc.nextInt();
		System.out.println("Enter number 3");
		double num3 = sc.nextInt();
		System.out.println("Simple interest is "+ (num1+num2+num3)/3);
		
	}
}