package ua.starovoitov.hw4;

/**
 * Заполнить одномерный массив случайными целочисленными значениями.
 * Найти среднее арифметическое и среднее геометрическое элементов массива. Размер массива - 400 элементов.
 *    P.S. значения элементов можно ограничить значениями 1-10 включительно.
 */

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] array = createRandomArrayIntOfRange(400, 1, 10);


//        int array[] = {2,0};

        System.out.println(Arrays.toString(array));
        System.out.println("Arithmetic Mean = " + calculatingArithmeticMean(array));
        System.out.println("Geometric Mean = " + calculatingGeometricMean(array));
    }

    /**
     * Calculating the geometric mean of an array of numbers
     *
     * @param array Array of numbers
     * @return geometric mean
     */

    private static double calculatingGeometricMean(int[] array) {
        double result = 1.0;
        double degree = 1.0 / array.length;
        for (int n : array) {
            result *= Math.pow(n, degree);
        }
        return result;
    }

    /**
     * Calculating the arithmetic mean of an array of numbers
     *
     * @param array - Array of numbers
     * @return arithmetic mean
     */

    private static double calculatingArithmeticMean(int[] array) {
        double result = 0;
        for (int n : array) {
            result += (double) n / array.length;
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
