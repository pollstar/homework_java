package hw9.Task1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ua.starovoitov.hw9.Task1.Task1;
import ua.starovoitov.hw9.Task1.Task2;

import static org.junit.Assert.assertTrue;
import static ua.starovoitov.hw9.Task1.Task2.*;

public class Task2Test {
    @Test
    void countingPrimeNumbers_Ok() {
        System.out.print("Testing countingPrimeNumbers_Ok: ");
        final int[] array = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 10};
        Assertions.assertEquals(4, countingPrimeNumbers(array));
        System.out.println("Ok");
    }

    @Test
    void countingPrimeNumbers_EmptyArray() {
        System.out.print("Testing countingPrimeNumbers_EmptyArray: ");
        Assertions.assertEquals(0, countingPrimeNumbers(new int[0]));
        System.out.println("Ok");
    }

    @Test
    void countingPrimeNumbers_ArrayWithNegativeNumber() {
        System.out.print("Testing countingPrimeNumbers_ArrayWithNegativeNumber: ");
        final int[] array = {5, 6, 7, 8, 9, 0, -1, -2, -3, 4, 10};
        Assertions.assertEquals(2, countingPrimeNumbers(array));
        System.out.println("Ok");
    }

    @Test
    void getArrayWithPrimeNumbers_Ok() {
        System.out.print("Testing getArrayWithPrimeNumbers_Ok: ");
        final int[] array = {5, 6, 7, 8, 9, 0, -1, 2, -3, 4, 10};
        final int[] arrayResult = getArrayWithPrimeNumbers(array);

        Assertions.assertAll("arrayResult",
                () -> Assertions.assertEquals(arrayResult[0], 5),
                () -> Assertions.assertEquals(arrayResult[1], 7),
                () -> Assertions.assertEquals(arrayResult[2], 2));
        System.out.println("Ok");
    }

    @Test
    void getArrayWithPrimeNumbers_LengthArray() {
        System.out.print("Testing getArrayWithPrimeNumbers_LengthArray: ");
        final int[] array = {5, 6, 7, 8, 9, 0, -1, 2, -3, 4, 10};
        Assertions.assertEquals(3, getArrayWithPrimeNumbers(array).length);
        System.out.println("Ok");
    }
}
