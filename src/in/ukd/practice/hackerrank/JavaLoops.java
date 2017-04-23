package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/23/2017.
 */
public class JavaLoops {

    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        do {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        } while(i <= 10);
    }
}
