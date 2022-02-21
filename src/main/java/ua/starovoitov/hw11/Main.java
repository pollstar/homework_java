package ua.starovoitov.hw11;

import ua.starovoitov.hw11.models.service.Service;

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
        int selectMenu;

        do {
            System.out.println("----------------------------");
            System.out.println("Select operation: ");
            System.out.println("1 - take phone in repair");
            System.out.println("2 - print list of phones in service");
            System.out.println("3 - print list of phones is ready");
            System.out.println("4 - print a list of phones pending of repair");
            System.out.println("5 - print a list of phones in the process of being repaired");
            System.out.println("6 - print statistic");
            System.out.println();
            System.out.println("7 - testing the phone");
            System.out.println("8 - repair the phone");
            System.out.println("9 - give the phone to the client");
            System.out.println("----------------------------");

            while (!sc.hasNextInt()) {
                System.out.println("must be number");
                sc.next();
            }

            selectMenu = sc.nextInt();
            switch (selectMenu) {
                case 1 -> service.takePhoneForRepair();
                case 2 -> service.printListPhonesInService();
                case 3 -> service.printListPhonesReady();
                case 4 -> service.printListPhonesPending();
                case 5 -> service.printListPhonesRepairInProgress();
                case 6 -> service.printStatistic();
                case 7 -> service.moveFromPendingToProgress();
                case 8 -> service.moveFromProgressToReady();
                case 9 -> service.givePhoneToClient();
            }
        } while ( selectMenu > 0 );

    }
}
