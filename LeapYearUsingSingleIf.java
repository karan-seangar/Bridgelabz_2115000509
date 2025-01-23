import java.util.Scanner;

public class LeapYearUsingSingleIf{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		if(year >= 1582 && (year % 100 == 0 && year % 400 == 0) && year % 4 == 0){
			System.out.printf("%d is a Leap Year.", year);
		}
		else{
			System.out.printf("%d is not a Leap Year.");
		}
	}
}
