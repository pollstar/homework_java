package hw9.Task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ua.starovoitov.hw9.Task2.GetRandomNumber;

final public class GetRandomNumberTest {
    final private RandomWrapper random = Mockito.mock(RandomWrapper.class);
    final private GetRandomNumber randomNumber = new GetRandomNumber();
    private int testNumber;

    @Test
    void  get_NumberIsZero() {
        System.out.print("Testing get_NumberIsZero: ");
        testNumber = 0;
        Mockito.when(random.nextInt(100)).thenReturn(testNumber);
        Assertions.assertEquals(0, randomNumber.get(random));
        System.out.println("Ok");
    }

    @Test
    void  get_NumberLess10() {
        System.out.print("Testing get_NumberLess10: ");
        testNumber = 8;
        Mockito.when(random.nextInt(100)).thenReturn(testNumber);
        Assertions.assertEquals(1000/testNumber, randomNumber.get(random));
        System.out.println("Ok");
    }

    @Test
    void  get_NumberLess20() {
        System.out.print("Testing get_NumberLess20: ");
        testNumber = 15;
        Mockito.when(random.nextInt(100)).thenReturn(testNumber);
        Assertions.assertEquals(testNumber/5, randomNumber.get(random));
        System.out.println("Ok");
    }

    @Test
    void  get_NumberLess50() {
        System.out.print("Testing get_NumberLess50: ");
        testNumber = 40;
        Mockito.when(random.nextInt(100)).thenReturn(testNumber);
        Assertions.assertNull(randomNumber.get(random));
        System.out.println("Ok");
    }

    @Test
    void  get_NumberLess80() {
        System.out.print("Testing get_NumberLess80: ");
        testNumber = 70;
        Mockito.when(random.nextInt(100)).thenReturn(testNumber);
        Assertions.assertEquals(-10, randomNumber.get(random));
        System.out.println("Ok");
    }

    @Test
    void  get_NumberMore80() {
        System.out.print("Testing get_NumberMore80: ");
        testNumber = 90;
        Mockito.when(random.nextInt(100)).thenReturn(testNumber);
        Assertions.assertEquals(testNumber, randomNumber.get(random));
        System.out.println("Ok");
    }
}

