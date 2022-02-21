package ua.starovoitov.hw11.models.phones;

import ua.starovoitov.hw11.models.breakdowns.BreakdownTypes;

import java.util.Scanner;

public class RadioPhone extends Phone {
    private final String typePhone = "Radiophone";

    public RadioPhone() {
        super();
        System.out.print("Serial number? ");
        this.serialNumber = getLongFromInput();
        askAboutBreakdown();
    }

    public RadioPhone(String vendor, String model, long serialNumber) {
        super(vendor, model);
        this.serialNumber = serialNumber;
        this.breakdown = BreakdownTypes.ALL_OK;
    }

    public RadioPhone(String vendor, String model, long serialNumber, BreakdownTypes breakdown) {
        super(vendor, model);
        this.serialNumber = serialNumber;
        this.breakdown = breakdown;
    }

    @Override
    public String getInfo() {
        return "Type: " + this.typePhone + ", " + super.getInfo() +
                ", serial number: " + this.serialNumber + " -> Breakdown: " + breakdown.getType();
    }

    public void addTestLCD(){
        System.out.println("We add test LCD ");
    }

}
