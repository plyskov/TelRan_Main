package task_06.subtask05;


/*
5. Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
Реализуйте логический метод canBuy, возвращающий true / false
Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false. Отобразите строку «Я могу купить еду, это ……» и значение.
 */

public class CheckStoresApp {

    public static void main(String[] args) {

        UserInput input = new UserInput();

        boolean isEdekaOpen = input.askUser("Is Edeka open now (true/false)?");
        boolean isReweOpen  = input.askUser("Is Rewe open now (true/false)?");

        // С вашего позволения, слегка усложню задачу - сделаю проверку для произвольного количества флагов (в булевом массиве).
        // Делать метод, принимающий 2 параметра и проверяющий их на true, уже неинтересно :)

        boolean[] shopsOpenStatuses = new boolean[2];
        shopsOpenStatuses[0] = isEdekaOpen;
        shopsOpenStatuses[1] = isReweOpen;

        CheckStores checkStores = new CheckStores();

        boolean canBuy = checkStores.canBuy(shopsOpenStatuses);

        System.out.println("I can buy a food, it's " + canBuy);

    }

}
