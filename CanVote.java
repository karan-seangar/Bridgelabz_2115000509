import java.util.Scanner;
class CanVote{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[10];
	
	for(int i=0;i<10;i++){
	    System.out.println("Enter " + (i+1) + " person's age");
	    arr[i] = sc.nextInt();
	}
	for(int i=0;i<10;i++){
	    if(arr[i]<0){
		System.out.println("Invalid age");
	    }
	    else if(arr[i]>=18){
		System.out.println("The Student with age " + arr[i] + " can vote");
	    }
	    else{
		 System.out.println("The Student with age " + arr[i] + " cannot vote");

	    }
	}
    }
}
