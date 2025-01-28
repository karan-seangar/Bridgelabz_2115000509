import java.util.Scanner;
class DivideChocolates{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Chocolates");
        int number1 = sc.nextInt();
        System.out.println("Enter number of children");
        int number2 = sc.nextInt();
        int[] result = findRemainderAndQuotient(number1, number2);
        System.out.println("Remaining chocolates are " + result[0] );
        System.out.println("Each child get " + result[1] + " chocolates" );

    }

    public static  int[] findRemainderAndQuotient(int num1, int num2){
        int remainder = num1 % num2;
        int quotient = num1 / num2;
        return new int[] {remainder, quotient};

    }
}
