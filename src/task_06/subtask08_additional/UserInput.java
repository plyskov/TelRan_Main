package task_06.subtask08_additional;

import java.util.Scanner;

class UserInput {

    int askIntNumber(String message) {
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
