import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100 and I'll try to guess it.");
        
        // Initialize the search range
        int lowerBound = 1;
        int upperBound = 100;
        
        while (true) {
            // Generate a random guess
            int guess = generateGuess(lowerBound, upperBound);
            System.out.println("Is your number " + guess + "?");
            
            // Get user feedback
            String feedback = getFeedback(scanner);
            
            // Determine next action based on feedback
            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Hooray! I guessed your number correctly.");
                break;
            } else if (feedback.equalsIgnoreCase("low")) {
                lowerBound = guess + 1;  // Increase the lower bound
            } else if (feedback.equalsIgnoreCase("high")) {
                upperBound = guess - 1;  // Decrease the upper bound
            } else {
                System.out.println("Invalid feedback. Please respond with 'high', 'low', or 'correct'.");
            }
        }

        scanner.close();
    }

    // Function to generate a random guess within the current range
    public static int generateGuess(int lowerBound, int upperBound) {
        Random random = new Random();
        return lowerBound + random.nextInt(upperBound - lowerBound + 1);
    }

    // Function to get feedback from the user
    public static String getFeedback(Scanner scanner) {
        System.out.print("Enter feedback (high/low/correct): ");
        return scanner.nextLine();
    }
}
