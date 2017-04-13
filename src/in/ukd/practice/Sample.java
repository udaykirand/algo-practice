package in.ukd.practice;

/**
 * Created by udadh on 4/11/2017.
 */
public class Sample {

    public static void main(String[] s) {
        System.out.println("-5 -> " + Integer.toBinaryString(-5));
        System.out.println("-5 >>> 1 -> " + (-5 >>> 1) + " -> " + Integer.toBinaryString(-5 >>> 1));
        System.out.println("-5 >> 1 -> " + (-5 >> 1) + " -> " + Integer.toBinaryString(-5 >> 1));
        System.out.println("-5 << 1 -> " + (-5 << 1) + " -> " + Integer.toBinaryString(-5 << 1));
    }
}
