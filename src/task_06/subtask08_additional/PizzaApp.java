package task_06.subtask08_additional;

public class PizzaApp {

    public static void main(String[] args) {

        UserInput input = new UserInput();
        PizzaCalculator pizzaCalculator = new PizzaCalculator();

        int radiusIncrease = input.askIntNumber("Please type how many cm do you wish to add to your " + pizzaCalculator.standartRadius +"-cm taaaasty pizza:");

        System.out.println("You will eat " + pizzaCalculator.caloriesAdded(radiusIncrease) + " extra calories!");

    }

}
