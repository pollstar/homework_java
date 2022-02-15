package ua.starovoitov.hw9.Task1;

/*
 * Заполнить одномерный массив случайными целочисленными значениями.
 * Найти среднее арифметическое и среднее геометрическое элементов массива. Размер массива - 400 элементов.
 *    P.S. значения элементов можно ограничить значениями 1-10 включительно.
 */

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] array = RandomArray.getIntOfRange(400, 1, 10);

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

    public static double calculatingGeometricMean(int[] array) {
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

    public static double calculatingArithmeticMean(int[] array) {
        double result = 0;
        for (int n : array) {
            result += (double) n / array.length;
        }
        return result;
    }
}
