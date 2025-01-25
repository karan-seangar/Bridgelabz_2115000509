import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int digitCount = 0;

        // Count the digits in the number
        while (temp != 0) {
            temp /= 10;
            digitCount++;
        }

        int[] digits = new int[digitCount];
        int[] frequency = new int[10]; // Array to store frequency of digits (0-9)

        // Extract digits and save them in the array
        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        // Calculate the frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
