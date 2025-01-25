import java.util.Scanner;
class PlayWithNumbers{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[5];
	for(int i=0;i<5;i++){
	    System.out.println("Enter " + (i+1) + " number");
	    arr[i] = sc.nextInt();
	}
	for(int i=0;i<5;i++){
	    if(arr[i] == 0){ System.out.println("Zero"); }
	    else if(arr[i] < 0){System.out.println("Negative");}
	    else{
		if(arr[i]%2 == 0){
		    System.out.println("positive even number");
		}
		else{
		    System.out.println("positive odd number");
		}
 	    }
	}
	//comparing first and last number
	if(arr[0]>arr[4]){
	    System.out.println("first number is greater than last number");
	}
	else if(arr[0]<arr[4]){
	     System.out.println("first number is smaller than last number");

	}
	else{
	     System.out.println("first number is equal to last number");
	}

    }
}
