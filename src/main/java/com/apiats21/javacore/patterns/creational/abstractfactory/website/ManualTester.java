package main.java.com.apiats21.javacore.patterns.creational.abstractfactory.website;

import main.java.com.apiats21.javacore.patterns.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website code...");
    }
}
