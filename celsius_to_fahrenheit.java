import java.util.Scanner;
class celsius_to_fahrenheit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in celsius");
		double num1 = sc.nextInt();
		
		System.out.println("Temperature in Fahrenheit is "+((num1*9)/5)+32);
		
	}
}