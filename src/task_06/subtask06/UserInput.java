package task_06.subtask06;

import java.util.Scanner;

class UserInput {

    double askDoubleNumber(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

}
