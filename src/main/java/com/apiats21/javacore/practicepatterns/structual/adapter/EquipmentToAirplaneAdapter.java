package main.java.com.apiats21.javacore.practicepatterns.structual.adapter;

public class EquipmentToAirplaneAdapter extends Airplane implements Equipment {
    @Override
    public void running() {
        operating();
    }

    @Override
    public void operate() {
        controlling();
    }

    @Override
    public void parking() {
        staging();
    }
}
