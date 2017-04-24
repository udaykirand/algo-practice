package in.ukd.practice.hackerrank.ds;

import java.util.Scanner;

/**
 * Created by udadh on 4/24/2017.
 */
public class LeftRotation {

    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for(int j = 0; j < r; j++){
            int temp = a[0];
            for(int m = 1; m < a.length; m++){
                a[m-1] = a[m];
            }
            a[a.length-1] = temp;
        }

        for(int x : a){
            System.out.print(x+" ");
        }
    }
}
