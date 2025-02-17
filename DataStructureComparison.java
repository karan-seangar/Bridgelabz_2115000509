import java.util.*;

public class DataStructureComparison {

    // Method to generate a random array of a given size
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000); // Random number up to 100,000
        }
        return arr;
    }

    // Linear Search for Array (O(N))
    public static boolean arraySearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    // HashSet Search (O(1) on average)
    public static boolean hashSetSearch(HashSet<Integer> set, int target) {
        return set.contains(target);
    }

    // TreeSet Search (O(log N))
    public static boolean treeSetSearch(TreeSet<Integer> set, int target) {
        return set.contains(target);
    }

    // Method to measure search time for different data structures
    public static void measureSearchTime(int[] array, HashSet<Integer> hashSet, TreeSet<Integer> treeSet, int target, String structure) {
        long startTime = System.nanoTime();

        boolean found = false;

        switch (structure) {
            case "Array":
                found = arraySearch(array, target);
                break;
            case "HashSet":
                found = hashSetSearch(hashSet, target);
                break;
            case "TreeSet":
                found = treeSetSearch(treeSet, target);
                break;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(structure + " search took " + duration / 1000000.0 + " ms. Found: " + found);
    }

    public static void main(String[] args) {
        // Different dataset sizes to test
        int[] sizes = {1000, 10000, 100000, 1000000};

        for (int size : sizes) {
            System.out.println("\nDataset size: " + size);

            // Generate random array and HashSet, TreeSet
            int[] array = generateRandomArray(size);
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            for (int num : array) {
                hashSet.add(num);
                treeSet.add(num);
            }

            // Search target (random element)
            int target = array[new Random().nextInt(size)];

            // Test Array Search
            measureSearchTime(array, hashSet, treeSet, target, "Array");

            // Test HashSet Search
            measureSearchTime(array, hashSet, treeSet, target, "HashSet");

            // Test TreeSet Search
            measureSearchTime(array, hashSet, treeSet, target, "TreeSet");
        }
    }
}
