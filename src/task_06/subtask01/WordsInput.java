package task_06.subtask01;

import java.util.Scanner;

public class WordsInput {

    String inputString(String message){

        System.out.println(message);

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }



}
