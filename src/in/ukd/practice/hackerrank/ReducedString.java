package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/17/2017.
 */
public class ReducedString {

    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char []remains = new char[input.length()];
        int top = -1; // highest valid index

        for (char c: input.toCharArray()) {
            if (top < 0 || c != remains[top]) {
                remains[++top] = c;
            }
            else {
                --top;
            }
        }

        System.out.println(top < 0 ? "Empty String"
                : new String(remains, 0, top+1));
    }
}
