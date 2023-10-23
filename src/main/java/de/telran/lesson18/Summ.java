package de.telran.lesson18;

public class Summ {
    public static void main(String[] args) {
        //*Вывести на экран всю таблицу умножения в виде
        // i*g
        //1x1=1
        //1x2=2
        //…
        //2x1=2
        //2x2=4
        //…
        //9x9=81

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%dx%d=%d%n", i, j, i * j);
            }
            System.out.println();
        }
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");

            for (int j = 1; j <= 9; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
            if (i == 1)
                System.out.println("-".repeat(26));
        }
        System.out.println();
    }
}
