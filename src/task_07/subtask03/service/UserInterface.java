package task_07.subtask03.service;

import task_07.subtask03.entity.WorkData;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {

    public int requestSizeOfArray() {

        int arraySize = 0;

        WorkData limits = new WorkData();
        int minimalLength = limits.minimalSequenceLength();

        UserInterface input = new UserInterface();
        boolean isCorrect = false;

        while (!isCorrect) {
            arraySize = input.inputPositiveInt("Please define the size of numerical sequence, it must be more than " + (minimalLength-1));
            isCorrect = (arraySize >= minimalLength);
            if (!isCorrect)
                System.out.println("Wrong input! Try again.");
        }

        return arraySize;
    }

    int inputPositiveInt(String message) {

        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

    public void printArray(int[] arrayToPrint, String message) {
        System.out.println(message + Arrays.toString(arrayToPrint));
    }

}
