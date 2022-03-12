package ua.starovoitov.hw12.Task2;

public class Main {

    static void f() throws Exception {
        try {
            g();
        } catch (Exception e) {
            System.out.println("Exception test in f(): " + e);
            throw new Exception("Exception in class f");
        }
    }

    static void g() throws Exception {
        System.out.println("Work method g()");
        throw new Exception("Exception in class g");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Exception test in main(): " + e);
        }
    }
}
