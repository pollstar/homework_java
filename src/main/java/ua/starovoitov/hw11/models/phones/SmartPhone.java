package ua.starovoitov.hw11.models.phones;

import ua.starovoitov.hw11.models.Breakdowns;

import java.util.Scanner;

public class SmartPhone extends Phone {
    private final String typePhone = "Smartphone";
    private final long serialIMEI;

    public SmartPhone() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("SerialIMEI number? ");
        this.serialIMEI = sc.nextLong();
    }

    @Override
    public String getInfo() {
        return "Type: " + this.typePhone + ", " + super.getInfo() + ", IMEI number: " + this.serialIMEI;
    }

    @Override
    public void repair() {

    }

    @Override
    public void takeInRepair() {

    }

    @Override
    public void takeOutRepair() {

    }

    @Override
    public void testing() {

    }
}
