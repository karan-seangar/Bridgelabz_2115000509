import java.util.Scanner;

public class IsFirstNumberSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        if(number1 < number2 && number1 < number3){
            System.out.printf("First number is the smallest number.");
        }
        else{
            System.out.printf("First number is not smallest number.");
        }
    }
}