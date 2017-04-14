package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/14/2017.
 */
public class Kangaroo {
    public static void main(String[] s) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        boolean res = false;
        if (v1 > v2) {
            if ((x2 - x1) % (v1 - v2) == 0)
                res = true;
        }
        System.out.println(res ? "YES" : "NO");
    }
}
