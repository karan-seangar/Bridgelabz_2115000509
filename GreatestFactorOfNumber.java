import java.util.Scanner;

public class GreatestFactorOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int greatestFactor = 1;

        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("The greatest factor of " + number + " is: " + greatestFactor);
    }
}