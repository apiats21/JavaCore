package main.java.com.apiats21.javacore.practicepatterns.structual.adapter;

public class Client {
    public static void main(String[] args) {
        Equipment equipment = new EquipmentToAirplaneAdapter();
        equipment.running();
        equipment.operate();
        equipment.parking();
    }
}
