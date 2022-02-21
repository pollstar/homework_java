package ua.starovoitov.hw11.models.phones;

import ua.starovoitov.hw11.models.Breakdowns;

import javax.sound.midi.Soundbank;
import java.util.Scanner;


public abstract class Phone implements TelephoneRepair{
    protected boolean inProgress = false;
    protected Breakdowns state;
    protected String vendor;
    protected String model;

    protected Phone() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vendor of the phone? ");
        this.vendor = sc.nextLine();
        System.out.print("Model of the phone? ");
        this.model = sc.nextLine();
    }

    public String getInfo() {
        return "Vendor: " + this.vendor + ", model: "+this.model;
    };
}
