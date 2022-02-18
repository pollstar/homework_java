package ua.starovoitov.practice11;

import ua.starovoitov.practice11.Employers.*;

public class Main {
    public static void main(String[] args) {
        Employer[] employers = {
                new Watchman("Вася", 50),
                new Accountant("Дуся", 100),
                new Boss("Юра", 300),
                new Worker( "Петя", 150)
        };

        issueSalary(employers);
    }

    public static void issueSalary (Employer[] employers) {
        for (Employer employer: employers) {
            switch (employer.getClass().getSimpleName()) {
                case "Worker" -> System.out.println(((Worker) employer).getWorker());
                case "Watchman" -> System.out.println(((Watchman) employer).getWatchman());
                case "Boss" -> System.out.println(((Boss) employer).getBossType());
                default -> System.out.println(((Accountant) employer).getAccountantType());
            }

            System.out.printf("%s %d\n", employer.getName(), employer.accrual());
        }
    }
}
