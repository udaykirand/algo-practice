package in.ukd.practice;

import in.ukd.practice.utils.ReadInput;

/**
 * Created by udadh on 4/13/2017.
 */
public class QuickSort {
    int input[];
    int length;

    public static void main(String[] args) {
        QuickSort sorter = new QuickSort();
        int[] array = ReadInput.readIntArray();
        sorter.sort(array);
        for(int i : array) {
            System.out.println(i);
        }

    }

    public void sort(int[] inputArr) {
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.input = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = input[lowerIndex+(higherIndex-lowerIndex)/2];
        while (i <= j) {

            while (input[i] < pivot) {
                i++;
            }
            while (input[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);

                i++;
                j--;
            }
            print();
        }

        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    private void print() {
        System.out.println("Interim");
        for(int i : input) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
