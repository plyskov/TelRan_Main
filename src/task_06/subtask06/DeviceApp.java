package task_06.subtask06;

/*
Представим, что у нас есть устройство, в котором две колбы. Прибор работает корректно,
если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
Вы должны написать метод, который проверяет это устройство. Ваша программа должна иметь переменные Temperature1 и Temperature2.
В результате он выводит сообщение true или false.
 */

public class DeviceApp {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        DeviceUtil deviceUtil = new DeviceUtil();

        double temperature1 = userInput.askDoubleNumber("Please input temperature of 1st flask in Celsium:");
        double temperature2 = userInput.askDoubleNumber("Please input temperature of 1st flask in Celsium:");

        Device ourDevice = deviceUtil.createDevice(temperature1, temperature2);

        // Тоже немного усложню себе задачу: помимо проверки условий работы устройства добавлю вывод лога
        // с указанием причин, по которым устройство работать не может.

        StringBuffer errorLog = new StringBuffer();

        boolean canWork = deviceUtil.checkDevice(ourDevice.getTemperature1(), ourDevice.getTemperature2(), errorLog);

        System.out.println("Our device can work: " + canWork);
        if (!canWork)
            System.out.println("The reason why can't work is:\n" + errorLog);

    }

}
