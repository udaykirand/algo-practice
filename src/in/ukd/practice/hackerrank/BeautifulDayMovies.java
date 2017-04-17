package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/17/2017.
 */
public class BeautifulDayMovies {
    public static void main(String[] s) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();
        scan.close();

        int count = 0;

        for (int num = i; num <= j; num++) {
            int reversedNum = 0;
            int ipTmp = num;
            while (ipTmp != 0) {
                reversedNum = reversedNum * 10 + ipTmp % 10;
                ipTmp = ipTmp / 10;
            }
            if (Math.abs(num - reversedNum) % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
