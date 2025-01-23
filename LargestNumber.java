import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        if(number1 > number2 && number1 > number3){
            System.out.printf("First number is largeest among three numbers.");
        }
        else if(number2 > number1 && number2 > number3){
            System.out.printf("Second number is largeest among three numbers.");
        }
        else{
            System.out.printf("Third number is largeest among three numbers.");
        }
    }
}