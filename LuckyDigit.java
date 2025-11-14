import java.util.Scanner;

public class LuckyDigit {

    public static void main(String[] args) {
        // Setup object import
        Scanner sc = new Scanner(System.in);
        // Receive the new inputs through an integer q
        int q = sc.nextInt();

        // Create two arrays to store the analyzeDigit and LuckyDigit values
        int[] analyzeDigit = new int[q];
        int[] LuckyDigit = new int[q];

        // Loop to store the inputs in the respective arrays
        for (int i = 0; i < q; i++) {
            analyzeDigit[i] = sc.nextInt(); // Input for analyzeDigit
            LuckyDigit[i] = sc.nextInt(); // Input for LuckyDigit
        }
        // Loop to analyze each digit in the analyzeDigit array
        for (int i = 0; i < q; i++) {
            // Initialize counters for Lucky, Zero, Even, and Odd digits
            int LuckyCount = 0;
            int ZeroCount = 0;
            int EvenCount = 0;
            int OddCount = 0;
            int Digit;
            int num = analyzeDigit[i];
            int LuckyDigitValue = LuckyDigit[i];

            // Analyze each digit of the current analyzeDigit number
            while (num > 0) {
                // Extract the last digit through modulus operation
                Digit = num % 10; // Get the last digit
                // Check and increment the respective counters based on the digit value
                if (Digit == LuckyDigitValue) {
                    LuckyCount++;
                } else if (Digit == 0) {
                    ZeroCount++;
                } else if (Digit % 2 == 0) {
                    EvenCount++;
                } else {
                    OddCount++;
                }
                num = num / 10;

            }

            // Determine and print the classification based on the counts
            if (OddCount > EvenCount && OddCount > LuckyCount && OddCount > ZeroCount) {
                System.out.println("ENERGETIC");
            } else if (EvenCount > LuckyCount && EvenCount > ZeroCount) {
                System.out.println("BALANCED");
            } else if (LuckyCount > ZeroCount) {
                System.out.println("LUCKY");
            } else {
                System.out.println("NEUTRAL");
            }

        }

    }
}
