package main.java.com.apiats21.javacore.patterns.creational.abstractfactory.banking;

import main.java.com.apiats21.javacore.patterns.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages banking project");
    }
}
