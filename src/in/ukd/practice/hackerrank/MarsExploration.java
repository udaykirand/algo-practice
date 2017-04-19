package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/17/2017.
 */
public class MarsExploration {

    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();

        int res = 0;
        for (int i = 0; i < ip.length(); i += 3) {
            String tmp = ip.substring(i, Math.min(ip.length(), i + 3));
            System.out.println(tmp);
            if(tmp.charAt(0) != 'S')
                res++;
            if(tmp.charAt(1) != 'O')
                res++;
            if(tmp.charAt(2) != 'S')
                res++;

        }
        System.out.println(res);
    }
}
