import java.util.Scanner;
class RemainderAndQuotient{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2");
        int number2 = sc.nextInt();
        int[] result = findRemainderAndQuotient(number1, number2);
        System.out.println("The remainder is " + result[0] );
         System.out.println("The quotient is " + result[1] );

    }

    public static  int[] findRemainderAndQuotient(int num1, int num2){
        int remainder = num1 % num2;
        int quotient = num1 / num2;
        return new int[] {remainder, quotient};

    }
}
