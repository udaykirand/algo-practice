package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/13/2017.
 */
public class BirthdayCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int max = height[0];
        int count = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(height[height_i] > max) {
                max = height[height_i];
                count = 0;
            }
            if (max == height[height_i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
