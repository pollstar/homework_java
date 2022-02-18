package ua.starovoitov.practice11.Employers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.starovoitov.practice11.Payroll;

@Setter
@Getter
@AllArgsConstructor
public abstract class Employer implements Payroll {
    protected String name;
    protected int bid;
}
