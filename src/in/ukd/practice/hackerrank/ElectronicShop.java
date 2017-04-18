package in.ukd.practice.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by udadh on 4/18/2017.
 */
public class ElectronicShop {

    public static void main(String[] str) {
        Scanner sc = new Scanner((System.in));
        int s = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        Integer[] k = new Integer[m];
        int[] u = new int[n];
        for (int i = 0; i < m; i++) {
            k[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            u[i] = sc.nextInt();
        }
        int moneySpent = getMoneySpent(k, u, s);
        System.out.println(moneySpent);
    }

    private static int getMoneySpent(Integer[] k, int[] u, int s) {
        int res = 0;
        Arrays.sort(k, Collections.reverseOrder());
        Arrays.sort(u);
        for(int i = 0; i < k.length; i++) {
            for(int j = 0; j < u.length; j++) {
                int tmp = k[i] + u[j];
                if(tmp > res && tmp <= s)
                    res = tmp;
            }
        }
        return res == 0 ? -1 : res;
    }
}
