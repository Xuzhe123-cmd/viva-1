import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int q;

        System.out.println("Please enter the number of inquiries:");
        q = input.nextInt();

        for (int i = 1; i <= q; i++) {
            int a, b, n;
            System.out.printf(
                    "Please enther the %d quiries in the format: [Initial Value] [Multiplier Seed] [Charm Length]\n",
                    i);
            a = input.nextInt();
            b = input.nextInt();
            n = input.nextInt();

            int ans;

            for (int j = 1; j <= n; j++) {
                ans = (int) (a + (b * (Math.pow(2, j - 1))));
                System.out.print(ans + " ");
            }
            System.out.println();
        }
        input.close();
    }
}

