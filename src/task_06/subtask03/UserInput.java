package task_06.subtask03;

import java.util.Scanner;

class UserInput {

    double askUserForDoubleInRequiredFormat(String message, String errorMessage) {

        double requiredNUmber = 0;
        CurrencyConverter converter = new CurrencyConverter();
        boolean numberIsCorrect = false;

        while (!numberIsCorrect) {
            requiredNUmber = inputDouble(message);
            numberIsCorrect = converter.checkNumber(requiredNUmber);
            if (!numberIsCorrect)
                System.out.println(errorMessage);
        }

        return requiredNUmber;

    }

    double inputDouble(String message) {
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

}
