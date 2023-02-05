package task_07.subtask03.service;

import java.util.Arrays;

public class ArrayUtils {

    public int[] createArray(int sizeOfSequence) {
        return new int[sizeOfSequence];
    }

    public void fillSequenceArray(int[] workingArray) {

        for (int i = 0; i < workingArray.length; i++) {
            workingArray[i] = i + 1;
        }

    }

    public int[] removeFromArray(int[] originArray, int numberToRemove) {

        int[] newArray = createArray(originArray.length - 1);

        int countOfNewArray = 0;

        for (int i = 0; i < originArray.length; i++) {
            if (originArray[i] != numberToRemove) {
                newArray[countOfNewArray] = originArray[i];
                countOfNewArray += 1;
            }
        }

        return newArray;

    }

    public void arrayShuffle(int[] workingArray) {

        for (int i = workingArray.length-1; i > 1 ; i--) {

            int j = (int) (Math.random()* (i + 1));

            int tempPlace = workingArray[i];
            workingArray[i] = workingArray[j];
            workingArray[j] = tempPlace;

        }

    }

    public void arraySort(int[] workingArray) {

        int elementsToSort = workingArray.length;

        while (elementsToSort > 0) {
            for (int i = 1; i < elementsToSort; i++) {
                if (workingArray[i-1] > workingArray[i]) {
                    int tempStorage = workingArray[i-1];
                    workingArray[i-1] = workingArray[i];
                    workingArray[i] = tempStorage;
                }
            }
            elementsToSort -= 1;
        }

    }

    public int findMissedNumber(int[] workingArray) {

        int missedNumber = 0;
        int previousNumber = 0; // Для "отлова" случая, когда пропущена 1 и массив начинается с 2.

        for (int i = 0; i < workingArray.length; i++) {
            if ((workingArray[i] - previousNumber) > 1) {
                missedNumber = workingArray[i] - 1;
                break;
            } else {
                previousNumber = workingArray[i];
            }
        }
        return missedNumber;
    }

    public int generateRandom(int fromNumber, int toNumber) {
        return fromNumber + (int) (Math.random() * (toNumber - fromNumber + 1));
    }

}
