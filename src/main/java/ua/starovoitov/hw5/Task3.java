package ua.starovoitov.hw5;

import java.util.Arrays;
import java.util.Random;

/**
 * Дан двумерный массив NxN(количество строк = количество столбцов),
 * написать программу которая поменяет местами столбцы и строки.
 * *Необходимо создать новый массив, в котором выполняются превращения
 * и вернуть его из метода. Изначальный массив не должен измениться
 */
public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        fillArrayNRandom(array, 10);
        System.out.println("source array");
        printTwoDimensionArray(array);

        System.out.println("replace rows with columns");
        printTwoDimensionArray(replacingRowsColumns(array));

        System.out.println("source array");
        printTwoDimensionArray(array);
    }


    private static int[][] replacingRowsColumns(int[][] array) {
        int[][] result = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                result[j][i] = array[i][j];
            }
        }
        return result;
    }

    private static void fillArrayNRandom(int[][] array, int maxValue) {
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = rnd.nextInt(maxValue);
            }
        }
    }

    private static void printTwoDimensionArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
