package ua.starovoitov.hw2;

public class Task2 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Number " + n +" is "+checkEven(n));

        n = 0;
        System.out.println("Number " + n +" is "+checkEven(n));

        n = -10;
        System.out.println("Number " + n +" is "+checkEven(n));

        n = 6;
        System.out.println("Number " + n +" is "+checkEven(n));
    }

    private static final String checkEven(int n) {
        return n % 2 == 0 ? "even" : "odd";
    }
}
