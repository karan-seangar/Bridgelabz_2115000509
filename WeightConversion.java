import java.util.Scanner;
class WeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = input.nextDouble();
        
        double weightInKg = weightInPounds * 2.2;
        
        System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInKg);
    }
}
