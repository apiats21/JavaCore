package main.java.com.apiats21.javacore.patterns.structural.decorator;

public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    String sendWeeklyReport(){
        return ". Send customer report.";
    }


    @Override
    public String makeJob() {
        return super.makeJob() + sendWeeklyReport();
    }
}
