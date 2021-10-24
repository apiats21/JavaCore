package main.java.com.apiats21.javacore.patterns.creational.abstractfactory.website;

import main.java.com.apiats21.javacore.patterns.creational.abstractfactory.Developer;
import main.java.com.apiats21.javacore.patterns.creational.abstractfactory.ProjectManager;
import main.java.com.apiats21.javacore.patterns.creational.abstractfactory.ProjectTeamFactory;
import main.java.com.apiats21.javacore.patterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
