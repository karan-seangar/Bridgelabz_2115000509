public class StringConcatenationPerformance {

    // Method to measure concatenation time using String
    public static long concatenateWithString(int n) {
        long startTime = System.nanoTime();
        String result = "";
        for (int i = 0; i < n; i++) {
            result += "a"; // Inefficient concatenation with String (creates new object each time)
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return time in nanoseconds
    }

    // Method to measure concatenation time using StringBuilder
    public static long concatenateWithStringBuilder(int n) {
        long startTime = System.nanoTime();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append("a"); // Efficient concatenation with StringBuilder
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return time in nanoseconds
    }

    // Method to measure concatenation time using StringBuffer
    public static long concatenateWithStringBuffer(int n) {
        long startTime = System.nanoTime();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < n; i++) {
            result.append("a"); // Efficient concatenation with StringBuffer (thread-safe)
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return time in nanoseconds
    }

    // Method to compare concatenation performance for different methods
    public static void compareConcatenationPerformance(int n) {
        System.out.println("Concatenating " + n + " strings:");

        // Measure String concatenation time
        long stringTime = concatenateWithString(n);
        System.out.println("String concatenation took: " + stringTime / 1000000.0 + " ms");

        // Measure StringBuilder concatenation time
        long stringBuilderTime = concatenateWithStringBuilder(n);
        System.out.println("StringBuilder concatenation took: " + stringBuilderTime / 1000000.0 + " ms");

        // Measure StringBuffer concatenation time
        long stringBufferTime = concatenateWithStringBuffer(n);
        System.out.println("StringBuffer concatenation took: " + stringBufferTime / 1000000.0 + " ms");
    }

    public static void main(String[] args) {
        // Test with different operation counts (1,000, 10,000, 1,000,000)
        int[] counts = {1000, 10000, 1000000};

        for (int count : counts) {
            compareConcatenationPerformance(count);
        }
    }
}
