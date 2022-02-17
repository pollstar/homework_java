package ua.starovoitov.hw10;

public class Track extends Car {
    private boolean cargo = false;

    public Track(String series, int year, String color, int fuel) {
        super(series, year, color, fuel);
        fuelConsumption *= 2;
    }

    public void loadingCargo() {
        if (!cargo) {
            cargo = true;
            System.out.println(" - loaded");
        } else {
            System.out.println(" - already loaded");
        }
    }

    public void unloadingCargo() {
        if (cargo) {
            cargo = false;
            System.out.println(" - unloaded");
        } else {
            System.out.println(" - already unloaded");
        }
    }

    @Override
    protected String getStatusCar() {
        return super.getStatusCar() + "; cargo: " + (cargo ? "filled" : "empty");
    }
}
