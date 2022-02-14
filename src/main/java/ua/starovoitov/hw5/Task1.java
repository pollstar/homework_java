package ua.starovoitov.hw5;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Заполнение двумерного массива значениями индекса(от 1 и до кол-ва элементов в массиве),
 * при этом каждая вторая строка - отрицательными значениями.
 * Например
 * 1 2 3
 * -4 -5 -6
 * 7 8 9
 * -10 -11 -12
 * *Передать массив в метод, заполнить данный массив
 */
public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[5][7];
        fillArrayWithIndexes(array);
        printTwoDimensionArray(array);

    }


    /**
     * Fill array
     * @param array
     */
    private static void fillArrayWithIndexes(int[][] array) {
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i%2 == 0? index: -index;
                index++;
            }
        }
    }

    private static void printTwoDimensionArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
