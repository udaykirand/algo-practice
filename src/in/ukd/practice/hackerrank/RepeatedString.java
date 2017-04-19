package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/17/2017.
 */
public class RepeatedString {

    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        String tmpS = ip;
        long length = sc.nextLong();
        int initCount = tmpS.length() - tmpS.replaceAll("a", "").length();
        int ipLength = tmpS.length();
        long rem = length % ipLength;
        if (rem == 0) {
            System.out.println(initCount * (length / ipLength));
        } else {
            String t = tmpS.substring(0, (int) rem);
            System.out.println(initCount * (length / ipLength) + t.length() - t.replaceAll("a", "").length());
        }
    }
}
