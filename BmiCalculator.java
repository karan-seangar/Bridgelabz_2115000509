import java.util.Scanner;

public class BmiCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float weight = input.nextFloat();
        float height = input.nextFloat();
        float bmi = weight / (height * height);
        if(bmi < 18.5){
            System.out.println("Underweight");
        }
        else if(bmi >= 18.5 && bmi < 25){
            System.out.println("Normal");
        }
        else if(bmi >= 25 && bmi < 30){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
}