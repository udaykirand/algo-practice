package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/17/2017.
 */
public class HurdleRace {

    public static void main(String[] s) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        int maxH = height[0];
        for (int height_i = 0; height_i < n; height_i++) {
            height[height_i] = in.nextInt();
            if(maxH < height[height_i])
                maxH = height[height_i];
        }
        if(k >= maxH)
            System.out.println(0);
        else
            System.out.println(maxH - k);

    }
}
