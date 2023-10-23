package de.telran.lesson18;

import java.util.Random;
import java.util.Scanner;

public class Probe {
    public static void main(String[] args) {
        //    Игра "Угадай число": Разработайте текстовую игру,
        // в которой компьютер выбирает случайное число,       // а игрок должен угадать его, получая подсказки
     // "больше" или "меньше" до тех пор, пока не угадает.
        Random random = new Random();
        int num = random.nextInt(25);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Введите число: ");
            int user = sc.nextInt();
            if (user == num) {
                System.out.println("Вы выграли / отгадали");
                break;
            }
            System.out.println("Число должно быть " + (user < num ? "больше" : "меньше"));
        } while (true);
    }
}