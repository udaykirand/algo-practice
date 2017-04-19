package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/18/2017.
 */
public class NewClouldJump {

    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] c = new int[n];
        int e = 100;
        for(int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i = i+k) {
            e = e - 1;
            if(c[i] == 1){
                e = e - 2;
            }
        }
        System.out.println(e);
    }
}
