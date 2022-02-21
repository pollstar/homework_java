package ua.starovoitov.hw11.models.phones;

import java.util.Scanner;

public class MobilePhone extends Phone {
    private final String typePhone = "Mobile phone";
    private final long imei;

    public MobilePhone() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("IMEI number? ");
        this.imei = getLongFromInput();
    }

    public MobilePhone(String vendor, String model, long imei) {
        super(vendor, model);
        this.imei = imei;
    }

    @Override
    public String getInfo() {
        return "Type: " + this.typePhone + ", " + super.getInfo() + ", IMEI: " + this.imei;
    }

}