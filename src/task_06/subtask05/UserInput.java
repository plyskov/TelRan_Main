package task_06.subtask05;

import java.util.Scanner;

class UserInput {

    boolean askUser(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }

}
