package hw9.Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.Arrays;

import static ua.starovoitov.hw9.Task1.Task3.*;

public class Task3Test {
    @Test
    void countingCompositeNumbers_Ok() {
        System.out.println("Testing countingCompositeNumbers_Ok: ");
        final int[] array = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 10};
        Assertions.assertEquals(5, countingCompositeNumbers(array));
    }

    @Test
    void countingCompositeNumbers_EmptyArray() {
        System.out.println("Testing countingCompositeNumbers_EmptyArray: ");
        Assertions.assertEquals(0, countingCompositeNumbers(new int[0]));
    }

    @Test
    void countingCompositeNumbers_ArrayWithNegativeNumber() {
        System.out.println("Testing countingCompositeNumbers_ArrayWithNegativeNumber: ");
        final int[] array = {5, 6, 7, 8, 9, 0, -1, -2, -3, -4, 10};
        Assertions.assertEquals(4, countingCompositeNumbers(array));
    }

    @Test
    void getArrayWithCompositeNumbers_Ok() {
        System.out.println("Testing getArrayWithCompositeNumbers_Ok: ");
        final int[] array = {5, 6, 7, 8, 9, 0, -1, 2, -3, -4, 10};
        final int[] arrayResult = {6, 8, 9, 10};
        Assertions.assertArrayEquals(arrayResult, getArrayWithCompositeNumbers(array));
    }

    @Test
    void getArrayWithCompositeNumbers_LengthArray() {
        System.out.println("Testing getArrayWithCompositeNumbers_LengthArray: ");
        final int[] array = {5, 6, 7, 8, 9, 0, -1, 2, -3, -4, 10};
        Assertions.assertEquals(4, getArrayWithCompositeNumbers(array).length);
    }
}
