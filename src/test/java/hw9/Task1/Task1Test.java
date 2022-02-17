package hw9.Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import ua.starovoitov.hw9.Task1.RandomArray;
import ua.starovoitov.hw9.Task1.Task1;

import java.sql.Array;

import static org.junit.Assert.assertTrue;
import static ua.starovoitov.hw9.Task1.Task1.calculatingGeometricMean;

public class Task1Test {

    @Test
    void calculatingGeometricMean_ArrayLengthZero() {
        System.out.println("Testing calculatingGeometricMean_ArrayLengthZero: ");

        Assertions.assertEquals(1.0,
                Task1.calculatingGeometricMean(new int[0]));
    }

    @Test
    void calculatingGeometricMean_CalculateZero() {
        System.out.println("Testing calculatingGeometricMean_CalculateZero: ");
        Assertions.assertEquals(0.0,
                Task1.calculatingGeometricMean(new int[]{0, 1, 2, 3, 4}));
    }

    @Test
    void calculatingGeometricMean_CalculateOk() {
        System.out.println("Testing calculatingGeometricMean_CalculateOk: ");
        Assertions.assertEquals(2.605171084697352,
                Task1.calculatingGeometricMean(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void calculatingArithmeticMean_ArrayLengthZero() {
        System.out.println("Testing calculatingArithmeticMean_ArrayLengthZero: ");
        Assertions.assertEquals(0.0,
                Task1.calculatingArithmeticMean(new int[0]));
    }

    @Test
    void calculatingArithmeticMean_CalculateOk() {
        System.out.println("Testing calculatingArithmeticMean_CalculateOk: ");
        Assertions.assertEquals(3.0,
                Task1.calculatingArithmeticMean(new int[]{1, 2, 3, 4, 5}));
    }
}
