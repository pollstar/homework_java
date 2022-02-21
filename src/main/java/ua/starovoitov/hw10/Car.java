package ua.starovoitov.hw10;

public class Car implements Recovery {
    private final String series;
    private final int year;
    private final String color;
    private final int fuelFullLevel;
    private int fuelCurrentLevel;
    protected int fuelConsumption;

    public Car(String series, int year, String color, int fuel) {
        this.series = series;
        this.year = year;
        this.color = color;
        this.fuelFullLevel = this.fuelCurrentLevel = fuel;
        this.fuelConsumption = 10;
    }

    public void move() {
        if (fuelCurrentLevel >= fuelConsumption) {
            fuelCurrentLevel -= fuelConsumption;
            System.out.println("Car moving");
        } else if (fuelCurrentLevel > 0) {
            fuelCurrentLevel = 0;
            System.out.println("Low level fuel");
        } else {
            System.out.println("Fuel is over");
        }
    }

    public void printStatus() {
        System.out.println("Status car: {" + getStatusCar() + "}");
    }

    protected String getStatusCar() {
        return "series car: " + series + "; year: " + year + "; color: " + color + "; fuel level: " + fuelCurrentLevel;
    }

    @Override
    public void refuel() {
        this.fuelCurrentLevel = this.fuelFullLevel;
        System.out.println("Car is refueled");
    }
}

