package main.java.com.apiats21.javacore.practicepatterns.creational.factory;

public class ResidentialPlanFactory implements PlanFactory{
    @Override
    public Plan createPlan() {
        return new ResidentialPlan();
    }
}
