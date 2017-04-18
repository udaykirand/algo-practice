package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/17/2017.
 */
public class ViralAd {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int begin = 5;
        int res = 0;
        for(int i = 0; i < n; i++) {
            int day = begin / 2;
            int received = day * 3;
            res += day;
            begin = received;
        }
        System.out.println(res);
    }
}
