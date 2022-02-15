package hw9.Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ua.starovoitov.hw9.Task1.Task3.*;

public class Task3Test {
    @Test
    void countingCompositeNumbers_Ok() {
        System.out.print("Testing countingCompositeNumbers_Ok: ");
        final int[] array = {7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 10};
        Assertions.assertEquals(5, countingCompositeNumbers(array));
        System.out.println("Ok");
    }

    @Test
    void countingCompositeNumbers_EmptyArray() {
        System.out.print("Testing countingCompositeNumbers_EmptyArray: ");
        Assertions.assertEquals(0, countingCompositeNumbers(new int[0]));
        System.out.println("Ok");
    }

    @Test
    void countingCompositeNumbers_ArrayWithNegativeNumber() {
        System.out.print("Testing countingCompositeNumbers_ArrayWithNegativeNumber: ");
        final int[] array = {5, 6, 7, 8, 9, 0, -1, -2, -3, -4, 10};
        Assertions.assertEquals(4, countingCompositeNumbers(array));
        System.out.println("Ok");
    }

    @Test
    void getArrayWithCompositeNumbers_Ok() {
        System.out.print("Testing getArrayWithCompositeNumbers_Ok: ");
        final int[] array = {5, 6, 7, 8, 9, 0, -1, 2, -3, -4, 10};
        final int[] arrayResult = getArrayWithCompositeNumbers(array);

        Assertions.assertAll("arrayResult",
                () -> Assertions.assertEquals(arrayResult[0], 6),
                () -> Assertions.assertEquals(arrayResult[1], 8),
                () -> Assertions.assertEquals(arrayResult[2], 9),
                () -> Assertions.assertEquals(arrayResult[3], 10));
        System.out.println("Ok");
    }

    @Test
    void getArrayWithCompositeNumbers_LengthArray() {
        System.out.print("Testing getArrayWithCompositeNumbers_LengthArray: ");
        final int[] array = {5, 6, 7, 8, 9, 0, -1, 2, -3, -4, 10};
        Assertions.assertEquals(4, getArrayWithCompositeNumbers(array).length);
        System.out.println("Ok");
    }
}