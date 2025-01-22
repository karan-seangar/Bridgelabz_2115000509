import java.util.Scanner;
class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();
        
        double fahrenheitResult = (celsius * 9 / 5) + 32;
        
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
    }
}
