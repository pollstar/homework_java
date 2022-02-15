package ua.starovoitov.hw9.Task1;

/*
 * Заполнить одномерный массив случайными целочисленными значениями.
 * Проверить сколько простых чисел присутствует в массиве. Размер массива 1000 элементов.
 */

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = RandomArray.getIntOfRange(1000, 0, 1000);

        System.out.println("Source array:");
        System.out.println(Arrays.toString(array));
        System.out.println("Array with prime numbers");
        System.out.println(Arrays.toString(getArrayWithPrimeNumbers(array)));
        System.out.println("Prime numbers in an array");
        System.out.println(countingPrimeNumbers(array));
    }

    /**
     * Counting the number of primes in an array
     *
     * @param numbers array with numbers
     * @return number of primes
     */
    public static int countingPrimeNumbers(int[] numbers) {
        int result = 0;
        for (int n : numbers) {
            if (NumberPrime.isPrime(n)) {
                result++;
            }
        }
        return result;
    }

    public static int[] getArrayWithPrimeNumbers(int[] array) {
        int[] arrayResult = new int[countingPrimeNumbers(array)];
        int index = 0;
        for (int n : array) {
            if (NumberPrime.isPrime(n)) {
                arrayResult[index++] = n;
            }
        }
        return arrayResult;
    }
}
