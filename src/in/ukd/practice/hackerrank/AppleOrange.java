package in.ukd.practice.hackerrank;

/**
 * Created by udadh on 4/14/2017.
 */

import java.util.Scanner;

public class AppleOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int aCnt = 0;
        int oCnt = 0;
        int tmp;
        int dist;
        for(int apple_i=0; apple_i < m; apple_i++){
            tmp = in.nextInt();
            dist = a+tmp;
            if(dist >= s && dist <= t) {
                aCnt++;
            }
        }
        for(int orange_i=0; orange_i < n; orange_i++){
            tmp = in.nextInt();
            dist = b+tmp;
            if(dist >= s && dist <= t) {
                oCnt++;
            }
        }
        System.out.println(aCnt);
        System.out.println(oCnt);
    }
}

