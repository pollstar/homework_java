package ua.starovoitov.practice11.Employers;

public class Accountant extends Employer{
    public Accountant(String name, int bid) {
        super(name, bid);
    }

    @Override
    public int accrual() {
        return 150;
    }

    public String getAccountantType() {
        return "Accountant";
    }
}
