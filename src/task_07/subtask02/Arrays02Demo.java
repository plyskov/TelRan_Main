package task_07.subtask02;

import java.util.Arrays;

public class Arrays02Demo {

    /*
    Создайте массив из 5 случайных целых чисел из интервала [10;99]
    Выведите его на экран в строку.
    Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
     */

    public static void main(String[] args) {

        ArraysUtil arrUtil = new ArraysUtil();
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (10 + Math.random() * 89);
        }

        System.out.println("Our new array: " + Arrays.toString(numbers));
        System.out.println("This is growing sequence: " + arrUtil.isGrowing(numbers));

    }

}
