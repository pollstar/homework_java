package ua.starovoitov.hw11.actions.phones;

import ua.starovoitov.hw11.models.phones.MobilePhone;
import ua.starovoitov.hw11.models.phones.Phone;
import ua.starovoitov.hw11.models.phones.RadioPhone;
import ua.starovoitov.hw11.models.phones.SmartPhone;

import java.util.Scanner;

public class CreatePhoneForRepair {
    public Phone getPhone() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do {
            System.out.println("Select phone type:");
            System.out.println("1 - radio phone");
            System.out.println("2 - mobile phone");
            System.out.println("3 - smart phone");
            System.out.println("0 - exit");
            i = sc.nextInt();
        } while (i < 0 || i > 3);
        switch (i) {
            case 1:
                return new RadioPhone();
            case 2:
                return new MobilePhone();
            case 3:
                return new SmartPhone();
            default:
                return null; // знаю что не правильно, но упрощаю логику
        }
    }
}
