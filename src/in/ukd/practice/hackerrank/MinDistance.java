package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/17/2017.
 */
public class MinDistance {

    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    found = true;
                    int dist = Math.abs(i - j);
                    if (dist < min)
                        min = dist;
                }
            }
        }
        System.out.println(found ? min : -1);
    }
}
