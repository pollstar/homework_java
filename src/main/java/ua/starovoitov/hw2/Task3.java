package ua.starovoitov.hw2;

public class Task3 {
    public static void main(String[] args) {
        int a = 4, b = -5, c = 1;
        System.out.println(getMinModule(a, b, c));

        a = -3; b = -5; c = 10;
        System.out.println(getMinModule(a, b, c));

        a = -4; b = -5; c = 0;
        System.out.println(getMinModule(a, b, c));
    }

    private static final int getMinModule(int a, int b, int c) {
        a = a < 0 ? -a : a;
        b = b < 0 ? -b : b;
        c = c < 0 ? -c : c;

        if (a < b && a < c) {
            return a;
        } else if (b < c && b < a) {
            return b;
        }
        return c;
    }
}
