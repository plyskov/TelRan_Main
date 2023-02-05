package task_07.subtask04_Extra;

public class ArrayTwoSumTest {

    public static void main(String[] args) {

        ArrayUtil util = new ArrayUtil();

        // Тест 1. Обычный массив с разными отрицательными числами и нулем.

        int sumToFind = 4; // K
        int[] originalArray = new int[] {3, 0, -2, 1, 4, 8, 6, 9, 4}; // 4 пары: {3,1}, {0,4}, {0,4}, {-2,6}
        int expectedResult = 4;
        int result = util.amountOfNumberPairsWithReqiredSum(originalArray, sumToFind);
        printTestResult("Test 1 - find pairs in usual array", expectedResult, result);

        // Тест 2. Массив с одинаковыми элементами, сумма которых попарно равна искомой.

        sumToFind = 6; // K
        originalArray = new int[] {3, 3, 3, 3, 3}; // 4 + 3 + 2 + 1 = 10 пар
        expectedResult = 10;
        result = util.amountOfNumberPairsWithReqiredSum(originalArray, sumToFind);
        printTestResult("Test 2 - find pairs in array of equal elements", expectedResult, result);

        // Тест 3. Массив без элементов с целевой суммой.

        sumToFind = 1000; // K
        originalArray = new int[] {3, 0, -100500, 1, -4, 9000, 0, 9, 18}; // 0 пар
        expectedResult = 0;
        result = util.amountOfNumberPairsWithReqiredSum(originalArray, sumToFind);
        printTestResult("Test 3 - find pairs in array without target sum", expectedResult, result);

        // Тест 4. Очень короткий массив.

        sumToFind = 0; // K
        originalArray = new int[] {0, 0}; // 1 парf
        expectedResult = 1;
        result = util.amountOfNumberPairsWithReqiredSum(originalArray, sumToFind);
        printTestResult("Test 4 - find pairs in shortest array", expectedResult, result);

    }

    public static void printTestResult(String message, int expectedResult, int realResult){
        if (expectedResult == realResult) {
            System.out.println("Test \"" + message + "\" passed OK!");
        } else {
            System.out.println("Test \"" + message + "\" passed FAIL!");
            System.out.println("Expected result - " + expectedResult + ", but received - " + realResult);
        }
    }

}
