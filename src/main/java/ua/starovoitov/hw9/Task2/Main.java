package ua.starovoitov.hw9.Task2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        GetRandomNumber rnd = new GetRandomNumber();
        Integer number;

        for (int i = 0; i < 100; i++) {
            System.out.println(rnd.get(new Random()));
        }
    }
}
