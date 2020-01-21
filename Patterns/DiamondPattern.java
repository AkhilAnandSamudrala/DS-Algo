/* Statement: Print hollow diamond pattern using '*'. See examples for more details.


Input Format: First line of input contains T - number of test cases. Its followed by T lines,
each line contains a single integer N - the size of the diamond.

Constraints:
1 <= T <= 100
3 <= N <= 201

Output Format:
For each test case, print the test case number as shown, followed by the diamond pattern, separated by newline.


*/

import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {
        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        int[] diamondArr = new int[t];
        for (int i = 0; i < t; i++) {
            diamondArr[i] = scanner.nextInt();
        }
        int caseCount = 1;
        for (int diamond : diamondArr) {
            //System.out.println("Case #" + caseCount + ":");
            printDiamond(diamond);
            caseCount++;
        }
    }

    private static void printDiamond(int diamondSize) {

        int topSize = (diamondSize + 1) / 2;
        int bottomSize = diamondSize - topSize;

        for (int i = topSize; i >= 1; i--) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            int ir = (topSize + 1) - i;
            int midSpace = (ir - 1) * 2 - 1;

            if (midSpace > 0) {
                for (int s = midSpace; s > 0; s--) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= bottomSize; i++) {

            for (int s = i; s > 0; s--) {
                System.out.print(" ");
            }
            System.out.print("*");

            int ir = bottomSize - i;
            int midSpace = ir * 2 - 1;

            if (midSpace > 0) {
                for (int s = midSpace; s > 0; s--) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

