package de.telran.lesson19.hw;


public class FindMissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        // Вычисляем сумму всех элементов от 1 до n
        int totalSum = (n * (n + 1)) / 2;

        // Вычисляем сумму элементов в массиве
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }

        // Недостающий элемент - разница между суммой всех чисел и суммой элементов массива
        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int n1 = 5;
        System.out.println("Недостающий элемент: " + findMissingNumber(arr1, n1));

        int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        int n2 = 10;
        System.out.println("Недостающий элемент: " + findMissingNumber(arr2, n2));
    }
}

