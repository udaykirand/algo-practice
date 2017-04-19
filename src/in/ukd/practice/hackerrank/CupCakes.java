package in.ukd.practice.hackerrank;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by udadh on 4/18/2017.
 */
public class CupCakes {

    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] c = new Integer[n];
        long result = 0;

        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(c, Collections.reverseOrder());
        for(int i = 0; i < n; i++)
            result += (c[i] * Math.pow(2, i));
        System.out.println(result);

    }

    static long pow(long a, int b) {
        if (b == 0)
            return 1;
        if (b == 1)
            return a;
        if (b % 2 == 0)
            return pow(a * a, b / 2); //even a=(a^2)^b/2
        else
            return a * pow(a * a, b / 2); //odd  a=a*(a^2)^b/2

    }
}
