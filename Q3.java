/*
The problem requires us to write a program that reads an integer T, the number of test cases. For each test case, read an integer H (Height) and a character S (Style).
Based on the style S, print the corresponding pattern of height H:
Style 'A' (Angled): Print H rows. Row i (from 1 to H) must contain the digit i repeated i times.
Example (H=3):
1
22
333
Style 'P' (Pyramid): Print H rows. Row i must be a centered, palindromic number sequence counting from 1 up to i and back down to 1.
Example (H=3):
     1
   1 2 1
1 2 3 2 1

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
        
        System.out.println("Please input the height of the pattern and the style (A or P) separated by spaces: ");

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
            System.out.println();
        }
    }

}
