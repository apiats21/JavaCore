package main.java.com.apiats21.javacore.patterns.creational.abstractfactory.banking;

import main.java.com.apiats21.javacore.patterns.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");

    }
}
