import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        double years = input.nextInt();
        if(years > 5){
            double bonus = salary * 0.05;
            System.out.printf("The bonus amount is %.2f", bonus);
        }
        else{
            System.out.printf("The employee is not eligible for the bonus");
        }
    }
}
