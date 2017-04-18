package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/18/2017.
 */
public class HackerRankString {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String given = "hackerrank";
        String ip = "";
        for (int i = 0; i < n; i++) {
            ip = sc.next();
            checkStr(ip, given);
        }

    }

    private static void checkStr(String ip, String given) {
        int i = 0;
        int j = 0;
        while (i < ip.length() && j < given.length()) {
            if(given.charAt(j) == ip.charAt(i++)) {
                j++;
            }
        }
        System.out.println(j == 10 ? "YES" : "NO");
    }
}
