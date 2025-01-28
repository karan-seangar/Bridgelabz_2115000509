import java.util.Scanner;
class FindSum{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int number = sc.nextInt();
	System.out.println("The sum of first " + number + " numbers is " + sum(number));

    }
    
    public static int sum(int n){
	int result = 0;
	for(int i=1;i<=n;i++){
	    result += i;
	}
	return result;
    }
}
