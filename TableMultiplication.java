import java.util.Scanner;

public class TableMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i = 6; i <= 9; i++){
            System.out.printf("%d * %d = %d\n", number, i, number * i);
        }
        
    }
}