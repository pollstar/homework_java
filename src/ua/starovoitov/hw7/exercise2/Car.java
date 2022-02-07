package ua.starovoitov.hw7.exercise2;

import ua.starovoitov.hw7.exercise2.Engine;

public class Car {
    private Manufacturer manufacturer;
    private Engine engine;
    private String colour;
    private int petrol;

    Car() {

    }

    /**
     * Init parametrs of the car
     *
     * @param manufacturer vendor
     * @param engine       type engine
     * @param colour       color automobile
     */
    Car(Manufacturer manufacturer, Engine engine, String colour) {
        setManufacturer(manufacturer);
        setEngine(engine);
        setColour(colour);
        setPetrol(100);
    }

    public String getManufacturer() {
        return this.manufacturer.getRussianName();
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPetrol() {
        return petrol;
    }

    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    public String toString() {
        return "Manufacturer=" + getManufacturer() +
                ", engine{" + engine + "}" +
                ", colour=" + getColour() +
                ", petrol=" + getPetrol();
    }

    public void startEngine(String name) {
        System.out.println("{" + name + "} запустил двмгатель");
    }

    public boolean isEnoughPetrolLevel() {
        return this.petrol >= 50;
    }
}

