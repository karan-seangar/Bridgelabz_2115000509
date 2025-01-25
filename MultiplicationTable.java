import java.util.Scanner;
class MultiplicationTable{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int number = sc.nextInt();
	int[] arr = new int[10];
	for(int i=0;i<10;i++){
	    arr[i] = number*(i+1);
	}
	for(int i=0;i<10;i++){
	    System.out.println(number + " * " + (i+1) + " = " + arr[i]);
	}
    }
}
