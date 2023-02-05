package task_07.subtask01;

import java.util.Arrays;

public class Arrays01Demo {

    /*
     1) Создайте массив из 8 случайных целых чисел из интервала [1;50]
     Выведите массив на экран в строку
     Замените каждый элемент с нечётным индексом на ноль
     Снова выведете массив на экран на отдельной строке
     */

    public static void main(String[] args) {

        int[] numbers = new int[8];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 50);
        }

        System.out.println("Created array: " + Arrays.toString(numbers));

        for (int i = 1; i < numbers.length; i += 2) {
            numbers[i] = 0;
        }

        System.out.println("Array after zeroing in odd indexes: " + Arrays.toString(numbers));

    }

}
