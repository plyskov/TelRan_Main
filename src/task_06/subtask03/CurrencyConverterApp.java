package task_06.subtask03;

/*
3.Реализовать метод, который конвертирует указанную сумму в евро в сумму в долларах США
 */

public class CurrencyConverterApp {

    public static void main(String[] args) {

        CurrencyConverter converter = new CurrencyConverter();
        UserInput userInput = new UserInput();

        double amount = userInput.askUserForDoubleInRequiredFormat(
                "Please enter the amount of EURO:",
                "Wrong input! The amount of EURO must be more than zero.");
        double ratio = userInput.askUserForDoubleInRequiredFormat(
                "Please enter exchange rate EURO to USD (for example from https://www.bloomberg.com/quote/EURUSD:CUR):",
                "Wrong input! The exchange rate must be more than zero.");

        // Результат конвертациии лучше округлить до возможной минимальной размерности выдаваемой валюты, то есть до сотых долей - центов.

        String resultToPrint = String.format("%.2f", converter.convert(amount, ratio));

        System.out.println("The amount of USD is: " + resultToPrint);

    }

}
