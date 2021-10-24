package main.java.com.apiats21.javacore.patterns.creational.abstractfactory;

import main.java.com.apiats21.javacore.patterns.creational.abstractfactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester manualTester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating auction website");
        developer.writeCode();
        manualTester.testCode();
        projectManager.manageProject();
    }
}
