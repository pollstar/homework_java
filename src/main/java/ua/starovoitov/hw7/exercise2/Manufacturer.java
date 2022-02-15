package ua.starovoitov.hw7.exercise2;

enum Manufacturer {
    BMW("БМВ"), AUDI("Ауди"), SUZUKI("Судзуки");

    final private String russianName;

    Manufacturer(String manufactured) {
        this.russianName = manufactured;
    }

    public String getRussianName() {
        return russianName;
    }
}
