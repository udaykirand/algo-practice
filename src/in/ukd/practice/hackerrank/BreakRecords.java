package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/15/2017.
 */
public class BreakRecords {

    static int[] getRecord(int[] s) {
        int bestCnt = 0;
        int best = s[0];
        int worstCnt = 0;
        int worst = s[0];
        for (int i = 0; i < s.length; i++) {
            if (s[i] > best) {
                bestCnt++;
                best = s[i];
            }
            if (s[i] < worst) {
                worstCnt++;
                worst = s[i];
            }
        }
        return new int[] {bestCnt, worstCnt};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
