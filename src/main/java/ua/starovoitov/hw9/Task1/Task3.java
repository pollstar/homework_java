package ua.starovoitov.hw9.Task1;
/*
 * Заполнить одномерный массив случайными целочисленными значениями.
 * Проверить сколько составных чисел присутствует в массиве. Размер массива 1000 элементов.
 */

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = createRandomArrayIntOfRange(1000, 0, 1000);

        System.out.println("Source array:");
        System.out.println(Arrays.toString(array));
        System.out.println("Composite numbers in an array");
        System.out.println(countingCompositeNumbers(array));

    }

    /**
     * Counting the number of composite in an array
     * @param numbers array with numbers
     * @return number of composites
     */
    private static int countingCompositeNumbers(int[] numbers) {
        int result = 0;
        for (int n : numbers) {
            if (!numberIsPrime(n) && n > 1) {
                result++;
                System.out.print(n + " ");
            }
        }
        System.out.println("\nNumber of composite numbers in the array");
        return result;
    }

    /**
     * Checking a number for a prime
     * @param number number for check
     * @return true if a number is prime
     */
    private static boolean numberIsPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < (number / 2) + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
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
