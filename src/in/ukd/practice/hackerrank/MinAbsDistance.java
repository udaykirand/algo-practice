package in.ukd.practice.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by udadh on 4/17/2017.
 */
public class MinAbsDistance {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 1; i < n; i++) {
            int dist = Math.abs(a[i-1] - a[i]);
            if(dist < min)
                min = dist;
        }
        System.out.println(min);
    }
}
