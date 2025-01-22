import java.util.Scanner;
class volume_of_cylinder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		double num1 = sc.nextInt();
		System.out.println("Enter height");
		double num2 = sc.nextInt();
		System.out.println("volume of cylinder is "+ 3.14*(Math.pow(num1,2))*num2);
		
	}
}