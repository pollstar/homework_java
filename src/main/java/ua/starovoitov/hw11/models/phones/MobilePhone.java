package ua.starovoitov.hw11.models.phones;

import ua.starovoitov.hw11.models.breakdowns.BreakdownTypes;

import java.util.Scanner;

public class MobilePhone extends Phone {
    private final String typePhone = "Mobile phone";

    public MobilePhone() {
        super();
        System.out.print("IMEI number? ");
        this.serialNumber = getLongFromInput();
        askAboutBreakdown();
    }

    public MobilePhone(String vendor, String model, long imei) {
        super(vendor, model);
        this.serialNumber = imei;
    }

    public MobilePhone(String vendor, String model, long serialNumber, BreakdownTypes breakdown) {
        super(vendor, model);
        this.serialNumber = serialNumber;
        this.breakdown = breakdown;
    }

    @Override
    public String getInfo() {
        return "Type: " + this.typePhone + ", " + super.getInfo() +
                ", IMEI: " + this.serialNumber + " -> Breakdown: " + breakdown.getType();
    }

    public void addTestPlum(){
        System.out.println("We add test plume ");
    }
}
