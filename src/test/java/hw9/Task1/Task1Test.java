package hw9.Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import ua.starovoitov.hw9.Task1.Task1;

import java.sql.Array;

import static org.junit.Assert.assertTrue;
import static ua.starovoitov.hw9.Task1.Task1.calculatingGeometricMean;

public class Task1Test {

    @Test
    void calculatingGeometricMean_ArrayLengthZero() {
        Assertions.assertEquals(1.0,
                Task1.calculatingGeometricMean(new int[0]));
    }

    @Test
    void calculatingGeometricMean_CalculateZero() {
        Assertions.assertEquals(0.0,
                Task1.calculatingGeometricMean(new int[]{0, 1, 2, 3, 4}));
    }

    @Test
    void calculatingGeometricMean_CalculateOk() {
        Assertions.assertEquals(2.605171084697352,
                Task1.calculatingGeometricMean(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void calculatingArithmeticMean_ArrayLengthZero() {
        Assertions.assertEquals(0.0,
                Task1.calculatingArithmeticMean(new int[0]));
    }

    @Test
    void calculatingArithmeticMean_CalculateOk() {
        Assertions.assertEquals(3.0,
                Task1.calculatingArithmeticMean(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void createRandomArrayIntOfRange_LengthArray() {
        final int length = 5;
        final int testLength = Task1.createRandomArrayIntOfRange(length,
                -10, 10).length;
        Assertions.assertEquals(length, testLength);
    }

    @RepeatedTest(50)
    void createRandomArrayIntOfRange_CheckIntoRange() {
        final int minimal = -10;
        final int maximal = 10;

        int[] arrayTest;
        arrayTest = Task1.createRandomArrayIntOfRange(50,
                minimal, maximal);
        int minNumber = arrayTest[0];
        int maxNumber = minNumber;
        for (int number : arrayTest) {
            minNumber = Math.min(minNumber, number);
            maxNumber = Math.max(maxNumber, number);
        }
        assertTrue("Minimum number: " + minNumber + " less than range: " + minimal,
                (minNumber >= minimal));
        assertTrue("Maximal number: " + maxNumber + " over range:" + maximal,
                (maxNumber <= maximal));
    }

    @Test
    void createRandomArrayIntOfRange_CheckRange() {
        final int minimal = 10;
        final int maximal = 10;

        int[] arrayTest;
        arrayTest = Task1.createRandomArrayIntOfRange(10,
                minimal, maximal);
        for (int number : arrayTest) {
            Assertions.assertEquals(10, number);
        }
    }

}
