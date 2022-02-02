package ua.starovoitov.hw3;
/**
 * Программа "Угадай число"
 * Задача
 * Отгадать целое число, которое "загадал" компьютер в определенном диапазоне.
 *
 * Решение
 * Описание переменных:
 *
 * secret – число, "загаданное" компьютером;
 * guess – очередное число, вводимое пользователем.
 *
 * Алгоритм решения задачи:
 *
 * Программа генерирует псевдослучайное число, которое записывается в переменную secret.
 *
 * Пока число secret не совпадет с числом guess, пользователю будет предлагаться ввести очередное число.
 * При этом, если guess > secret, то на экран будет выдаваться сообщение "Много".
 * Иначе будет проверяться условие guess < secret.
 * При его положительном значении появится сообщение "Мало", иначе сообщение "Угадал".
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Let's game begin....");

        processingAnswers(getRange());
    }

    private static Scanner sc = new Scanner(System.in);

    private static int[] getRange() {
        System.out.print("Enter minimum range number: ");
        int minRange = sc.nextInt();
        int maxRange = minRange+1;
        do {
            System.out.print("Enter maximum range number: ");
            maxRange = sc.nextInt();

            if (maxRange <= minRange) {
                System.out.println("The maximum number must be greater than " + minRange);
            }
        } while (maxRange <= minRange);

        return new int[]{minRange, maxRange};
    }

    private static void processingAnswers(int[] range) {
        int secret = (int) Math.round(Math.random() * (range[1] - range[0])) + range[0];
        System.out.println("I guessed a number ...");

        while (true) {
            System.out.println("Enter your number....");
            int answer = sc.nextInt();

            if (answer == secret) {
                System.out.println("You win!!!");
                break;
            } else if (answer < secret) {
                System.out.println(answer + " is less than my number. Try again.");
            } else {
                System.out.println(answer + " is more than my number. Try again.");
            }
        }
    }
}
