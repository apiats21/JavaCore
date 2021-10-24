package main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.paris;

import main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.Excursion;
import main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.Hotel;
import main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.Ticket;
import main.java.com.apiats21.javacore.practicepatterns.creational.abstractfactory.TripFactory;

public class ParisTripFactory implements TripFactory {
    @Override
    public Ticket getTicket() {
        return new FlightToParis();
    }

    @Override
    public Hotel getHotel() {
        return new HotelInParis();
    }

    @Override
    public Excursion getExcursion() {
        return new ExcursionInParis();
    }
}
