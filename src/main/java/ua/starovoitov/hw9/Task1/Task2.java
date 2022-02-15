package ua.starovoitov.hw9.Task1;

/*
 * Заполнить одномерный массив случайными целочисленными значениями.
 * Проверить сколько простых чисел присутствует в массиве. Размер массива 1000 элементов.
 */

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
//        int[] array = createRandomArrayIntOfRange(1000, 0, 1000);
        int[] array = {5, 6, 7, 8, 9, 0, -1, -2, -3, 4, 10};
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
            if (numberIsPrime(n)) {
                result++;
            }
        }
        return result;
    }

    public static int[] getArrayWithPrimeNumbers(int[] array) {
        int[] arrayResult = new int[countingPrimeNumbers(array)];
        int index = 0;
        for (int n : array) {
            if (numberIsPrime(n)) {
                arrayResult[index++] = n;
            }
        }
        return arrayResult;
    }

    /**
     * Checking a number for a prime
     *
     * @param number number for check
     * @return true if a number is prime
     */
    public static boolean numberIsPrime(int number) {
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
     * Creating an array with random numbers from min up to max.
     *
     * @param length length array
     * @param min    minimal value of number in array
     * @param max    maximal value of number in array
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
