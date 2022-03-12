package ua.starovoitov.hw12.Task3;

class Exception1 extends Exception {
    Exception1(){
        super("Exception1");
    }
}

class Exception2 extends Exception {
    Exception2(){
        super("Exception2");
    }
}

class Exception3 extends Exception {
    Exception3(){
        super("Exception3");
    }
}

public class TestExceptions {
    public TestExceptions(int excpetion) throws Exception1, Exception2, Exception3 {
        switch (excpetion) {
            case 0 ->
                throw new Exception1();
            case 1 ->
                throw new Exception2();
            default ->
                throw new Exception3();
        }
    }
}
