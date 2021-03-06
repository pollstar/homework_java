package ua.starovoitov.hw9.Task2;

import java.util.Random;

public class GetRandomNumber {
    public Integer get(Random random) {
        final int number = random.nextInt(100);
        if (number < 10) {
            if (number == 0 ) {
                return 0;
            }
            return 1000 / number;
        }

        if (number < 20) {
            return number / 5;
        }

        if (number < 50) {
            return null;
        }

        if (number < 80) {
            return -10;
        }

        return number;
    }
}