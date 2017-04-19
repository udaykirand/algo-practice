package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/19/2017.
 */
public class SavePrisoner {

    public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n, m, s;
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            m = sc.nextInt();
            s = sc.nextInt();
            if (n >= m)
                System.out.println(s + m - 1);
            else {
                int val = (m - (n - s + 1)) % n;
                if (val == 0)
                    System.out.println(n);
                else
                    System.out.println(val);
            }

        }
    }
}
