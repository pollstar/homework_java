package ua.starovoitov.practice11.Employers;

public class Worker extends Employer{
    public Worker(String name, int bid) {
        super(name, bid);
    }

    @Override
    public int accrual() {
        return 100;
    }

    public String getWorker () {
        return "Worker";
    }
}
