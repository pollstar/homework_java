package hw9.Task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ua.starovoitov.hw9.Task2.GetRandomNumber;

final public class GetRandomNumberTest {
    private static RandomWrapper random;
    final private GetRandomNumber randomNumber = new GetRandomNumber();
    private int testNumber;

    @BeforeAll
    static void setup() {
        random  = Mockito.mock(RandomWrapper.class);
    }
    
    @Test
    void  get_NumberIsZero() {
        System.out.println("Testing get_NumberIsZero: ");
        testNumber = 0;
        Assertions.assertEquals(0, randomNumber.get(random));
        Mockito.when(random.nextInt(100)).thenReturn(testNumber);
    }

    @Test
    void  get_NumberLess10() {
        System.out.println("Testing get_NumberLess10: ");
        testNumber = 8;
        Mockito.when(random.nextInt(100)).thenReturn(testNumber);
        Assertions.assertEquals(1000/testNumber, randomNumber.get(random));
    }

    @Test
    void  get_NumberLess20() {
        System.out.println("Testing get_NumberLess20: ");
        testNumber = 15;
        Mockito.when(random.nextInt(100)).thenReturn(testNumber);
        Assertions.assertEquals(testNumber/5, randomNumber.get(random));

    }

    @Test
    void  get_NumberLess50() {
        System.out.println("Testing get_NumberLess50: ");
        testNumber = 40;
        Mockito.when(random.nextInt(100)).thenReturn(testNumber);
        Assertions.assertNull(randomNumber.get(random));

    }

    @Test
    void  get_NumberLess80() {
        System.out.println("Testing get_NumberLess80: ");
        testNumber = 70;
        Mockito.when(random.nextInt(100)).thenReturn(testNumber);
        Assertions.assertEquals(-10, randomNumber.get(random));
    }

    @Test
    void  get_NumberMore80() {
        System.out.println("Testing get_NumberMore80: ");
        testNumber = 90;
        Mockito.when(random.nextInt(100)).thenReturn(testNumber);
        Assertions.assertEquals(testNumber, randomNumber.get(random));
    }
}

