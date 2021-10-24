package main.java.com.apiats21.javacore.patterns.creational.abstractfactory.banking;

import main.java.com.apiats21.javacore.patterns.creational.abstractfactory.Developer;
import main.java.com.apiats21.javacore.patterns.creational.abstractfactory.ProjectManager;
import main.java.com.apiats21.javacore.patterns.creational.abstractfactory.ProjectTeamFactory;
import main.java.com.apiats21.javacore.patterns.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM() {
        };
    }
}
