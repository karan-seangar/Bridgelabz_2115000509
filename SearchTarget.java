import java.util.Random;

public class SearchTarget {
    
    // Linear Search Implementation
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    // Binary Search Implementation
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        Random rand = new Random();
        
        for (int size : sizes) {
            int[] dataset = new int[size];
            for (int i = 0; i < size; i++) {
                dataset[i] = i; // Already sorted
            }
            int target = rand.nextInt(size); // Random target to search
            
            // Measure Linear Search Time
            long startTime = System.nanoTime();
            linearSearch(dataset, target);
            long endTime = System.nanoTime();
            long linearTime = endTime - startTime;
            
            // Measure Binary Search Time
            startTime = System.nanoTime();
            binarySearch(dataset, target);
            endTime = System.nanoTime();
            long binaryTime = endTime - startTime;
            
            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time: " + linearTime / 1_000_000.0 + " ms");
            System.out.println("Binary Search Time: " + binaryTime / 1_000_000.0 + " ms");
            System.out.println("--------------------------------");
        }
    }
}
