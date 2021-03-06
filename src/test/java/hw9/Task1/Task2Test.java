package hw9.Task1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ua.starovoitov.hw9.Task1.Task1;
import ua.starovoitov.hw9.Task1.Task2;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static ua.starovoitov.hw9.Task1.Task2.*;

public class Task2Test {
    @Test
    void countingPrimeNumbers_Ok() {
        System.out.println("Testing countingPrimeNumbers_Ok: ");
        final int[] array = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 10};
        Assertions.assertEquals(4, countingPrimeNumbers(array));
    }

    @Test
    void countingPrimeNumbers_EmptyArray() {
        System.out.println("Testing countingPrimeNumbers_EmptyArray: ");
        Assertions.assertEquals(0, countingPrimeNumbers(new int[0]));
    }

    @Test
    void countingPrimeNumbers_ArrayWithNegativeNumber() {
        System.out.println("Testing countingPrimeNumbers_ArrayWithNegativeNumber: ");
        final int[] array = {5, 6, 7, 8, 9, 0, -1, -2, -3, 4, 10};
        Assertions.assertEquals(2, countingPrimeNumbers(array));
    }

    @Test
    void getArrayWithPrimeNumbers_Ok() {
        System.out.println("Testing getArrayWithPrimeNumbers_Ok: ");
        final int[] array = {5, 6, 7, 8, 9, 0, -1, 2, -3, 4, 10};
        final int[] arrayResult = {5, 7, 2};
        Assertions.assertArrayEquals(arrayResult,getArrayWithPrimeNumbers(array));
    }
}
