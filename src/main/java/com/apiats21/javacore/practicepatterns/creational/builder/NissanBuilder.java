package main.java.com.apiats21.javacore.practicepatterns.creational.builder;

public class NissanBuilder extends CarBuilder {
    @Override
    void setModel() {
        car.setModel("Nissan");
    }

    @Override
    void setBody() {
        car.setBody(Body.SUV);
    }

    @Override
    void setMaxPrice() {
        car.setMaxValue(8000);
    }
}
