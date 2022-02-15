package ua.starovoitov.hw9.Task1;
/*
 * Заполнить одномерный массив случайными целочисленными значениями.
 * Проверить сколько составных чисел присутствует в массиве. Размер массива 1000 элементов.
 */

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        final int[] array = RandomArray.getIntOfRange(1000, 0, 1000);

        System.out.println("Source array:");
        System.out.println(Arrays.toString(array));
        System.out.println("Array with composite numbers:");
        System.out.println(Arrays.toString(getArrayWithCompositeNumbers(array)));
        System.out.println("Composite numbers in an array");
        System.out.println(countingCompositeNumbers(array));
    }

    /**
     * Counting the number of composite in an array
     * @param numbers array with numbers
     * @return number of composites
     */
    public static int countingCompositeNumbers(int[] numbers) {
        int result = 0;
        for (int n : numbers) {
            if (NumberPrime.isComposite(n)) {
                result++;
            }
        }
        return result;
    }

    public static int[] getArrayWithCompositeNumbers(int[] array) {
        int[] arrayResult = new int[countingCompositeNumbers(array)];
        int index = 0;
        for (int n : array) {
            if (NumberPrime.isComposite(n)) {
                arrayResult[index] = n;
                index++;
            }
        }
        return arrayResult;
    }
}
