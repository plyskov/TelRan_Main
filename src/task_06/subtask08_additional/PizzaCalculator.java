package task_06.subtask08_additional;

class PizzaCalculator {

    // Вот интересно, а где правильнее всего объявлять и хранить такие "постоянные" для приложения значения?
    // В специальных файлах ресурсов?
    int standartRadius = 24;
    private int caloriesInSquareCm = 40;

    int caloriesAdded(int radiusIncrease) {

        double caloriesGrouth = caloriesInSquareCm * circleAreaChange(standartRadius, radiusIncrease);
        return (int) caloriesGrouth;

    }

    private double circleAreaChange(int radius, int radiusIncrease) {

        // Приращение площади круга радиусом r при приращении радиуса на a:
        // D = pi * (r + a)^2 - pi * r^2 = pi * (r^2 + 2ar + a^2 - r^2) = pi * a * (2r + a)

        return Math.PI * radiusIncrease * (2 * radius + radiusIncrease);

    }

}
