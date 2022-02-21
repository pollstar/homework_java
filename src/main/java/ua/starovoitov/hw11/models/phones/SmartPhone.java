package ua.starovoitov.hw11.models.phones;

import java.util.Scanner;

public class SmartPhone extends Phone {
    private final String typePhone = "Smartphone";
    private final long serialIMEI;

    public SmartPhone() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("SerialIMEI number? ");
        this.serialIMEI = getLongFromInput();
    }

    public SmartPhone(String vendor, String model, long serialIMEI) {
        super(vendor, model);
        this.serialIMEI = serialIMEI;
    }

    @Override
    public String getInfo() {
        return "Type: " + this.typePhone + ", " + super.getInfo() + ", IMEI number: " + this.serialIMEI;
    }
}
