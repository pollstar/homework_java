package hw9.Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static ua.starovoitov.hw9.Task1.Task4.replacingEvenNumbersOnZero;

public class Task4Test {
    static int[] array;

    @BeforeAll
    static void initArrayForTest() {
        System.out.println("Init array");
        final int[] arraySource = {5, 4, 9, 3, 8, 79, 7};
        array = replacingEvenNumbersOnZero(arraySource);
    }

    @Test
    void replacingEvenNumbersOnZero_OddNotIsZero() {
        System.out.println("Testing replacingEvenNumbersOnZero_OddNotIsZero: ");
        Assertions.assertAll("arrayResult",
                () -> Assertions.assertEquals(array[0], 5),
                () -> Assertions.assertEquals(array[2], 9),
                () -> Assertions.assertEquals(array[3], 3),
                () -> Assertions.assertEquals(array[5], 79),
                () -> Assertions.assertEquals(array[6], 7));
    }

    @Test
    void replacingEvenNumbersOnZero_EvenIsZero() {
        System.out.println("Testing replacingEvenNumbersOnZero_EvenIsZero: ");
        Assertions.assertAll("arrayResult",
                () -> Assertions.assertEquals(array[1], 0),
                () -> Assertions.assertEquals(array[4], 0));
    }

    @Test
    void replacingEvenNumbersOnZero_LengthArrayControl() {
        System.out.println("Testing replacingEvenNumbersOnZero_LengthArrayControl: ");
        Assertions.assertEquals(7, array.length);
    }
}