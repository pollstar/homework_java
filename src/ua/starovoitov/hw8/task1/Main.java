package ua.starovoitov.hw8.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lengthArray;
        do {
            System.out.println("Введите размер массива:");
            lengthArray = sc.nextInt();
        } while (lengthArray < 10);

        ArraySort array = new ArraySort(lengthArray);
        System.out.println(array);

        System.out.println("Задайте тип сортировки (0-возрастание, 1-убывание, другое- не сортировать): ");

        array.sorting(sc.nextInt());
        System.out.println(array);

        array.thirdValueToCube();
        System.out.println(array);
    }
}
