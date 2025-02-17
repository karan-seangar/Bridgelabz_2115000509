import java.util.Random;

public class SortingComparison {

    // Bubble Sort implementation
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort implementation
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    // Merge function used in Merge Sort
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    // Quick Sort implementation
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition function used in Quick Sort
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Method to generate random arrays of a given size
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(1000000000); // Random number up to 100,000
        }
        return arr;
    }

    // Method to measure sorting time for different algorithms
    public static void measureSortTime(int[] arr, String algorithm) {
        long startTime = System.currentTimeMillis();

        switch (algorithm) {
            case "BubbleSort":
                bubbleSort(arr);
                break;
            case "MergeSort":
                mergeSort(arr);
                break;
            case "QuickSort":
                quickSort(arr, 0, arr.length - 1);
                break;
        }

        long endTime = System.currentTimeMillis();
        System.out.println(algorithm + " took " + (endTime - startTime) + " ms.");
    }

    public static void main(String[] args) {
        // Different dataset sizes to test
        int[] sizes = {1000, 10000, 100000};

        for (int size : sizes) {
            System.out.println("\nDataset size: " + size);

            // Generate random array for each sorting test
            int[] bubbleArray = generateRandomArray(size);
            int[] mergeArray = bubbleArray.clone(); // Clone to ensure same data
            int[] quickArray = bubbleArray.clone(); // Clone to ensure same data

            // Test Bubble Sort
            measureSortTime(bubbleArray, "BubbleSort");

            // Test Merge Sort
            measureSortTime(mergeArray, "MergeSort");

            // Test Quick Sort
            measureSortTime(quickArray, "QuickSort");
        }
    }
}
