import java.util.Scanner;

public class CountDigitInNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        int temp = number;

        while (temp > 0) {
            temp /= 10;
            count++;
        }

        System.out.println("The number of digit in " + number + " is " + count);
    }
}