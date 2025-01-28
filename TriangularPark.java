import java.util.Scanner;
class TriangularPark{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter side1");
	int side1 = sc.nextInt();
	System.out.println("Enter side2");
	int side2 = sc.nextInt();
	System.out.println("Enter side3");
	int side3 = sc.nextInt();
	System.out.println("Number of rounds remaining are " + remainingRounds(side1, side2, side3));
    }

    public static int remainingRounds(int s1, int s2, int s3){
	int perimeter = s1 + s2 + s3;
	return Math.abs(5000/perimeter);
    }
}
