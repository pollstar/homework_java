package ua.starovoitov.hw11.models.service;

import ua.starovoitov.hw11.actions.phones.CreatePhoneForRepair;
import ua.starovoitov.hw11.models.breakdowns.BreakdownTypes;
import ua.starovoitov.hw11.models.phones.*;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Service {
    private final ArrayList<Phone> phoneInService = new ArrayList<>();
    private final Phone referencePhone = new Phone("test","test") {
    };

    public Service() {
        referencePhone.setBreakdown(BreakdownTypes.ALL_OK);

        phoneInService.add(new SmartPhone("Samsung", "A30", 564564654));
        phoneInService.add(new MobilePhone("Nokia", "3310", 378963456));
        phoneInService.add(new RadioPhone("Panasonic", "TX120", 654564));
        phoneInService.add(new SmartPhone("Samsung", "A50", 564654564));
        phoneInService.add(new SmartPhone("LG", "G100", 353654563, BreakdownTypes.ANTENNA));
        phoneInService.add(new RadioPhone("Motorola", "I56", 355365453, BreakdownTypes.DISPLAY));
        phoneInService.add(new MobilePhone("LG", "L2100", 4564563, BreakdownTypes.KEYBOARD));
    }

    public void takePhoneForRepair() {
        Phone newPhone = new CreatePhoneForRepair().getPhone();
        if (newPhone == null) {
            return;
        }
        phoneInService.add(newPhone);
        System.out.println("PHONE ADDED:");
        System.out.println(newPhone.getInfo());
    }

    public void printListPhonesInService() {
        System.out.println("Phones in service:");
        if (phoneInService.isEmpty()) {
            System.out.println("phones are out of repair");
        }
        for (Phone phone : phoneInService) {
            System.out.println(phone.getInfo());
        }
    }

    public void printListPhonesRepairInProgress() {
        System.out.println("Phones with repair in progress:");
        printListPhonesWithStatus(StatusRepair.IN_PROGRESS);
    }

    public void printListPhonesPending() {
        System.out.println("Phones awaiting repair:");
        printListPhonesWithStatus(StatusRepair.PENDING);
    }

    public void printListPhonesReady() {
        System.out.println("Ready phones:");
        printListPhonesWithStatus(StatusRepair.READY);
    }

    private void printListPhonesWithStatus(StatusRepair status) {
        int count = 0;
        for (Phone phone : getListPhonesWithStatus(status)) {
            System.out.printf("%d: %s \n", ++count, phone.getInfo());
        }
        if (count == 0) {
            System.out.println("... no phones");
        }
    }

    private ArrayList<Phone> getListPhonesWithStatus(StatusRepair status) {
        ArrayList<Phone> listResult = new ArrayList<>();
        for (Phone phone : phoneInService) {
            if (phone.getStatus() == status) {
                listResult.add(phone);
            }
        }
        return listResult;
    }

    public void printStatistic() {
        int countInService = 0;
        int countIsReady = 0;
        int countInProgress = 0;
        int countInPending = 0;

        for (TelephoneRepair phone : phoneInService) {
            countInService++;
            switch (phone.getStatus()) {
                case READY -> countIsReady++;
                case PENDING -> countInPending++;
                case IN_PROGRESS -> countInProgress++;
            }
        }
        System.out.println("+---------------------- STATISTIC ---------------------+");
        System.out.println("| In Service |    Ready     | In Progress | In pending |");
        System.out.println("+------------------------------------------------------+");
        System.out.printf("|  %6d    |    %6d    |   %6d    |   %6d   |\n", countInService, countIsReady, countInProgress, countInPending);
        System.out.println("+------------------------------------------------------+");
    }

    public void moveFromPendingToProgress() {
        var phonesList = getListPhonesWithStatus(StatusRepair.PENDING);
        if (phonesList.isEmpty()) {
            System.out.println("No phones in Pending status!");
            return;
        }
        printListPhonesWithStatus(StatusRepair.PENDING);

        System.out.print("enter number phone for test ( 0 - exit ): ");
        var select = selectPhone();
        if (select == 0) {
            return;
        }

        var phone = phonesList.get(select - 1);
        if (!phone.testPhone(referencePhone)) {
            addTest(phone);
            System.out.print("Phone is broke: "+phone.getBreakdown().getType()+"! Move to repair (Y or N) ?");
            Scanner sc = new Scanner(System.in);
            String answer;
            do {
                answer = sc.nextLine().toLowerCase(Locale.ROOT);
            } while (!answer.equals("y") && !answer.equals("n"));
            if (answer.equals("y")) {
                phone.takeInRepair();
                System.out.println("Phone: " + phone.getInfo() + " - MOVE FROM PENDING STATUS TO PROGRESS OF REPAIR");
            }
        } else {
            System.out.print("Phone is Ok! Move to ready (Y or N) ?");
            Scanner sc = new Scanner(System.in);
            String answer;
            do {
                answer = sc.nextLine().toLowerCase(Locale.ROOT);
            } while (!answer.equals("y") && !answer.equals("n"));
            if (answer.equals("y")) {
                phone.setIsReady();
                System.out.println("Phone: " + phone.getInfo() + " - MOVE TO READY");
            }
        }
    }

    private void addTest(Phone phone) {
        System.out.print("Add test: ");
        switch (phone.getClass().getSimpleName()) {
            case "RadioPhone" -> ((RadioPhone) phone).addTestLCD();
            case "SmartPhone" -> ((SmartPhone) phone).addTestMicroprocessor();
            case "MobilePhone" -> ((MobilePhone) phone).addTestPlum();
        }
    }

    public void moveFromProgressToReady() {
        var phonesList = getListPhonesWithStatus(StatusRepair.IN_PROGRESS);
        if (phonesList.isEmpty()) {
            System.out.println("No phones in Progress of repair status!");
            return;
        }
        printListPhonesWithStatus(StatusRepair.IN_PROGRESS);

        System.out.print("enter number phone for moving from Progress Status to Ready status ( 0 - exit ): ");
        var select = selectPhone();
        if (select == 0) {
            return;
        }

        var phone = phonesList.get(select - 1);
        phone.setIsReady();
        System.out.println("Phone: " + phone.getInfo() + " - MOVE FROM PROGRESS STATUS TO READY");
    }

    public void givePhoneToClient() {
        var phonesList = getListPhonesWithStatus(StatusRepair.READY);
        if (phonesList.isEmpty()) {
            System.out.println("No phones in READY status!");
            return;
        }
        printListPhonesWithStatus(StatusRepair.READY);

        System.out.print("enter number phone for giving to the client ( 0 - exit ): ");
        var select = selectPhone();
        if (select == 0) {
            return;
        }

        var phone = phonesList.get(select - 1);
        System.out.println("Phone: " + phone.getInfo() + " - GIVING TO THE CLIENT");
        removePhoneInList(phoneInService, phone);
    }

    private void removePhoneInList(ArrayList<Phone> listPhone, Phone phone) {
        for (int i = 0; i < listPhone.size(); i++) {
            Phone test = listPhone.get(i);
            if (test.getModel().equals(phone.getModel()) &&
                test.getVendor().equals(phone.getVendor()) &&
                test.getSerialNumber() == phone.getSerialNumber()) {
                listPhone.remove(i);
                return;
            }
        }
    }

    private int selectPhone() {
        Scanner sc = new Scanner(System.in);
        int selectPhone;
        do {
            while (!sc.hasNextInt()) {
                System.out.println("must be number");
                sc.next();
            }
            selectPhone = sc.nextInt();
        } while (selectPhone < 0 || selectPhone > phoneInService.size());
        return selectPhone;
    }
}
