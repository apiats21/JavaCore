package main.java.com.apiats21.javacore.practicepatterns.creational.builder;

public class ToyotaBuilder extends CarBuilder {
    @Override
    void setModel() {
        car.setModel("Toyota");
    }

    @Override
    void setBody() {
        car.setBody(Body.SEDAN);
    }

    @Override
    void setMaxPrice() {
        car.setMaxValue(10000);
    }
}
