import java.util.Scanner;
class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number (number1): ");
        int number1 = input.nextInt();
        
        System.out.print("Enter the second number (number2): ");
        int number2 = input.nextInt();
        
        // Swapping numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;
        
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}