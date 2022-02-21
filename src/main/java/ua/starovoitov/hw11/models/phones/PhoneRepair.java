package ua.starovoitov.hw11.models.phones;

import ua.starovoitov.hw11.models.service.StatusRepair;

public interface PhoneRepair {
    StatusRepair getStatus();

    void takeInRepair();

    void takeInService();

    void setIsReady();

}
