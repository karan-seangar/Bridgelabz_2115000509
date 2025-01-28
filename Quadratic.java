import java.util.Scanner;
class Quadratic {
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[]{}; // No real roots
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coefficients a, b, and c of the quadratic equation (ax^2 + bx + c):");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.printf("The roots of the equation are: %.2f and %.2f%n", roots[0], roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("The root of the equation is: %.2f%n", roots[0]);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}

