package hw9.Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import ua.starovoitov.hw9.Task1.RandomArray;
import ua.starovoitov.hw9.Task1.Task1;

import static org.junit.Assert.assertTrue;

public class RandomArrayTest {
    @RepeatedTest(5)
    void createRandomArrayIntOfRange_CheckIntoRange() {
        final int minimal = -10;
        final int maximal = 10;

        System.out.println("Testing createRandomArrayIntOfRange_CheckIntoRange: ");
        int[] arrayTest;
        arrayTest = RandomArray.getIntOfRange(50, minimal, maximal);
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
    }


    @Test
    void createRandomArrayIntOfRange_LengthArray() {
        System.out.println("Testing createRandomArrayIntOfRange_LengthArray: ");
        final int length = 5;
        final int testLength = RandomArray.getIntOfRange(length, 0, 10).length;
        Assertions.assertEquals(length, testLength);
    }


    @Test
    void createRandomArrayIntOfRange_CheckRange() {
        System.out.println("Testing createRandomArrayIntOfRange_CheckRange: ");
        final int minimal = 10;
        final int maximal = 10;

        int[] arrayTest;
        arrayTest = RandomArray.getIntOfRange(10, minimal, maximal);
        for (int number : arrayTest) {
            Assertions.assertEquals(10, number);
        }
    }

    @Test
    void createRandomArrayIntOfRange_MimMaxInvert() {
        System.out.println("Testing createRandomArrayIntOfRange_MimMaxInvert: ");
        final int minimal = 10;
        final int maximal = -10;

        int[] arrayTest;
        arrayTest = RandomArray.getIntOfRange(10, minimal, maximal);
        for (int number : arrayTest) {
            Assertions.assertTrue((number <= minimal && number >= maximal));
        }
    }
}
