package ua.starovoitov.hw11.models.service;

import ua.starovoitov.hw11.actions.phones.CreatePhoneForRepair;
import ua.starovoitov.hw11.models.phones.Phone;

import java.util.ArrayList;

public class Service {
    private ArrayList<Phone> phoneInRepair = new ArrayList<Phone>();

    public void takePhoneForRepair() {
        System.out.println("Select type phone:");
        Phone newPhone = new CreatePhoneForRepair().getPhone();
        phoneInRepair.add(newPhone);
    }


    public void printListPhonesInRepair() {
        System.out.println("Phones in repair:");
        for (Phone phone : phoneInRepair) {
            System.out.println(phone.getInfo());
        }
    }
}
