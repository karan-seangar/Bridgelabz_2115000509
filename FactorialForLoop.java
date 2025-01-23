import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int factorial = 1;
        if(number > 0){
            for(int i = 1; i <= number; i++){
                factorial *= i;
            }
            System.out.printf("The factorial of %d is %d", number, factorial);
        }
        else{
            System.out.printf("The number %d is not a positive integer", number);
        }
    }
}

