package main.java.com.apiats21.javacore.practicepatterns.creational.factory;

public class CommercialPlanFactory implements PlanFactory{
    @Override
    public Plan createPlan() {
        return new CommercialPlan();
    }
}
