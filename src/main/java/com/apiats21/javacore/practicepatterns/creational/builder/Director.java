package main.java.com.apiats21.javacore.practicepatterns.creational.builder;

public class Director {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar() {
        builder.createCar();
        builder.setBody();
        builder.setModel();
        builder.setMaxPrice();

        Car car = builder.getCar();

        return car;
    }
}
