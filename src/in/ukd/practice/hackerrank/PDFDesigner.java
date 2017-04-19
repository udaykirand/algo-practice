package in.ukd.practice.hackerrank;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by udadh on 4/18/2017.
 */
public class PDFDesigner {

    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);

        int[] heights = new int[26];
        for (int i = 0; i < 26; i++) {
            heights[i] = sc.nextInt();
        }
        char[] ip = sc.next().toCharArray();
        char[] alphabets = new char[26];
        int k = 0;
        for (int i = 0; i < 26; i++) {
            alphabets[i] = (char) (97 + (k++));
        }
        int maxH = Integer.MIN_VALUE;
        for (int i = 0; i < ip.length; i++) {
            int index = Arrays.binarySearch(alphabets, ip[i]);
            //System.out.println(index);
            //System.out.println(heights[index]);
            if (maxH < heights[index]) {
                //System.out.println(ip[i]);
                maxH = heights[index];
            }
        }
        //System.out.println(maxH);
        System.out.println(ip.length * maxH);
    }
}
