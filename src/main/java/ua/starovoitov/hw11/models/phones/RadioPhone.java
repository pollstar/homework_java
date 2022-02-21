package ua.starovoitov.hw11.models.phones;

import java.util.Scanner;

public class RadioPhone extends Phone {
    private final String typePhone = "Radiophone";
    private final long serialNumber;

    public RadioPhone() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Serial number? ");
        this.serialNumber = sc.nextLong();
    }

    @Override
    public String getInfo() {
        return "Type: " + this.typePhone + ", " + super.getInfo() + ", serial number: " + this.serialNumber;
    }

    @Override
    public void repair() {

    }

    @Override
    public void takeInRepair() {
        this.inProgress = true;
    }

    @Override
    public void takeOutRepair() {
        this.inProgress = false;
    }

    @Override
    public void testing() {

    }
}
