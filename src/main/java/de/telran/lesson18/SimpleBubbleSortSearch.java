package de.telran.lesson18;

import java.util.Arrays;

public class SimpleBubbleSortSearch {
    public static void main(String[] args) {
        int[] array = {9, 11, 13, 15, 17, 19, 21, 24, 26, 28, 100};
        int [] arr3 = searchIndex(array, 100);
        System.out.println(Arrays.toString(arr3));
    }

    static public int[] searchIndex(int[] arr, int index) {
        int[] arr2 = new int[1];
        for (int i = 0; i < arr.length; i++) {
            if (index == arr[i]) {
                arr2[0] = i;
            } else {
                arr2[0] = 0;
            }
        }
        return arr2;
    }
}
