import java.util.Scanner;

public class FizzBuzzUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } 
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } 
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            } 
            else {
                System.out.println(i);
            }
        }
    
    }
}