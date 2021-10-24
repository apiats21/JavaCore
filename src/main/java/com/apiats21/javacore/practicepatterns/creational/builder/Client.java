package main.java.com.apiats21.javacore.practicepatterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new NissanBuilder());
        Car car = director.buildCar();

        System.out.println(car);


    }
}
