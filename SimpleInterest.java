import java.util.Scanner;
class SimpleInterest{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the principal");
	double principal = sc.nextInt();
	System.out.println("Enter the rate");
	double rate = sc.nextInt();
	System.out.println("Enter the time");
	double time = sc.nextInt();
	double result = simpleInterest(principal, rate, time);
	System.out.println("The simple Interest is " + result + " for principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
    
    public static double simpleInterest(double principal, double rate, double time){
	return principal*rate*time/100;
    }
}
