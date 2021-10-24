package main.java.com.apiats21.javacore.patterns.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());

    }
}

interface Developer{
    String makeJob();
}

class JavaDeveloper implements Developer{
    @Override
    public String makeJob() {
        return "Write Java code";
    }
}
