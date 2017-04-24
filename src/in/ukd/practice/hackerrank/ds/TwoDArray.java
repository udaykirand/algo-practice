package in.ukd.practice.hackerrank.ds;

import java.util.Scanner;

/**
 * Created by udadh on 4/24/2017.
 */
public class TwoDArray {

    public static void main(String[] s) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sum[] = new int[16];
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int arr_i = 0; arr_i < 6; arr_i++) {
            for (int arr_j = 0; arr_j < 6; arr_j++) {
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                int tmp = 0;
                int t1 = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                int t2 = arr[i + 1][j + 1];
                int t3 = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                tmp = t1 + t2 + t3;
                if(tmp > max)
                    max = tmp;
                sum[count] = tmp;
                count++;
            }
        }

        System.out.println(max);

    }
}
