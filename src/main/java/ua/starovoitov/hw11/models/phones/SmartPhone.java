package ua.starovoitov.hw11.models.phones;

import ua.starovoitov.hw11.models.breakdowns.BreakdownTypes;

import java.util.Scanner;

public class SmartPhone extends Phone {
    private final String typePhone = "Smartphone";

    public SmartPhone() {
        super();
        System.out.print("SerialIMEI number? ");
        this.serialNumber = getLongFromInput();
        askAboutBreakdown();
    }

    public SmartPhone(String vendor, String model, long serialIMEI) {
        super(vendor, model);
        this.serialNumber = serialIMEI;
    }

    public SmartPhone(String vendor, String model, long serialNumber, BreakdownTypes breakdown) {
        super(vendor, model);
        this.serialNumber = serialNumber;
        this.breakdown = breakdown;
    }

    @Override
    public String getInfo() {
        return "Type: " + this.typePhone + ", " + super.getInfo() + ", IMEI number: " +
                this.serialNumber + " -> Breakdown: " + breakdown.getType();
    }

    public void addTestMicroprocessor(){
        System.out.println("We add test Microprocessor ");
    }
}
