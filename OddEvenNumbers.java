import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number > 0){
            for(int i = 1; i <= number; i++){
                if(i % 2 == 0){
                    System.out.printf("%d is an even number\n", i);
                }
                else{
                    System.out.printf("%d is an odd number\n", i);
                }
            }
        }
        else{
            System.out.printf("The number %d is not a natural number", number);
        }
    }
}