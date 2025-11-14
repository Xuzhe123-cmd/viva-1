
import java.util.Scanner;

public class LuckyDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] analyzeDigit = new int[q];
        int[] LuckyDigit = new int[q];

        for (int i = 0; i < q; i++) {
            analyzeDigit[i] = sc.nextInt();
            LuckyDigit[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int LuckyCount = 0;
            int ZeroCount = 0;
            int EvenCount = 0;
            int OddCount = 0;
            int Digit;
            int num = analyzeDigit[i];
            int LuckyDigitValue = LuckyDigit[i];

            while (num > 0) {
                Digit = num % 10;
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

            if (OddCount > EvenCount && OddCount > LuckyCount && OddCount > ZeroCount) {
                System.out.println("Energetic");
            } else if (EvenCount > OddCount && EvenCount > LuckyCount && EvenCount > ZeroCount) {
                System.out.println("Balanced");
            } else if (LuckyCount > OddCount && LuckyCount > EvenCount && LuckyCount > ZeroCount) {
                System.out.println("Lucky");
            } else {
                System.out.println("Neutral");
            }

        }

    }
}
