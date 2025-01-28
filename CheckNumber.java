import java.util.Scanner;
class CheckNumber{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int number = sc.nextInt();
	System.out.println(checkNumber(number));
    }

    public static int checkNumber(int n){
	if(n==0) return 0;
	else if(n>0) return 1;
	else return -1;
    }
}
