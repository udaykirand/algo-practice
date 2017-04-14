package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/13/2017.
 */
public class RoundGrade {

    public static void main(String[] s) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        solve(grades);
    }

    private static void solve(int[] grades) {
        for (int grades_i = 0; grades_i < grades.length; grades_i++) {
            int t = grades[grades_i];
            int rem = t % 5;
            //System.out.println(rem);
            if (rem == 3 && (t + 2) >= 40 && (t + 2) <= 100)
                grades[grades_i] += 2;
            else if (rem == 4 && (t + 1) >= 40)
                grades[grades_i] += 1;

            System.out.println(grades[grades_i]);
        }
    }
}
