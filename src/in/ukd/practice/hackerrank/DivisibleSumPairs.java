package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/16/2017.
 */
public class DivisibleSumPairs {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int res = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((a[i] + a[j]) % k == 0) {
                    //System.out.println(a[i]+" "+a[j]);
                    res++;
                }
            }
        }
        System.out.println(res);

        sc.close();
    }
}
