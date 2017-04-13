package in.ukd.practice.utils;

import java.util.Scanner;

/**
 * Created by udadh on 4/10/2017.
 */
public class ReadInput {

    private static Scanner in = new Scanner(System.in);

    public static int readArraySize() {
        int n;
        System.out.println("Enter number of elements");
        n = in.nextInt();
        return n;
    }

    public static int[] readIntArray() {
        int c, n;
        n = readArraySize();
        System.out.println("Enter " + n + " integers ");
        int[] array = new int[n];
        for (c = 0; c < n; c++)
            array[c] = in.nextInt();
        return array;
    }

    public static int readInteger() {
        int n;
        System.out.println("Enter a number ");
        n = in.nextInt();
        return n;
    }

    public static String readString() {
        String str;
        System.out.println("Enter a String ");
        str = in.nextLine();
        return str;
    }

}
