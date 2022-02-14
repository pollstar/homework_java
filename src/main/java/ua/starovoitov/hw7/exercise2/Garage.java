package ua.starovoitov.hw7.exercise2;

public class Garage {
    public static void checkCar(Car car) {
        String result = "";
        if (!car.isEnoughPetrolLevel()) {
            result += "мало топлива ";
        }
        if(car.getEngine().getPower() < 200) {
            result += " мощность менее 200 ";
        }

        if(!result.equals("")) {
            System.out.println("Проверка не пройдена: " + result);
            return;
        }
        System.out.println("Все OK: топливо = "+ car.getPetrol()+" мощность = "+ car.getEngine().getPower());
    }
}
