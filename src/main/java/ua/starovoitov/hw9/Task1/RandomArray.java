package ua.starovoitov.hw9.Task1;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    /**
     *  Creating an array with random numbers from min up to max.
     * @param length  length array
     * @param min   minimal value of number in array
     * @param max maximal value of number in array
     * @return new array
     */
    public static int[] getIntOfRange(int length, int min, int max) {
        int[] array = new int[length];
        Random rnd = new Random();
        if (min > max) {
            var temp = max;
            max = min;
            min = temp;
        }

        int finalMin = min;
        int finalMax = max;
        Arrays.setAll(array, mun -> rnd.nextInt(finalMax - finalMin +1)+ finalMin);
        return array;
    }
}
