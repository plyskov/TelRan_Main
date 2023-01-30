package task_06.subtask06;

class Device {

    private double temperature1, temperature2;

    Device(double temperature1, double temperature2) {
        this.temperature1 = temperature1;
        this.temperature2 = temperature2;
    }

    double getTemperature1() {
        return temperature1;
    }

    void setTemperature1(double temperature1) {
        this.temperature1 = temperature1;
    }

    double getTemperature2() {
        return temperature2;
    }

    void setTemperature2(double temperature2) {
        this.temperature2 = temperature2;
    }

}
