package task_06.subtask08_additional;

class PizzaCalculator {

    // Вот интересно, а где правильнее всего объявлять и хранить такие "постоянные" для приложения значения?
    // В специальных файлах ресурсов?
    // Upd 03.02.2023: последнее занятие сняло вопрос. Нужно создавать специальный класс и методы, возвращающие нужные значения.
    int standartDiameter = 24;
    private int caloriesInSquareCm = 40;

    int caloriesAdded(int diameterIncrease) {

        double caloriesGrouth = caloriesInSquareCm * circleAreaChange(standartDiameter, diameterIncrease);
        return (int) Math.round(caloriesGrouth);

    }

    private double circleAreaChange(int diameter, int diameterIncrease) {

        // Приращение площади круга радиусом r при приращении радиуса на a:
        // P = pi * (r + a)^2 - pi * r^2 = pi * (r^2 + 2ar + a^2 - r^2) = pi * a * (2r + a)

        // Если вместо радиуса подставить диаметр (r = d/2) и приращение диаметра (a = dI/2):
        // P = pi * (dI/2) * (2*(d/2) + dI/2) = pi * dI/2 * ((2d + dI) / 2) = pi * dI * (2d + dI) / 4

        return Math.PI * diameterIncrease * (2 * diameter + diameterIncrease) / 4;

    }

}
