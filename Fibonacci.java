public class Fibonacci {
    public static int recursiveFibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }

    public static void iterativeFibonacci(){
        int n = 10;
        int a = 0, b = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(a + ", ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    } 
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        recursiveFibonacci(10);
        long endTime = System.currentTimeMillis();
        System.out.println("Recursive approach time: " + (endTime-startTime));

        startTime = System.currentTimeMillis();
        iterativeFibonacci();
        endTime = System.currentTimeMillis();
        System.out.println("\nIterative approach time: " + (endTime-startTime));
    }
}





