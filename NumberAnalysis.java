import java.util.Scanner;
public class NumberAnalysis {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int number : numbers) {
            if (isPositive(number)) {
                System.out.print(number + " is positive and ");
                if (isEven(number)) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println(number + " is negative.");
            }
        }

        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("The first and last numbers are ");
        if (comparisonResult > 0) {
            System.out.println("greater.");
        } else if (comparisonResult == 0) {
            System.out.println("equal.");
        } else {
            System.out.println("less.");
        }
        
    }
}
