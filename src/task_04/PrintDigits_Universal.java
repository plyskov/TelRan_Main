package task_04;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintDigits_Universal {

    // Класс реализует универсальный алгоритм для условий, более близких к "реальной жизни":
    // - число вводится пользователем;
    // - количество разрядов заранее неизвестно;
    // - разряды нужно вывести в порядке убывания - так, как мы привыкли видеть числа в обычной жизни.

    public static void main(String[] args) {

        /* Самый простой вариант алгоритма - получать разряды в порядке возрастания. А выводить нужно в порядке убывания.
           Поэтому запомним разряды в динамический массив, чтобы обойти в обратном порядке и вывести начиная со старшего разряда.

           Альтернативный вариант - реализовать алгоритм получения разрядов в порядке убывания и выводить в консоль сразу.
           Но для такого варианта потребуется:
            - сначала определить разрядность числа, то есть добавить еще один цикл деления;
            - а затем для степеней числа 10 использовать Math.pow(), которая нам по условиям задачи "недоступна",
              либо написать свой аналог.
           Это повышает количество математических операций, поэтому мне показалось, что лучше задействовать больше памяти на ArrayList.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int userNumber = scanner.nextInt();

        if (userNumber < 0)
            userNumber = -userNumber;

        ArrayList<Integer> digits = new ArrayList<>();

        int remainder   = userNumber;
        int digitNumber = 0;

        do {
            digits.add(remainder % 10);
            remainder = remainder / 10;
            digitNumber++;
        } while (remainder != 0); // Цикл do-while - чтобы сработало, если пользователь введет 0.

        for (digitNumber = digits.size() - 1; digitNumber >= 0; digitNumber--){
            System.out.println("Digit " + digitNumber + " is " + digits.get(digitNumber));
        }

    }

}
