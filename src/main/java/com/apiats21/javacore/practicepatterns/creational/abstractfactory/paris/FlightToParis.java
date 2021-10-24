package main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.paris;

import main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.Ticket;

public class FlightToParis implements Ticket {
    @Override
    public void bookTicket() {
        System.out.println("Ticket to paris booked.");
    }
}
