package ua.starovoitov.hw11.models.phones;

import ua.starovoitov.hw11.models.breakdowns.Breakdown;
import ua.starovoitov.hw11.models.breakdowns.BreakdownTypes;
import ua.starovoitov.hw11.models.service.StatusRepair;

import java.util.Objects;
import java.util.Scanner;


public abstract class Phone implements TelephoneRepair {
    protected StatusRepair progress;
    protected BreakdownTypes state;
    protected String vendor;
    protected String model;
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

    public String getInfo() {
        return "Vendor: " + this.vendor + ", model: " + this.model + " -> Breakdown: " + breakdown.getType();
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
    }

    @Override
    public StatusRepair getStatus() {
        return progress;
    }

    protected Long getLongFromInput() {
        Scanner sc = new Scanner(System.in);
        while (! sc.hasNextLong()) {
            System.out.println("must be number");
            sc.next();
        }
        return sc.nextLong();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return breakdown == phone.breakdown;
    }

    @Override
    public int hashCode() {
        return Objects.hash(breakdown);
    }
}
