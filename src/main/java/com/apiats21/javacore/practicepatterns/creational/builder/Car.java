package main.java.com.apiats21.javacore.practicepatterns.creational.builder;

public class Car {
    private String model;
    private Body body;
    private int maxValue;

    public void setModel(String model) {
        this.model = model;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + model + '\'' +
                ", body=" + body +
                ", maxValue=" + maxValue +
                '}';
    }
}
