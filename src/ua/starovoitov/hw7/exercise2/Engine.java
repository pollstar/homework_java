package ua.starovoitov.hw7.exercise2;

public class Engine {
    private int power;
    private TypeEngine type;

    public Engine(TypeEngine type, int power) {
        this.power = power;
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getType() {
        return type.toString();
    }

    public void setType(TypeEngine type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "power = " + power + " " + type;
    }
}

enum TypeEngine {
    DIESEL("Дизельный"), ELECTRICAL("Електрический"), PETROL("Бензиновый");
    final private String typeEngine;

    TypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    @Override
    public String toString() {
        return "typeEngine = " + typeEngine + " ";
    }
}