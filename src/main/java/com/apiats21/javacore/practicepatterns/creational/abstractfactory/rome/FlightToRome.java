package main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.rome;

import main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.Ticket;

public class FlightToRome implements Ticket {
    @Override
    public void bookTicket() {
        System.out.println("Ticket to Rome is booked");
    }
}
