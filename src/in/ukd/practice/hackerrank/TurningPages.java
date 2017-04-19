package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/18/2017.
 */
public class TurningPages {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int front = p/2;
        int back = 0;
        if(n != p) {
            if(n%2 == 0) {
                back = (n - p) / 2;
            } else {
                if(p % 2 == 0) {
                    back = (n - p - 1)/2;
                } else
                    back = ((n - p - 1)/2) + 1;
            }
            System.out.println(front >= back ? back : front);
        } else {
            System.out.println(0);
        }
    }
}
