import java.util.Random;
class FootballTeam {

    static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    static double findMean(int[] heights) {
        int sum = findSum(heights);
        return sum / (double) heights.length;
    }

    static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] heights = new int[11];

        for (int i = 0; i < 11; i++) {
            heights[i] = rand.nextInt(101) + 150; // generates heights between 150 and 250
        }

        System.out.println("Heights of the players: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Sum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }
}
