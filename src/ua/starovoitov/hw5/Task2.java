package ua.starovoitov.hw5;

import java.util.Arrays;
import java.util.Random;

/**
 * Проверить, заданный массив на упорядоченность по невозрастанию, т. е. определить,
 * верно ли, что каждый его элемент, начиная со второго, не больше предыдущего.
 * передать массив в метод, получить boolean
 */
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[5];
        fillArrayRandom(array, 30);

        // test random array
        System.out.println(Arrays.toString(array));
        System.out.println(isSortedAscending(array));

        // test array sorted revers
        sortRevers(array);
        System.out.println(Arrays.toString(array));
        System.out.println(isSortedAscending(array));

        // test array sorted
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(isSortedAscending(array));
    }

    /**
     * checking array for descending
     *
     * @param array array for checking
     * @return true if array sorted revers
     */
    private static boolean isSortedAscending(int[] array) {
        if (array.length <= 1) {
            return true;
        }

        int prevElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (prevElement < array[i]) {
                return false;
            }
            prevElement = array[i];
        }
        return true;
    }

    private static void fillArrayRandom(int[] array, int maxValue) {
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(maxValue);
        }
    }

    private static void sortRevers(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int n = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = n;
        }
    }
}
