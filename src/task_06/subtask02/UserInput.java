package task_06.subtask02;

import java.util.Scanner;

class UserInput {

    double inputDouble(String message) {

        System.out.println(message);

        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();

    }

}
