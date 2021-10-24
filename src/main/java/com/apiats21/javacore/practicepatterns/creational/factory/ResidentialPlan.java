package main.java.com.apiats21.javacore.practicepatterns.creational.factory;

public class ResidentialPlan implements Plan{
    @Override
    public void calculateRate() {
        System.out.println("Residential plan rate is $30/month.");
    }
}
