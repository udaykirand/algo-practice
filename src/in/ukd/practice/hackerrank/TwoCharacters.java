package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/17/2017.
 */
public class TwoCharacters {

    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String ip = sc.next();
        solve(ip);
    }

    private static void solve(String ip) {
        String modified;
        for (char c : ip.toCharArray()) {
            modified = removeChars(ip, c);
            validated(modified);
        }
    }

    private static void validated(String modified) {
        boolean[] isItThere = new boolean[Character.MAX_VALUE];
        for (int i = 0; i < modified.length(); i++) {
            isItThere[modified.charAt(i)] = true;
        }

        int count = 0;
        for (int i = 0; i < isItThere.length; i++) {
            if (isItThere[i]) {
                count++;
            }
        }
        if (count == 2) {
            for (int i = 1; i < modified.length(); i++) {
                if(modified.charAt(i-1) != modified.charAt(i)) {

                }
            }
        }
    }

    private static String removeChars(String ip, char c) {
        StringBuilder sb = new StringBuilder();

        for (char b : ip.toCharArray()) {
            if (b != c) {
                sb.append(b);
            }
        }

        return sb.toString();
    }
}
