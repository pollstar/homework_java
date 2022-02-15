package ua.starovoitov.hw8.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ArraySort {
    final private int[] array;

    ArraySort(int length) {
        if(length < 0) {
            length = 0;
        }
        this.array = new int[length];
        fill();
    }

    private void fill(){
        Random rnd = new Random();
        if (array.length>0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = rnd.nextInt(-100,101);
            }
        }
    }

    public void sorting(int typeSorting) {
        if (array.length < 2) {
            return;
        }
        boolean needIteration = true;
        int temp;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                 if (((typeSorting == 0) && (array[i] < array[i - 1])) ||
                        ((typeSorting == 1) && (array[i] > array[i - 1]))) {
                    temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    needIteration = true;
                }
            }
        }
    }

    public void thirdValueToCube(){
        if( array.length >= 3) {
            for (int i = 2; i < array.length; i += 3) {
                array[i] *= array[i] * array[i];
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}

