package hw9.Task1;

import org.junit.jupiter.api.*;
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

    @Test
    void numberIsPrime_Ok() {
        System.out.print("Testing numberIsPrime_Ok: ");
        Assertions.assertTrue(numberIsPrime(3));
        Assertions.assertTrue(numberIsPrime(11));
        System.out.println("Ok");
    }

    @Test
    void numberIsPrime_NumberNotPrime() {
        System.out.print("Testing numberIsPrime_NumberNotPrime: ");
        Assertions.assertFalse(numberIsPrime(0));
        Assertions.assertFalse(numberIsPrime(1));
        Assertions.assertFalse(numberIsPrime(4));
        Assertions.assertFalse(numberIsPrime(-3));
        System.out.println("Ok");
    }

    @RepeatedTest(5)
    void createRandomArrayIntOfRange_CheckIntoRange() {
        final int minimal = -10;
        final int maximal = 10;

        System.out.print("Testing createRandomArrayIntOfRange_CheckIntoRange: ");
        int[] arrayTest;
        arrayTest = Task1.createRandomArrayIntOfRange(50,
                minimal, maximal);
        int minNumber = arrayTest[0];
        int maxNumber = minNumber;
        for (int number : arrayTest) {
            minNumber = Math.min(minNumber, number);
            maxNumber = Math.max(maxNumber, number);
        }
        Assertions.assertTrue(
                (minNumber >= minimal), "Minimum number: " + minNumber + " less than range: " + minimal);
        Assertions.assertTrue(
                (maxNumber <= maximal), "Maximal number: " + maxNumber + " over range:" + maximal);

        System.out.println("Ok");
    }

    @Test
    void createRandomArrayIntOfRange_CheckRange() {
        final int minimal = 10;
        final int maximal = 10;

        System.out.print("Testing createRandomArrayIntOfRange_CheckRange: ");

        int[] arrayTest;
        arrayTest = Task1.createRandomArrayIntOfRange(10,
                minimal, maximal);
        for (int number : arrayTest) {
            Assertions.assertEquals(10, number);
        }
        System.out.println("Ok");
    }
}
