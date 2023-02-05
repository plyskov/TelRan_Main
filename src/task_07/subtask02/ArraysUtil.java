package task_07.subtask02;

public class ArraysUtil {

    boolean isGrowing(int[] arrayToCheck) {

        for (int i = 1; i < arrayToCheck.length; i++) {
            if (arrayToCheck[i] <= arrayToCheck[i-1])
                return false;
        }

        return true;

    }

}
