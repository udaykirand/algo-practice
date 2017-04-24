package in.ukd.practice.hackerrank.ds;

import java.util.Scanner;

/**
 * Created by udadh on 4/24/2017.
 */
public class DynamicArray {

    public static void main(String[] s) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Q = scan.nextInt();
        int lastAns = 0;
        int[][] sequences = new int[N][0];

        for (int i = 0; i < Q; i++) {
            int query = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();

            if (query == 1) {
                int index = ((x ^ lastAns) % N);
                sequences[index] = addToArray(sequences[index], y);
            } else if (query == 2) {
                int index = ((x ^ lastAns) % N);
                int seqIndex = y % N;
                lastAns = sequences[index][(y % sequences[index].length)];
                System.out.println(lastAns);
            }
        }
    }

    private static int[] addToArray(int[] array, int value) {
        int[] output = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            output[i] = array[i];
        }
        output[array.length] = value;
        return output;
    }
}

