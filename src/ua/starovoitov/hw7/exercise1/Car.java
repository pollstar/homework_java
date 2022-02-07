package ua.starovoitov.hw7.exercise1;


public class Car {
    private String manufacturer;
    private String engine;
    private String colour;
    private int petrol;

    Car() {}

    Car(String manufacturer, String engine, String colour) {
        setManufacturer(manufacturer);
        setEngine(engine);
        setColour(colour);
        setPetrol(100);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
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
                ", engine=" + getEngine() +
                ", colour=" + getColour() +
                ", petrol=" + getPetrol();
    }

    public void startEngine(String name) {
        System.out.println("{" + name + "} запустил двмгатель");
    }

    /**
     * проверяет количество бензина
     *
     * @return если значение ниже 50 - возвращает - false, если больше - true
     */
    public boolean isEnoughPetrolLevel() {
        return this.petrol >= 50;
    }
}
