package ua.starovoitov.hw7.exercise1;
import ua.starovoitov.hw7.exercise1.Car;

/**
 * Создайть класс Car который содержит четыре свойства (дополнительных объектов создавать не требуется)
 * manufacturer
 * engine
 * colour
 * petrol
 * Создайть несколько экземпляров Car, установить значения свойствам (с помощью set’ров) и
 * вывести информацию на консоль (toString)
 *
 * Добавьте методы:
 * startEngine принимающий параметр name. Метод выводит в консоль “{name} запустил двигатель”
 * isEnoughPetrolLevel проверяет количество бензина, если значение ниже 50 - возвращает - false, если больше - true
 *
 * Добавить конструктор в класс, который принимает на вход 3 параметра (manufacturer, engine, colour),
 * устанавливает их и дополнительно задает значение petrol = 100
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setManufacturer("BMW");
        car1.setEngine("2,5");
        car1.setColour("red");
        car1.setPetrol(40);
        System.out.println(car1);

        Car car2 = new Car();
        car2.setManufacturer("Audi");
        car2.setEngine("2,0");
        car2.setColour("green");
        car2.setPetrol(80);
        System.out.println(car2);

        car1.startEngine("One");
        System.out.println("level petrol > 50? is = "+ car1.isEnoughPetrolLevel());

        car2.startEngine("Two");
        System.out.println("level petrol > 50? is = "+ car2.isEnoughPetrolLevel());

        Car car3 = new Car("Suzuki", "1,8", "black");
        System.out.println(car3);
        car3.startEngine("Three");
        System.out.println("level petrol > 50? is = "+ car3.isEnoughPetrolLevel());

    }
}
