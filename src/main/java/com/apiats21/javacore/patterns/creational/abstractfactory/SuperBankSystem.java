package main.java.com.apiats21.javacore.patterns.creational.abstractfactory;

import main.java.com.apiats21.javacore.patterns.creational.abstractfactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester qaTester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system");
        developer.writeCode();
        qaTester.testCode();
        projectManager.manageProject();


    }
}
