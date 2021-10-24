package main.java.com.apiats21.javacore.patterns.creational.abstractfactory.website;

import main.java.com.apiats21.javacore.patterns.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
