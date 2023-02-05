package task_07.subtask04_Extra;

public class ArrayUtil {

    public int amountOfNumberPairsWithReqiredSum(int[] workingArray, int sumToFind) {

        int counterOfResults = 0;

        for (int i = 0; i < workingArray.length; i++) {
            for (int j = i+1; j < workingArray.length; j++) {
                if (workingArray[i] + workingArray[j] == sumToFind)
                    counterOfResults += 1;
            }
        }

        return counterOfResults;

    }

}
