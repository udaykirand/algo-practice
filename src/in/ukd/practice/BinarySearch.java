package in.ukd.practice;

import in.ukd.practice.utils.ReadInput;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int first, last, middle, n, search, array[];
        array = ReadInput.readIntArray();
        search = ReadInput.readInteger();
        Arrays.sort(array);
        n = array.length;
        first = 0;
        last = n - 1;
        middle = (first + last) / 2;

        while (first <= last) {
            if (array[middle] < search)
                first = middle + 1;
            else if (array[middle] == search) {
                System.out.println(search + " found at location " + (middle + 1) + ".");
                break;
            } else
                last = middle - 1;

            middle = (first + last) / 2;
        }
        if (first > last)
            System.out.println(search + " is not present in the list.\n");
    }
}
