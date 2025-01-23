import java.util.Scanner;

public class IsNumberPosisiveNegativeZero {
	public static void main(String[] args) {
		Scanner input = new Scannner(System.in);
		int number = input.nextInt();
		if(number < 0){
			System.out.println("Number is Negative.");
		}
		else if(number > 0){
			System.out.println("Number is Positive");
		}
		else{
			System.out.println("Number is Zero");	
		}
	}
}
