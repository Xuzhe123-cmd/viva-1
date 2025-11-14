import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String word = sc.next().toLowerCase();
        System.out.print("Enter the length of substrings, k: ");
        int k = sc.nextInt();

        // Initialize with the first substring
        String firstWhisper, lastEcho, coreValue;
        firstWhisper = lastEcho = coreValue = word.substring(0, k);

        int maxAsciiSum = 0;
        for (int j = 0; j < coreValue.length(); j++) {
            maxAsciiSum += (int) coreValue.charAt(j);
        }

        for (int i = 1; i <= word.length() - k; i++) {
            String sub = word.substring(i, i + k);

            // First Whisper: lexicographically smallest
            if (sub.compareTo(firstWhisper) < 0) {
                firstWhisper = sub;
            }

            // Last Echo: lexicographically largest
            if (sub.compareTo(lastEcho) > 0) {
                lastEcho = sub;
            }

            // Core Value: max ASCII sum
            int sum = 0;
            for (int j = 0; j < sub.length(); j++) {
                sum += (int) sub.charAt(j);
            }

            if (sum > maxAsciiSum) {
                maxAsciiSum = sum;
                coreValue = sub;
            }
        }

        System.out.println("First Whisper: " + firstWhisper);
        System.out.println("Last Echo: " + lastEcho);
        System.out.println("Core Value: " + coreValue);

        sc.close();
    }
}
