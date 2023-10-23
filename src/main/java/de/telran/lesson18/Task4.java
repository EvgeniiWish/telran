package de.telran.lesson18;

public class Task4 {
    //Дан массив чисел. Напишите метод, который в данном массиве находит наименьший элемент
    // и наибольший элемент и возвращает их среднее арифметическое.
    public static void main(String[] args) {
        int[] myInt = {5, 6, 8, 12, 789, -45};
        System.out.println("Среднее арифметическое: "+ getMinMaxAverage(myInt));
    }
    private static int getMinMaxAverage(int[] arr){
        int min = arr[0];
        int max = arr [0];
        for (int i = 0; i < arr.length; i++) {
            min= Math.min(arr[i], min);
            max= Math.max(arr[i], max);

        }
        return (max+min)/2;

    }
}
