package task_04;

public class PrintDigits_SimpleVersion {

    // Класс реализует простой алгоритм исходя из условий задачи: число заведомо известно
    // ("прибито гвоздями" при инициализации в коде) и количество разрядов статично - всегда 3.

    public static void main(String[] args) {

        int initNumber = 917;

        int actualDigit;
        int actualRemainder = initNumber;

        // Разряд 2 (сотни)
        actualDigit     = actualRemainder / 100;
        actualRemainder = actualRemainder % 100;
        System.out.println("Digit 2: " + actualDigit);

        // Разряд 1 (десятки)
        actualDigit = actualRemainder / 10;
        actualRemainder = actualRemainder % 10;
        System.out.println("Digit 1: " + actualDigit);

        // Разряд 0 (единицы)
        actualDigit = actualRemainder; // деление на 10^0 опускаем
        System.out.println("Digit 0: " + actualDigit);

    }
}
