import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int temp = number;
        int length = 0;
        int sum = 0;

         while (temp > 0) {
            length++;
            temp /= 10;
        }

        temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } 
        else {
            System.out.println(number + " is not an Armstrong Number.");
        }
    }
}