import java.util.Scanner;
class MaxHandshakes{
    public static void main(String[] args){
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the number");
	int numberOfPeople = sc.nextInt();
	System.out.println(maxHandshakes(numberOfPeople));
    }
   
    public static int maxHandshakes(int n){
	return (n*(n-1))/2;
    }
}
