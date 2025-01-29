import java.util.Scanner;
class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = getInput(scanner);
        long result = calculateFactorial(number);
        displayResult(result);

        scanner.close();
    }

    public static int getInput(Scanner scanner) {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    public static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }

    public static void displayResult(long result) {
        System.out.println("The factorial is: " + result);
    }
}
