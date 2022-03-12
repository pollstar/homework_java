package ua.starovoitov.hw12.Task3;

public class Main {
    public static void main(String[] args) {
        try {
            TestExceptions ts1 = new TestExceptions(0);
        } catch (Exception1 | Exception2 | Exception3 e) {
            e.printStackTrace();
        }
        try {
            TestExceptions ts1 = new TestExceptions(1);
        } catch (Exception1 | Exception2 | Exception3 e) {
            e.printStackTrace();
        }
        try {
            TestExceptions ts1 = new TestExceptions(2);
        } catch (Exception1 | Exception2 | Exception3 e) {
            e.printStackTrace();
        }
    }
}
