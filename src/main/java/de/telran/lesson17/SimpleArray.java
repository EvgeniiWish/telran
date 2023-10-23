package de.telran.lesson17;


import de.telran.lesson16.documentation.Auto;

import java.util.Arrays;
import java.util.Random;

public class SimpleArray {
    public static void main(String[] args) {
        int a;
        int[] arr;

        a = 5;
        arr = new int[5];
        printArray(arr);

        arr[2] = 25;
        printArray(arr);

        System.out.println(arr[2]);

        printArrForEach(arr);

        int[] arr1 = {1, 25, 17, 3, 19, 8};
        printArray(arr1);

        System.out.println();
        Random rnd = new Random();
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rnd.nextInt(10);
        }
        printArray(arr2);
    }

    private static void printArrForEach(int[] arr) {
        for (int elem : arr) {
            System.out.println(elem);
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
    }
}

