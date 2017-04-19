package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/17/2017.
 */
public class JumpClouds {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        int i = 0;
        int steps = 0;
        while (i < n - 1) {
            if ((i + 2) <= (n - 1) && c[i + 2] != 1) {
                i = i + 2;
                steps++;
            }
            else {
                i = i + 1;
                steps++;
            }
        }
        System.out.println(steps);
    }
}
