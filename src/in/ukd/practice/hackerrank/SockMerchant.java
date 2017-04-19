package in.ukd.practice.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by udadh on 4/17/2017.
 */
public class SockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        Arrays.sort(c);
        int cnt = 0;
        for(int i=1; i < n; i++){
            if(c[i] == c[i-1]) {
                i++;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
