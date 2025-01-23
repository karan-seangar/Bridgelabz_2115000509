import java.util.Scanner;

public class NaturalNumberSumUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        if(number > 0){
            int i = 1;
            while(i <= number){
                sum += i;
                i++;
            }
            int formulae = number * (number + 1) / 2;
            System.out.printf("The sum of %d natural numbers is %d\n", number, sum);
            System.out.printf("The sum of %d natural numbers using formulae is %d\n", number, formulae);
        }
        else{
            System.out.printf("The number %d is not a natural number", number);
        }
    }
}
