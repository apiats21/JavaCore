package main.java.com.apiats21.javacore.practicepatterns.creational.factory;

public class SeniorPlan implements Plan {
    @Override
    public void calculateRate() {
        System.out.println("Senior citizen plan rate is $15/months.");
    }
}
