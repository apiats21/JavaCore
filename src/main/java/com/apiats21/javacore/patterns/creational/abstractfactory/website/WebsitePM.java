package main.java.com.apiats21.javacore.patterns.creational.abstractfactory.website;

import main.java.com.apiats21.javacore.patterns.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project");
    }
}
