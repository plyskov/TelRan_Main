package task_06.subtask04;

/*
Создайте две переменные isWeekend и isRain. Создайте переменную canWalk,
значение которой должно быть истинным, если это выходной день (isWeekend=true) и не идет дождь (isRain=false).
 */
public class CanWalkDemo {

    public static void main(String[] args) {

        UserInput input = new UserInput();

        boolean isWeekend = input.askUserForBoolean("Please answer is it weekend now?");
        boolean isRain = input.askUserForBoolean("Please answer is it rain now?");

        boolean canWalk = isWeekend && !isRain;

        String walkAbility = "";
        if (canWalk) {
            walkAbility = "can";
        } else {
            walkAbility = "cannot";
        }

        System.out.println("You " + walkAbility + " go walk now.");

    }

}
