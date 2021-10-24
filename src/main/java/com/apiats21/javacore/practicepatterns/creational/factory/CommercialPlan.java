package main.java.com.apiats21.javacore.practicepatterns.creational.factory;

public class CommercialPlan implements Plan{
    @Override
    public void calculateRate() {
        System.out.println("Commercial plate rate is $50/month.");
    }
}
