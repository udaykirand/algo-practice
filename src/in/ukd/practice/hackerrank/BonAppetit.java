package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/17/2017.
 */
public class BonAppetit {

    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] items = new int[n];
        int actual = 0;
        for(int i = 0; i < n; i++) {
            items[i] = sc.nextInt();
            if(i != k)
                actual += items[i];
        }
        int charged = sc.nextInt();
        if(actual/2 == charged)
            System.out.println("Bon Appetit");
        else
            System.out.println(charged - actual/2);

    }
}
