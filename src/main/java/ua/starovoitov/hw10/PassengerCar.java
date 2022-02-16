package ua.starovoitov.hw10;

public class PassengerCar extends Car {
    private int passenger;

    public PassengerCar(String series, int year, String color, int fuel) {
        super(series, year, color, fuel);
    }

    public void putPassengerOn() {
        if (passenger < 3) {
            System.out.println("The passenger got into the car");
            passenger++;
        } else {
            System.out.println("Car is full");
        }
    }

    @Override
    protected String getStatusCar() {
        return super.getStatusCar() + "; passenger: " + passenger;
    }
}
