package in.ukd.practice;

import in.ukd.practice.utils.ReadInput;

/**
 * Created by udadh on 4/15/2017.
 */
public class MathFunctions {

    public static void main(String[] s) {
        int number1 = ReadInput.readInteger();
        int number2 = ReadInput.readInteger();
        System.out.println("GCD of two numbers " + number1 + " and " + number2 + " is :" + findGCD(number1, number2));
        System.out.println("LCM of two numbers " + number1 + " and " + number2 + " is :" + findLcm(number1, number2));
        System.out.println("HCF of two numbers " + number1 + " and " + number2 + " is :" + findHcf(number1, number2));
    }

    private static int findGCD(int number1, int number2) {
        //base case
        if (number2 == 0) {
            return number1;
        }
        return findGCD(number2, number1 % number2);
    }

    private static int findLcm(int x, int y) {
        int a;
        a = (x > y) ? x : y; // a is greater number
        while (true) {
            if (a % x == 0 && a % y == 0)
                return a;
            ++a;
        }
    }

    private static int findHcf(int x, int y) {
        int h = 1;
        int p = x * y;
        for (int i = 2; i < p; i++) {
            if ((x % i == 0) && (y % i == 0)) {
                h = i;
            }
        }
        return h;
    }
}
