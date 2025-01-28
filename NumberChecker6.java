import java.util.*;

class NumberChecker {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); // Generates a number between 100000 and 999999
    }

    // Method to validate the uniqueness of generated OTPs
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            if (!uniqueOTPs.add(otp)) {
                return false; // Duplicate found
            }
        }
        return true; // All are unique
    }

    public static void main(String[] args) {
        int[] otps = new int[10]; // Array to store 10 OTPs

        // Generate 10 unique OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Display the OTPs
        System.out.println("Generated OTPs: " + Arrays.toString(otps));

        // Validate their uniqueness
        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}
