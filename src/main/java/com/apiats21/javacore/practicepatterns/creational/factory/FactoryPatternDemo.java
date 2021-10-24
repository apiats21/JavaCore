package main.java.com.apiats21.javacore.practicepatterns.creational.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        PlanFactory planFactory = createPlanFactoryByCustomerType("senior");
        Plan plan = planFactory.createPlan();

        plan.calculateRate();
    }

    static PlanFactory createPlanFactoryByCustomerType(String planType) {
        if (planType.equalsIgnoreCase("commercial")) {
            return new CommercialPlanFactory();
        } else if (planType.equalsIgnoreCase("senior")) {
            return new SeniorPlanFactory();
        } else if (planType.equalsIgnoreCase("residential")) {
            return new ResidentialPlanFactory();
        } else {
            throw new RuntimeException("Plan " + planType + " does not exist");
        }
    }
}
