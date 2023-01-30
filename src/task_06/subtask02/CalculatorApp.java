package task_06.subtask02;

/* Реализовать программу, выводящую на экран результаты сложения, вычитания, умножения и деления двух чисел.
   Каждая из арифметических операций должна быть реализована как отдельный метод.
 */

// От учащегося (Лысков Павел): кажется, мы эту задачу уже делали на уроках и в домашках, причем не один раз :)

public class CalculatorApp {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        double x = userInput.inputDouble("Please enter the 1st number:");
        double y = userInput.inputDouble("Please enter the 2nd number:");

        Calculator calculator = new Calculator();

        System.out.println("The sum of numbers is: " + calculator.sum(x, y));
        System.out.println("The difference of numbers is: " + calculator.subtract(x, y));
        System.out.println("The product of numbers is: " + calculator.multiply(x, y));
        System.out.println("The quotient of numbers is: " + calculator.divide(x, y));

    }
}
