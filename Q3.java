/*
Your program must be able to generate both of Puan Norah's patterns. Based on the given
Style code, you will execute the correct logic to print the corresponding pattern for the
specified Height.
 For Style 'A' (Angled):
o This is the same as the original "Number Staircase" problem.
o For a height H, you will print H rows.
o Row i (where i is from 1 to H) contains the digit i repeated i times.
 For Style 'P' (Pyramid):
o For a height H, you will print H rows.
o Each row must be padded with leading spaces to be centered. A pyramid of
height H has a base width of (2×H)−1.
o Row i (where i is from 1 to H) will consist of:
1. A number of leading spaces.
2. Numbers ascending from 1 up to i.
3. Numbers descending from i−1 back down to 1.
 */
// package q3;

import java.util.Scanner;

/**
 *
 * @author ekitstrap
 */
public class Q3 {

    public static void main(String[] args) {
        // Setup object imports and variables
        Scanner input = new Scanner(System.in);

        // Receive the number of queries (q) first
        System.out.print("Please input the number of queries: ");
        int q = input.nextInt();

        // Repeat for every number of query
        for (int i = 0; i < q; i++) {
            int H = input.nextInt();
            char S = input.next().charAt(0);

            // Making it a character object to use the equals function
            // Check for the pattern the user wants (tip: confirmed uppercase character)
            // Angled staircase (A)
            if (S == 'A') {
                for (int j = 1; j <= H; j++) {
                    for (int k = 1; k <= j; k++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            }
            // Pyramid
            if (S == 'P') {
                // Setting the numbers
                for (int j = 1; j <= H; j++) {

                    // Setting up the spacing
                    for (int k = 0; k < (H - j); k++) {
                        System.out.print(" ");
                    }

                    // Ascending loop -> to reach the max value
                    for (int k = 1; k <= j; k++) {
                        System.out.print(k);
                    }
                    
                    // Descending loop -> to reach 1
                    for (int k = j - 1; k >= 1; k--) {
                        System.out.print(k);
                    }
                    
                    System.out.println();
                }
                
            }
        }
    }   
}
