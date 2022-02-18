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
            if ( employer.getClass().getSimpleName().equals("Worker")) {
                Worker worker = (Worker) employer;
                System.out.println(worker.getWorker());
            } else if ( employer.getClass().getSimpleName().equals("Watchman")) {
                Watchman watchman = (Watchman) employer;
                System.out.println(watchman.getWatchman());
            } else if ( employer.getClass().getSimpleName().equals("Boss")) {
                Boss boss = (Boss) employer;
                System.out.println(boss.getBossType());
            } else {
                Accountant accountant = (Accountant) employer;
                System.out.println(accountant.getAccountantType());
            }

            System.out.printf("%s %d\n", employer.getName(), employer.accrual());
        }
    }
}
