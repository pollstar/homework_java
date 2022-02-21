package ua.starovoitov.hw11.models.phones;

import ua.starovoitov.hw11.models.breakdowns.BreakdownTypes;
import ua.starovoitov.hw11.models.service.StatusRepair;

import java.util.Objects;
import java.util.Scanner;


public abstract class Phone implements PhoneRepair {
    protected StatusRepair progress;
    protected String vendor;
    protected String model;
    protected long serialNumber = 0;
    protected BreakdownTypes breakdown = BreakdownTypes.ALL_OK;

    protected Phone() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vendor of the phone? ");
        this.vendor = sc.nextLine();
        System.out.print("Model of the phone? ");
        this.model = sc.nextLine();
        takeInService();
    }

    protected Phone(String vendor, String model) {
        this.vendor = vendor;
        this.model = model;
        takeInService();
    }

    public void setBreakdown(BreakdownTypes breakdown) {
        this.breakdown = breakdown;
    }

    public BreakdownTypes getBreakdown() {
        return breakdown;
    }

    protected void askAboutBreakdown() {
        System.out.println("select breakdown from list:");
        for (var i = 0; i < BreakdownTypes.values().length; i++) {
            System.out.printf("%d: %s\n", i + 1, BreakdownTypes.values()[i]);
        }
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        var i = 0;
        do{
            while (!sc.hasNextInt()) {
                System.out.println("must be number");
                sc.next();
            }
            i = sc.nextInt();
        } while (i < 1 || i > BreakdownTypes.values().length);

        setBreakdown(BreakdownTypes.values()[i - 1]);
    }

    public String getInfo() {
        return "Vendor: " + this.vendor + ", model: " + this.model;
    }

    @Override
    public void takeInRepair() {
        this.progress = StatusRepair.IN_PROGRESS;
    }

    @Override
    public void takeInService() {
        this.progress = StatusRepair.PENDING;
    }

    @Override
    public void setIsReady() {
        this.progress = StatusRepair.READY;
        setBreakdown(BreakdownTypes.ALL_OK);
    }

    @Override
    public StatusRepair getStatus() {
        return progress;
    }

    protected Long getLongFromInput() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextLong()) {
            System.out.println("must be number");
            sc.next();
        }
        return sc.nextLong();
    }

    public boolean testPhone(Phone testPhone) {
        return (this.hashCode() == testPhone.hashCode()) && (this.equals(testPhone));
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Phone phone = (Phone) o;
        return breakdown == phone.breakdown;
    }

    @Override
    public int hashCode() {
        return Objects.hash(breakdown);
    }
}
