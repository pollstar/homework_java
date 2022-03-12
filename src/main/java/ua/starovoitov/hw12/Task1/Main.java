package ua.starovoitov.hw12.Task1;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) throws MyException {
        try {
            throw new MyException();
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block");
        }
    }
}
