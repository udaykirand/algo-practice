package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/17/2017.
 */
public class Hiking {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ip = sc.next();
        int res = 0;
        int level = 0;
        for (char step : ip.toCharArray()) {
            if (level == -1 && step == 'U') {
                res++;
            }

            if (step == 'U') {
                level++;
            } else {
                level--;
            }
        }
        System.out.println(res);
    }
}
