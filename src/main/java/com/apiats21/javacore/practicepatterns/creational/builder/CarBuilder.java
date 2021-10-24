package main.java.com.apiats21.javacore.practicepatterns.creational.builder;

public abstract class CarBuilder {
    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void setModel();

    abstract void setBody();

    abstract void setMaxPrice();

    Car getCar() {
        return car;
    }
}
