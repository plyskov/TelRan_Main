package task_07.subtask03;

import task_07.subtask03.service.ArrayUtils;
import task_07.subtask03.service.UserInterface;

public class ArrayApp {

    /*
    3) Дан массив размера N-1 , который должен содержать только целые числа в диапазоне от 1 до N .
    Каждое число представлено в одном экземпляре, кроме одного числа. Найдите недостающий элемент.

    Пример 1:
    Вход:
    N = 5
    А[] = {1,2,3,5}
    Ответ: 4

    Пример 2:
    Вход:
    N = 10
    А[] = {6,1,2,8,3,4,7,10,5}
    Ответ: 9

     */

    public static void main(String[] args) {

        UserInterface interaction = new UserInterface();
        ArrayUtils utils = new ArrayUtils();

        // 1. Запросим у пользователя размер последовательности.

        int sizeOfSequence = interaction.requestSizeOfArray(); // N - размер последовательности

        // 2. Создадим и заполним "эталонный" массив числовой последовательности введенного размера.

        int[] sequenceArray = utils.createArray(sizeOfSequence);
        utils.fillSequenceArray(sequenceArray);
        interaction.printArray(sequenceArray, "Our original sequence: ");

        // 3. Сгенерируем и сообщим число в границах последовательности, которое мы "потеряем" и будем искать.

        int missedNumber = utils.generateRandom(1, sizeOfSequence);
        System.out.println("Missed number: " + missedNumber);

        // 4. Создадим новый массив, в котором из последовательности удалено "потерянное" число.

        int[] arrayWithMissedNumber = utils.removeFromArray(sequenceArray, missedNumber);
        interaction.printArray(arrayWithMissedNumber, "Sequence without missed number: ");

        // 5. Перемешаем массив последовательности с "потерянным" числом, чтобы жизнь не казалась легкой прогулкой.

        utils.arrayShuffle(arrayWithMissedNumber);
        interaction.printArray(arrayWithMissedNumber, "Sequence array shuffled with missed number: ");

        // 6. Собственно, основной алгоритм - найдем потерянное число в перемешанном массиве последовательности,
        //    из которой это число "украли".

        /*  Upd 05.02.2023 Алгоритм через разность суммы последовательности по формуле и суммы элементов массива
            уже объяснили на предыдущем уроке. Повторять его не буду:)
            Лучше доделаю так, как пытался изначально:
                - отсортирую перемешанный массив хоть как-нибудь (алгоритмы сортировки мы еще не проходили, но есть гугл);
                - найду пропущенное число сравнением соседних элементов.
         */

        utils.arraySort(arrayWithMissedNumber);
        interaction.printArray(arrayWithMissedNumber, "Sequence array with missed number after sorting: ");

        int foundMissedNumber =  utils.findMissedNumber(arrayWithMissedNumber);
        System.out.println("YEAH we've found missed number, this is " + foundMissedNumber);

        // Все это безобразие надо бы покрыть тестами... но сил на это уже нет :(

    }
}
