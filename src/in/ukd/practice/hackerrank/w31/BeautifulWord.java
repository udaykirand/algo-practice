package in.ukd.practice.hackerrank.w31;

import java.util.Scanner;

/**
 * Created by udadh on 4/15/2017.
 */
public class BeautifulWord {
    private static final String VOWELS= "aeiouy";
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next().toLowerCase();
        System.out.println(isBeautiful(w) ? "Yes" : "No");
    }

    public static boolean isBeautiful(String w) {
        for (int i = 0; i < w.length() - 1; ++i) {
            char c = w.charAt(i);
            char cN = w.charAt(i+1);
            if (c == cN) {
                return false;
            }

            if ((checkVowel(c) && checkVowel(cN))) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkVowel(char c) {
        return VOWELS.indexOf(c) >=0;
    }
}
