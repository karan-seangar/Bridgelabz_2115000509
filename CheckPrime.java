import java.util.Scanner;

public class CheckPrime{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean isPrime = true;
        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.printf("%d is a Prime Number.", number);
        }
        else{
            System.out.printf("%d is not a Prime Number.", number);
        }
    }
}