package task_06.subtask04;

import java.util.Scanner;

class UserInput {

    boolean askUserForBoolean(String message) {

        boolean isCorrect = false;
        String userAnswer = "";

        while (!isCorrect) {
            userAnswer = inputBooleanLikeString(message);
            isCorrect = checkInput(userAnswer);
        }

        return convertStringToBoolean(userAnswer);

    }

    private String inputBooleanLikeString(String message) {

        String formatDescription = "y for true, n for false";
        System.out.println(message + " (" + formatDescription + "):");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    private boolean checkInput(String inputString) {

        String stringForCheck = inputString.toLowerCase();
        boolean checkResult = false;

        switch (stringForCheck) {
            case "y":
                checkResult = true;
                break;
            case "n":
                checkResult = true;
                break;
            default:
                System.out.println("Wrong input! Please type \"y\" or \"n\" according to description.");
        }

        return checkResult;

    }

    private boolean convertStringToBoolean(String inputString) {

        boolean result;

        String stringToConvert = inputString.toLowerCase();

        if (stringToConvert.equals("y")) {
            result = true;
        } else if (stringToConvert.equals("n")) {
            result = false;
        } else {
            /*  Здесь, по идее, нужно вызывать исключение и матерно ругаться, поскольку мы ранее вызывали checkInput, а значит,
                на вход этого метода не может прийти "неправильная" строка. Но вызывать исключения я еще не умею.
                А вообще, я подозреваю, сам паттерн не очень хорош, поскольку логика метода ставится в зависимость
                от результата работы другого метода. Предполагаю, тут нарушается какой-то из "базовых" принципов типа SOLID или еще чего-то.
                Но придумать что-то получше я уже не успеваю, и знаний не хватает :(
             */
            System.out.println("Unexpected ERROR occured! This app contains shit-code, please invite a qualified developer and rewrite it!");
            System.exit(520);
            result = false;
        }

        return result;
    }

}
