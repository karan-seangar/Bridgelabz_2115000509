import java.util.*;
class FactorProductSumAndSquareRoot{

    public static int[] factor(int number){
	int count=0;
	for(int i=1;i<=number;i++){
	    if(number%i == 0){
		count++;
	     }
	}
	int[] arr = new int[count];
	int index = 0;
	for(int i=1;i<=number;i++){
	    if(number%i==0){
		arr[index++] = i;
	    }
	}
	return arr;
    }

    public static int sum(int[] arr){
	int sum=0;
	for(int i=0;i<arr.length;i++){
	    sum += arr[i];
	}
	return sum;
    }
    
    public static int product(int[] arr){
	int product=1;
	for(int i=0;i<arr.length;i++){
	    product *= arr[i];
	}
	return product;
    }

    public static double[] squareRoot(int[] arr){
	double[] squareroot = new double[arr.length];
	for(int i=0;i<arr.length;i++){
	    squareroot[i] = Math.sqrt(arr[i]);
	} 
	return squareroot;
    }

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int number = sc.nextInt();
	int[] factors = factor(number);
	System.out.println(Arrays.toString(factors));
	System.out.println("The sum of all the factors is " + sum(factors));
	System.out.println("The product of all the factors is " + product(factors));
	System.out.println(Arrays.toString(squareRoot(factors)));
    }
}

