package ua.starovoitov.hw11;

import ua.starovoitov.hw11.models.service.Service;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Смоделировать сервис по починке телефонов
 * Сервис должен принимать любой телефон (создать 3-4 реализации)
 * Одна реализация телефона должна иметь поломку (любая реализация,
 * просто чтобы ваш сервис мог найти эту поломку и обработать)
 * Каждый класс телефона должен иметь один уникальный метод
 * После нахождения поломки нужно протестировать все методы данного телефона (вызвать все метода класса)
 * Выполнить двух-этапное сравнение (equals и hashCode) сломанного телефона с эталонным
 *
 * Написать программу на основе ООП принципов
 */
public class Main {
    public static Service service = new Service();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selectMenu = 0;
        System.out.println("----------------------------");

        do {
            System.out.println("Select operation: ");
            System.out.println("1 - take phone in repair");
            System.out.println("2 - print list of phones in repair");

            selectMenu = sc.nextInt();
            switch (selectMenu) {
                case 1 :
                    service.takePhoneForRepair();
                    break;
                case 2:
                    service.printListPhonesInRepair();
            }

            System.out.println("----------------------------");
        } while ( selectMenu > 0 );

    }
}
