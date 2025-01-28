import java.util.Scanner;
class SmallestAndLargest{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number 1");
	int number1 = sc.nextInt();
	System.out.println("Enter number 2");
	int number2 = sc.nextInt();
	System.out.println("Enter number 3");
	int number3 = sc.nextInt();
	int[] result = findSmallestAndLargest(number1, number2, number3);
	System.out.println("The smallest number is " + result[0] );
	 System.out.println("The largest number is " + result[1] );

    }
    
    public static  int[] findSmallestAndLargest(int num1, int num2,int num3){
	int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));
        return new int[] {smallest, largest}; 

    }
}
