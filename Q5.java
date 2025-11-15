import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int T = sc.nextInt(); // number of words
    
        System.out.println("Enter the words:");
        
        String vowels = "aeiou";
        for (int t = 0; t < T; t++) {
            String word = sc.next();
            char[] letters = word.toCharArray();
            boolean isHarmony = true;

            // Rule 1: Last letter cannot be a vowel
            // indexOf returns -1 if the character is not found
            if (vowels.indexOf(letters[letters.length - 1]) != -1) {
                isHarmony = false;
            }

            // Rule 2: No two consecutive vowels
            // Iterate through the word and check consecutive vowels
            for (int i = 0; i < letters.length - 1; i++) {
                if (vowels.indexOf(letters[i]) != -1 &&
                    vowels.indexOf(letters[i + 1]) != -1) {
                    isHarmony = false;
                    break;
                }
            }

            if (isHarmony) {
                System.out.println("Harmony");
            } else {
                System.out.println("Chaos");
            }
        }

        sc.close();
    }
}
