package main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.paris;

import main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.Excursion;

public class ExcursionInParis implements Excursion {
    @Override
    public void bookExcursion() {
        System.out.println("Excursion to Eiffel tower.");
    }
}
