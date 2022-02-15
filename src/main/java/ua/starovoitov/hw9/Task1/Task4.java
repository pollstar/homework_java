package ua.starovoitov.hw9.Task1;
/*
 * Заполнить одномерный массив случайными целочисленными значениями.
 *  Все четные значения заменить на нули. Размер массива - 2000 элементов.
 */

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = RandomArray.getIntOfRange(2000, 0, 1000);

        System.out.println("Source array:");
        System.out.println(Arrays.toString(array));
        System.out.println("Array without even numbers:");
        System.out.println(Arrays.toString(replacingEvenNumbersOnZero(array)));
        System.out.println("Source array:");
        System.out.println(Arrays.toString(array));
    }

    public static int[] replacingEvenNumbersOnZero(int[] array) {
        int[] result = array.clone();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[i] = 0;
            }
        }
        return result;
    }
}
