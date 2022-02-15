package ua.starovoitov.hw9.Task1;

public class NumberPrime {
    /**
     * Checking a number for a prime
     * @param number number for check
     * @return true if a number is prime
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < (number / 2) + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isComposite(int number) {
        if (number <= 3) {
            return false;
        }
        for (int i = 2; i < (number / 2) + 1; i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }
}
