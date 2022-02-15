package ua.starovoitov.hw9.Task1;

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
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return array;
    }
}
