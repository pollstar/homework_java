package ua.starovoitov.hw8.task2;

import java.util.Arrays;

public class Lock {
    final private int[] sourceArray;
    final private int[] internalArray;

    public Lock(int[] array) {
        sourceArray = array;
        internalArray = array.clone();
    }

    public int[] getArray() {
        return sourceArray;
    }

    public void printArray() {
        System.out.println(Arrays.toString(internalArray));
    }
}
