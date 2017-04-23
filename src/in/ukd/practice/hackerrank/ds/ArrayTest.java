package in.ukd.practice.hackerrank.ds;

import java.util.Scanner;

/**
 * Created by udadh on 4/23/2017.
 */
public class ArrayTest {

    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for(int i = n-1; i >= 0; i--) {
            System.out.print(a[i]+" ");
        }
    }
}
