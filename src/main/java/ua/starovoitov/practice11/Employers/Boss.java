package ua.starovoitov.practice11.Employers;

public class Boss extends Employer{

    public Boss(String name, int bid) {
        super(name, bid);
    }

    @Override
    public int accrual() {
        return 200;
    }

    public String getBossType () {
        return "Boss";
    }
}
