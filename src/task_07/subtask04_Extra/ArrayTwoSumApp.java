package task_07.subtask04_Extra;

public class ArrayTwoSumApp {

    /*
    4*  Дан массив из N целых чисел и целое число K , найдите количество пар элементов в массиве, сумма которых равна K.
        Пример 1:
        Вход:
        N = 4, K = 6
        arr[] = {1, 5, 7, 1}
        Вывод: 2 пары чисел
        Объяснение:
        arr[0] + arr[1] = 1 + 5 = 6
        arr[1] + arr[3] = 5 + 1 = 6.
        Пример 2:
        Вход:
        N = 4, К = 2
        arr[] = {1, 1, 1, 1}
        Выход: 6 пар чисел
     */
    public static void main(String[] args) {

        int sumToFind = 4; // K
        int[] originalArray = new int[] {1, 3, -3, 5, 2, 8, 6, 2, 7}; // 3 пары: {1,3}, {2,2}, {-3,7}

        ArrayUtil util = new ArrayUtil();

        int numberOfPairs = util.amountOfNumberPairsWithReqiredSum(originalArray, sumToFind);

        System.out.println("Found " + numberOfPairs + " pairs having sum equals " + sumToFind);

    }

}
