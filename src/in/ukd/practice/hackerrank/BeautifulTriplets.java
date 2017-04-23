package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/19/2017.
 */
public class BeautifulTriplets {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] a = new int[n];
        int k = 0;
        int c = 0;
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n-1; i++) {
            k = 0;
            int b = i;
            for(int j = b + 1; j < n; j++) {
                if(a[j] - a[b] == b) {
                    b = j;
                    k++;
                    if(k == 2)
                        break;
                }
                if(k == 2)
                    c++;
            }

        }
        System.out.println(c);
    }
}
