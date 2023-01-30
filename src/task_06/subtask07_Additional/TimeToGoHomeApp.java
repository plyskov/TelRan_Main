package task_06.subtask07_Additional;

public class TimeToGoHomeApp {

    public static void main(String[] args) {

        int secondsLeft = (int) (Math.random() * secondsPerWorkingDay());

        System.out.println(secondsLeft + " seconds left to go home.");

        // Преобразуем в "человеческий" формат

        int secondsRemains = secondsLeft % secondsInMinute();
        int minutesLeft = secondsLeft / secondsInMinute();

        int minutesRemains = minutesLeft % minutesInHour();
        int hoursRemains = minutesLeft / minutesInHour();

        // Сообщаем оставшееся время в "человеческом" формате
        System.out.println("Time left to go home: " + hoursRemains + ":" + minutesRemains + ":" + secondsRemains);

        // Проверяем:
        int secondsToCheck = hoursRemains * minutesInHour() * secondsInMinute() + minutesRemains * secondsInMinute() + secondsRemains;
        System.out.println("Testing:\nstart seconds - " + secondsLeft + "; seconds from calculated time - " + secondsToCheck);
        System.out.println("Test result: " + (secondsLeft == secondsToCheck));

    }

    private static int secondsPerWorkingDay() {
        return hoursPerWorkingDay() * minutesInHour() * secondsInMinute();
    }

    private static int hoursPerWorkingDay() {
        return 8;
    }

    private static int minutesInHour() {
        return 60;
    }

    private static int secondsInMinute() {
        return 60;
    }

}
