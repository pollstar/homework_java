package ua.starovoitov.hw1;

public class Task1_v2 {
    public static void main(String[] args) {

        // определяем и выводим строковую переменную
        String myNameFamily = "Павел Старовойтов";
        System.out.println(myNameFamily);

        // Выделяем имя
        String myName = "";
        int positionSpace = myNameFamily.lastIndexOf(' ');
        if (positionSpace ==-1) {
            System.out.println("Имя не найдено");
        } else {
            myName = myNameFamily.substring(0, positionSpace);
        }

        // проверяем длинну имени
        if (myName.length() > 7) {
            System.out.println("more than 7");
        } else {
            System.out.println("less than 7");
        }

        // определяем шаг, значение и запускаем цикл
        for (int i=0, j=5; i<=10; i++, j+=2) {
            System.out.println("Шаг " + i + ", значение " + j);
        }
    }
}
