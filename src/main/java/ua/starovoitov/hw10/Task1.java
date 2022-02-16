package ua.starovoitov.hw10;

/**
 * 1) Создать класс car (будет служить родительским)
 * - с полями: серия, год, цвет, топливо
 * - с методами: I) движение (движется пока есть топливо),
 * II) метод показать статистику
 * - добавить конструктор на 4 поля
 * 2) Создать дочерний класс passenger car
 * - добавить поле класс passenger
 * - добавить метод посадить пассажира (в машине не может быть более 3 пассажиров)
 * 3) Создать дочерний класс truck
 * - добавить поле cargo
 * - добавить метод погрузки и выгрузки груза
 * - переопределить метод движения (потребления топлива х2 от нормы)
 * 4) Создать интерфейс Recovery с методом refuel (восстанавливает топливо машины до полного значения)
 * 5) Имплементировать интерфейс в созданных ранее типах машин
 */
public class Task1 {
    final static Car car1 = new Car("BMW", 1980, "red", 50);
    final static PassengerCar car2 = new PassengerCar("Volvo", 1990, "white", 80);
    final static Track car3 = new Track("MAN", 1995, "yellow", 200);

    public static void main(String[] args) {
        car1.printStatus();
        car1.move();
        car1.printStatus();

        System.out.println();
        car2.printStatus();
        for (int i = 0; i < 4; i++) {
            car2.putPassengerOn();
        }
        for (int i = 0; i < 12; i++) {
            car2.move();
        }
        car2.printStatus();
        car2.refuel();
        car2.printStatus();

        System.out.println();
        car3.printStatus();
        for (int i = 0; i < 11; i++) {
            car3.move();
        }
        car3.loadingCargo();
        car3.loadingCargo();
        car3.printStatus();
        car3.unloadingCargo();
        car3.refuel();
        car3.printStatus();
    }
}
