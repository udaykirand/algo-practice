package in.ukd.practice.hackerrank.ds;

import java.util.Scanner;

/**
 * Created by udadh on 4/24/2017.
 */
public class SparseStrings {

    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ip = new String[n];
        for (int i = 0; i < n; i++) {
            ip[i] = sc.next();
        }
        System.out.println("Loaded ip");

        int q = sc.nextInt();
        String[] qr = new String[q];
        int[] res = new int[q];
        for (int i = 0; i < q; i++) {
            qr[i] = sc.next();
        }

        for (int a = 0; a < q; a++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (ip[j].equals(qr[a]))
                    cnt++;
            }
            res[a] = cnt;
        }

        for (int k = 0; k < q; k++) {
            System.out.println(res[k]);
        }
    }
}
