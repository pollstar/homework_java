package ua.starovoitov.hw4;
/**
 * Заполнить одномерный массив случайными целочисленными значениями.
 *  Все четные значения заменить на нули. Размер массива - 2000 элементов.
 */

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = createRandomArrayIntOfRange(2000, 0, 1000);

        System.out.println("Source array:");
        System.out.println(Arrays.toString(array));
        System.out.println("Array without even numbers:");
        System.out.println(Arrays.toString(replacingEvenNumbers(array)));
        System.out.println("Source array:");
        System.out.println(Arrays.toString(array));
    }

    /**
     * Replacing even numbers in an array with zero
     * @param numbers array of numbers
     * @return array with replacement of even numbers
     */
    private static int[] replacingEvenNumbers(int[] numbers) {
        int[] result = numbers.clone();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                result[i] = 0;
            }
        }
        return result;
    }

    /**
     *  Creating an array with random numbers from min up to max.
     * @param length  length array
     * @param min   minimal value of number in array
     * @param max maximal value of number in array
     * @return new array
     */
    private static int[] createRandomArrayIntOfRange(int length, int min, int max) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return array;
    }
}
