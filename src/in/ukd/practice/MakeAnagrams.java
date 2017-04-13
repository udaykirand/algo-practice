package in.ukd.practice;

import in.ukd.practice.utils.ReadInput;

/**
 * Created by udadh on 4/13/2017.
 */
public class MakeAnagrams {
    public static void main(String[] args) throws Exception {
        String aString = ReadInput.readString();
        String bString = ReadInput.readString();

        int[] counts = new int[26];
        char a = 'a';

        char[] charArray = aString.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            counts[charArray[i] - a]++;
        }

        charArray = bString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            counts[charArray[i] - a]--;
        }

        int sum = 0;
        for(int i = 0 ; i < counts.length ;i++){
            sum+= Math.abs(counts[i]);
        }

        System.out.println(sum);
    }
}
