package main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.rome;

import main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.Excursion;

public class ExcursionInRome implements Excursion {
    @Override
    public void bookExcursion() {
        System.out.println("Excursion to Coliseum");
    }
}
