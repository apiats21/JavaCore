package main.java.com.apiats21.javacore.practicepatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverDemo {
    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();

        station.addObserver(new ConcreteObserver("Station 1"));
        station.addObserver(new ConcreteObserver("Station 2"));
        station.addObserver(new ConcreteObserver("Station 3"));
        station.addObserver(new ConcreteObserver("Station 5"));


        station.setTemperature(27);
        station.notifyObservers();

    }
}

interface Observed {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

interface Observer {
    void handleEvent(int temp);
}

class MeteoStation implements Observed{
    public int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers) {
            o.handleEvent(temperature);
        }
    }
}

class ConcreteObserver implements Observer {
    String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(int temp) {
        System.out.println(name + ": Temp changed..." + temp);
    }
}












