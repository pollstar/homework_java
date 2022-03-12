package ua.starovoitov.hw12.Task4;

import java.util.Optional;

public class PhoneBook {
    private static final String[] PHONE_BOOK = new String[3];

    public static void main(String[] args) {
        PHONE_BOOK[0] = "016/161616";
        PHONE_BOOK[1] = "016/161617";
        PHONE_BOOK[2] = "016/161618";

        String testPhone = "016/161616";
        if (findIndexByPhoneNumber(testPhone).isPresent()) {
            System.out.println("Phone " + testPhone + " is present");
        } else {
            System.out.println("Phone " + testPhone + " is not present");
        }

        testPhone = "016/161456";
        if (findIndexByPhoneNumber(testPhone).isPresent()) {
            System.out.println("Phone " + testPhone + " is present");
        } else {
            System.out.println("Phone " + testPhone + " is not present");
        }
    }

    public static Optional<Integer> findIndexByPhoneNumber(String phoneNumber) {
        for (String phone : PHONE_BOOK) {
            if (phoneNumber.equals(phone)) {
                return Optional.of(1);
            }
        }
        return Optional.empty();
    }
}
