package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/17/2017.
 */
public class EqualizeArray {
    public static void main(String[] s) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] freq = new int[100];

        int highestFreq = 0;
        for(int i = 0; i < n; i++){
            int value = in.nextInt();
            value -= 1;

            freq[value]++;
            if(freq[value] > highestFreq){
                highestFreq = freq[value];
            }
        }

        System.out.println(n - highestFreq);
    }
}
