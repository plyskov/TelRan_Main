package task_06.subtask06;

class DeviceUtil {

    Device createDevice(double temperature1, double temperature2) {
        return new Device(temperature1, temperature2);
    }

    boolean checkDevice(double temperature1, double temperature2, StringBuffer errorLog) {

        boolean canWork = true;

        if (temperature1 <= 100) {
            canWork = false;
            addToLog(errorLog, "Temperature of flask 1 is only " + temperature1 + ", but required >100");
        }
        if (temperature2 >= 100) {
            canWork = false;
            addToLog(errorLog, "Temperature of flask 2 is " + temperature2 + ", but required <100");
        }

        return canWork;

    }

    private void addToLog(StringBuffer errorLog, String messageToAdd) {

        if (errorLog.length() > 0) {
            errorLog.append("\n");
        }

        errorLog.append(messageToAdd);
    }

}
