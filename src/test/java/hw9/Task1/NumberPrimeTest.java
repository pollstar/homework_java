package hw9.Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.starovoitov.hw9.Task1.NumberPrime;

public class NumberPrimeTest {
    @Test
    void numberIsPrime_Ok() {
        System.out.println("Testing numberIsPrime_Ok: ");
        Assertions.assertTrue(NumberPrime.isPrime(2));
        Assertions.assertTrue(NumberPrime.isPrime(3));
        Assertions.assertTrue(NumberPrime.isPrime(11));
    }

    @Test
    void numberIsPrime_ForNumbersNotPrime() {
        System.out.println("Testing numberIsPrime_ForNumbersNotPrime: ");
        Assertions.assertFalse(NumberPrime.isPrime(0));
        Assertions.assertFalse(NumberPrime.isPrime(1));
        Assertions.assertFalse(NumberPrime.isPrime(4));
        Assertions.assertFalse(NumberPrime.isPrime(-3));
    }

    @Test
    void numberIsComposite_Ok() {
        System.out.println("Testing numberIsComposite_Ok: ");
        Assertions.assertTrue(NumberPrime.isComposite(4));
        Assertions.assertTrue(NumberPrime.isComposite(10));
        Assertions.assertTrue(NumberPrime.isComposite(9));
    }

    @Test
    void numberIsPrime_ForNumbersNotComposite() {
        System.out.println("Testing numberIsPrime_ForNumbersNotComposite: ");
        Assertions.assertFalse(NumberPrime.isComposite(0));
        Assertions.assertFalse(NumberPrime.isComposite(1));
        Assertions.assertFalse(NumberPrime.isComposite(11));
        Assertions.assertFalse(NumberPrime.isComposite(-3));
    }
}
