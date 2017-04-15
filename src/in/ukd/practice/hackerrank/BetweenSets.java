package in.ukd.practice.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenSets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }
        calcBetweenSets(a, b);

    }

    static void calcBetweenSets(int[] A, int[] B) {
        int g = gcd(B);

        if (!Arrays.stream(A).allMatch(a -> g % a == 0)) {
            System.out.println(0);
        }

        System.out.println(computeDivisorNum(g / lcm(A)));
    }

    static int gcd(int[] x) {
        int g = x[0];
        for (int i = 1; i < x.length; i++) {
            g = findGCD(g, x[i]);
        }
        return g;
    }

    private static int findGCD(int x, int y) {
        return (y == 0) ? x : findGCD(y, x % y);
    }

    static int lcm(int[] x) {
        int l = x[0];
        for (int i = 1; i < x.length; i++) {
            l = findLcm(l, x[i]);
        }
        return l;
    }

    private static int findLcm(int x, int y) {
        return x * y / findGCD(x, y);
    }

    static int computeDivisorNum(int x) {
        int divisorNum = 1;
        int prime = 2;
        while (x != 1) {
            while (!isPrime(prime)) {
                prime++;
            }

            int exponent = 0;
            while (x % prime == 0) {
                x /= prime;
                exponent++;
            }
            divisorNum *= exponent + 1;

            prime++;
        }
        return divisorNum;
    }

    static boolean isPrime(int x) {
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
