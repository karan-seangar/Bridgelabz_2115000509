import java.util.*;
class RandomNumberStatistics {

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int) (Math.random() * 9000); // Generate 4-digit random number
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of 4-digit random numbers to generate: ");
        int size = sc.nextInt();

        int[] randomNumbers = generate4DigitRandomArray(size);
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

        double[] stats = findAverageMinMax(randomNumbers);
        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f%n", stats[0], stats[1], stats[2]);

    }
}

