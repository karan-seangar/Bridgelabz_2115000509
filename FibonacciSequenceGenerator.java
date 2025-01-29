import java.util.Scanner;
class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        
        printFibonacciSequence(terms);

        scanner.close();
    }

    public static void printFibonacciSequence(int terms) {
        int a = 0, b = 1;
        
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        System.out.println();
    }
}
