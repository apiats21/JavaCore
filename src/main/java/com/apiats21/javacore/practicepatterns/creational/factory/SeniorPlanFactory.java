package main.java.com.apiats21.javacore.practicepatterns.creational.factory;

public class SeniorPlanFactory implements PlanFactory{
    @Override
    public Plan createPlan() {
        return new SeniorPlan();
    }
}
