package in.ukd.practice.hackerrank;

import java.util.Scanner;

/**
 * Created by udadh on 4/17/2017.
 */
public class CatMouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            int aDist = Math.abs(z - x);
            int bDist = Math.abs(z - y);

            if(aDist == bDist)
                System.out.println("Mouse C");
            else if(aDist > bDist)
                System.out.println("Cat B");
            else
                System.out.println("Cat A");

        }
    }
}
