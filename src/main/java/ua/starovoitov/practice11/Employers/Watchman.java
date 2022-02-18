package ua.starovoitov.practice11.Employers;

public class Watchman extends Employer{
    public Watchman(String name, int bid) {
        super(name, bid);
    }

    @Override
    public int accrual() {
        return 50;
    }

    public String getWatchman () {
        return "Watchman";
    }
}
