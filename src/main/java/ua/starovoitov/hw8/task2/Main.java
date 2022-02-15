package ua.starovoitov.hw8.task2;

import java.util.Arrays;
/*
* Создать класс Lock с конструктором который принимает массив.
* Добавить в него метод геттер. Сделать так,
* чтобы массив помещенный в класс невозможно было изменить.
*
* Значения массива в классе не зименяются, а значения в исходном массиве изменяются через геттер класса,
* в который он передается в конструкторе
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(array));

        Lock lock = new Lock(array);
        System.out.println("Массив, в классе");
        lock.printArray();
        lock.getArray()[0] = 3;
        System.out.println("Массив в классе после операции lock.getArray()[0] = 3");
        lock.printArray();

        System.out.println("Исходный массив после операции lock.getArray()[0] = 3");
        System.out.println(Arrays.toString(array));
    }
}
