import java.util.Scanner;

public class BirthdayChocolate {

    static int getWays(int[] squares, int d, int m){
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += squares[i];
        }

        int res = 0;
        for (int i = 0; i + m <= squares.length; i++) {
            if (sum == d) {
                res++;
            }

            if (i + m < squares.length) {
                sum += squares[i + m] - squares[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int m = sc.nextInt();
        if(m > s.length)
            System.out.println(0);
        else
            System.out.println(getWays(s, d, m));

        sc.close();
    }
}
