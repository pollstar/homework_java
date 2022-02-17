package ua.starovoitov.hw7.exercise2;

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
