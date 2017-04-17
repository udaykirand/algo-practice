package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/17/2017.
 */
public class CamelCase {

    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        int count = 1;
        for(char c : ip.toCharArray()) {
            if(Character.isUpperCase(c))
                count++;
        }
        System.out.println(count);
    }
}
