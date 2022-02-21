package ua.starovoitov.hw11.models.phones;

import java.util.Scanner;

public class RadioPhone extends Phone {
    private final String typePhone = "Radiophone";
    private final long serialNumber;

    public RadioPhone() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Serial number? ");
        this.serialNumber = getLongFromInput();
    }

    public RadioPhone(String vendor, String model, long serialNumber) {
        super(vendor, model);
        this.serialNumber = serialNumber;
    }

    @Override
    public String getInfo() {
        return "Type: " + this.typePhone + ", " + super.getInfo() + ", serial number: " + this.serialNumber;
    }
}
