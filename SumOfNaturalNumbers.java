import java.util.Scanner;
class SumOfNaturalNumbers{

    public static int add(int num){
	if(num==0) return 0;
	return num + add(num-1);
    }

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int number = sc.nextInt();
	int result = add(number);
	int resultFormula = number*(number+1)/2;
	System.out.println(result == resultFormula);
	System.out.println("The recursive result is " + result);
	System.out.println("Result through formula is " + resultFormula);
    }
}
